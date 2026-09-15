package com.revolut.iotdashboard.jpa.services;

import java.util.List;

import com.revolut.iotdashboard.dto.EventInfo;

public interface EventTypeService {

	public void addEvent(EventInfo ei);

	public void addEvents(List<EventInfo> lei);

	public void deleteEvent(String device_uid);

	public void deleteEvents(List<String> device_uids);

	public List<EventInfo> fetchAllEventInfo(String device_uname);

}
