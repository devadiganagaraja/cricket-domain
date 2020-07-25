package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.TeamAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TeamRepository extends MongoRepository<TeamAggregate, Long>, QuerydslPredicateExecutor<TeamAggregate> {
}
