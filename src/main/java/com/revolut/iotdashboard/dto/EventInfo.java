package com.revolut.iotdashboard.dto;

public record EventInfo(String id, String udid, String dname, double battery, long duptime, double dlat, double dlng) {

}
