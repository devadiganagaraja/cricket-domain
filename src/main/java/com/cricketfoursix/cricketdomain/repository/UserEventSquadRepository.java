package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.UserEventSquadAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEventSquadRepository extends MongoRepository<UserEventSquadAggregate, String> {
}
