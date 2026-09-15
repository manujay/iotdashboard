/**
 *
 */
package com.revolut.iotdashboard.jpa.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revolut.iotdashboard.dto.EventInfo;
import com.revolut.iotdashboard.jpa.EventTypeRepository;
import com.revolut.iotdashboard.jpa.records.EventType;

/**
 *
 */
@Service
public class EventTypeServiceImpl implements EventTypeService {

	private EventTypeRepository repository;

	@Autowired
	public EventTypeServiceImpl(EventTypeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void addEvent(EventInfo ei) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEvents(List<EventInfo> lei) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEvent(String device_uid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEvents(List<String> device_uids) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EventInfo> fetchAllEventInfo(String device_uname) {
		Optional<List<EventType>> results = repository.findAllById(device_uname);

		List<EventInfo> info = results.orElse(Collections.emptyList()).stream()
				.map(e -> new EventInfo(e.getId().toString(), e.getDevice_unique_id(), e.getDevice_unique_name(),
						e.getDevice_battery_percentage(), e.getDevice_uptime_ms().longValue(),
						e.getDevice_last_known_loc_lat(), e.getDevice_last_known_loc_lng()))
				.collect(Collectors.toList());

		return info;
	}

}
