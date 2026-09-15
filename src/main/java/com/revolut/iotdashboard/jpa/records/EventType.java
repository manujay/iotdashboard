package com.revolut.iotdashboard.jpa.records;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "event_type", uniqueConstraints = @UniqueConstraint(columnNames = { "dvc_uid", "dvc_unme" }))
@SqlResultSetMapping(name = "GetAllEventsResult", classes = {
		@ConstructorResult(targetClass = EventType.class, columns = { @ColumnResult(name = "Id", type = String.class),
				@ColumnResult(name = "dvc_uid", type = String.class),
				@ColumnResult(name = "dvc_unme", type = String.class),
				@ColumnResult(name = "dvc_srl_nmbr", type = String.class),
				@ColumnResult(name = "dvc_bry_prtg", type = String.class),
				@ColumnResult(name = "dvc_uptm_ms", type = String.class),
				@ColumnResult(name = "dvc_lst_kwn_loc_lat", type = String.class),
				@ColumnResult(name = "dvc_lst_knw_loc_lng", type = String.class) }) })

public class EventType {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long Id;
	@Column(name = "dvc_uid", nullable = false)
	private String device_unique_id;
	@Column(name = "dvc_unme", nullable = false)
	private String device_unique_name;
	@Column(name = "dvc_srl_nmbr", nullable = false)
	private String device_unique_sn;
	@Column(name = "dvc_bry_prtg")
	private Double device_battery_percentage;
	@Column(name = "dvc_uptm_ms")
	private Long device_uptime_ms;
	@Column(name = "dvc_lst_kwn_loc_lat")
	private Double device_last_known_loc_lat;
	@Column(name = "dvc_lst_knw_loc_lng")
	private Double device_last_known_loc_lng;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EventType)) {
			return false;
		}
		EventType other = (EventType) obj;
		return Objects.equals(Id, other.Id)
				&& Objects.equals(device_battery_percentage, other.device_battery_percentage)
				&& Objects.equals(device_last_known_loc_lat, other.device_last_known_loc_lat)
				&& Objects.equals(device_last_known_loc_lng, other.device_last_known_loc_lng)
				&& Objects.equals(device_unique_id, other.device_unique_id)
				&& Objects.equals(device_unique_name, other.device_unique_name)
				&& Objects.equals(device_unique_sn, other.device_unique_sn)
				&& Objects.equals(device_uptime_ms, other.device_uptime_ms);
	}

	public Double getDevice_battery_percentage() {
		return device_battery_percentage;
	}

	public Double getDevice_last_known_loc_lat() {
		return device_last_known_loc_lat;
	}

	public Double getDevice_last_known_loc_lng() {
		return device_last_known_loc_lng;
	}

	public String getDevice_unique_id() {
		return device_unique_id;
	}

	public String getDevice_unique_name() {
		return device_unique_name;
	}

	public String getDevice_unique_sn() {
		return device_unique_sn;
	}

	public Long getDevice_uptime_ms() {
		return device_uptime_ms;
	}

	public Long getId() {
		return Id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, device_battery_percentage, device_last_known_loc_lat, device_last_known_loc_lng,
				device_unique_id, device_unique_name, device_unique_sn, device_uptime_ms);
	}

	public void setDevice_battery_percentage(Double device_battery_percentage) {
		this.device_battery_percentage = device_battery_percentage;
	}

	public void setDevice_last_known_loc_lat(Double device_last_known_loc_lat) {
		this.device_last_known_loc_lat = device_last_known_loc_lat;
	}

	public void setDevice_last_known_loc_lng(Double device_last_known_loc_lng) {
		this.device_last_known_loc_lng = device_last_known_loc_lng;
	}

	public void setDevice_unique_id(String device_unique_id) {
		this.device_unique_id = device_unique_id;
	}

	public void setDevice_unique_name(String device_unique_name) {
		this.device_unique_name = device_unique_name;
	}

	public void setDevice_unique_sn(String device_unique_sn) {
		this.device_unique_sn = device_unique_sn;
	}

	public void setDevice_uptime_ms(Long device_uptime_ms) {
		this.device_uptime_ms = device_uptime_ms;
	}

	public void setId(Long id) {
		Id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EventType [Id=").append(Id).append(", device_unique_id=").append(device_unique_id)
				.append(", device_unique_name=").append(device_unique_name).append(", device_unique_sn=")
				.append(device_unique_sn).append(", device_battery_percentage=").append(device_battery_percentage)
				.append(", device_uptime_ms=").append(device_uptime_ms).append(", device_last_known_loc_lat=")
				.append(device_last_known_loc_lat).append(", device_last_known_loc_lng=")
				.append(device_last_known_loc_lng).append("]");
		return builder.toString();
	}

}
