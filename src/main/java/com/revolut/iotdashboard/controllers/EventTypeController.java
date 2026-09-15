package com.revolut.iotdashboard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revolut.iotdashboard.dto.EventInfo;
import com.revolut.iotdashboard.jpa.services.EventTypeService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@ApiResponse(content = {}, description = "List of all devices for device_name", headers = {}, responseCode = "200")
public class EventTypeController {

	private EventTypeService eventService;

	@Autowired
	public EventTypeController(EventTypeService eventService) {
		this.eventService = eventService;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/fetchEventTypesByDeviceName")
	public ResponseEntity<List<EventInfo>> fetchAllEventTypesByUniqueName(@RequestParam String deviceName) {
		return ResponseEntity.ok(eventService.fetchAllEventInfo(deviceName));
	}

}
