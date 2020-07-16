package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.GameAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GameRepository extends MongoRepository<GameAggregate, Long>, QuerydslPredicateExecutor<GameAggregate> {
}
