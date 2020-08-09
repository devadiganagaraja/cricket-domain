package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.LeagueIndexAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface LeagueIndexRepository extends MongoRepository<LeagueIndexAggregate, Long>, QuerydslPredicateExecutor<LeagueIndexAggregate> {
}
