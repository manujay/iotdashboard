package com.revolut.iotdashboard.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revolut.iotdashboard.jpa.records.EventType;

import jakarta.persistence.NamedNativeQuery;

@Repository
@NamedNativeQuery(name = "EventTypes", query = "select e.dvc_uid, e.dvc_unme, e.dvc_srl_nmbr, e.dvc_bry_prtg, e.dvc_uptm_ms, e.dvc_lst_kwn_loc_lat, e.dvc_lst_knw_loc_lng from event_type e where e.device_unique_name = :device_unique_name", resultSetMapping = "GetAllEventsResult")
public interface EventTypeRepository extends JpaRepository<EventType, Long> {

	@Query(name = "EventTypes")
	Optional<List<EventType>> findAllById(String device_unique_name);

}
