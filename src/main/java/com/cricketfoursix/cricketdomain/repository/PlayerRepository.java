package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.PlayerAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PlayerRepository  extends MongoRepository<PlayerAggregate, Long>, QuerydslPredicateExecutor<PlayerAggregate> {
}
