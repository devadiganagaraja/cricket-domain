package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.EventPlayerPointsAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventPlayerPointsRepository extends MongoRepository<EventPlayerPointsAggregate, String> {
}
