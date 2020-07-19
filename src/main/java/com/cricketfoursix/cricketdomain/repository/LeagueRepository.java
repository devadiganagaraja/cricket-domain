package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.LeagueAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeagueRepository  extends MongoRepository<LeagueAggregate, Long > {
}