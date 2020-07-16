package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.BBBAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface BallRepository extends MongoRepository<BBBAggregate, String>, QuerydslPredicateExecutor<BBBAggregate> {
    @Query("{'ballSummary.eventId': ?0}")
    List<BBBAggregate> findByEventId(String eventId);

}

