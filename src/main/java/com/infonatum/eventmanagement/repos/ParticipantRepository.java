package com.infonatum.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.infonatum.eventmanagement.entities.Event;

public interface ParticipantRepository extends CrudRepository<Event, Long>{

}