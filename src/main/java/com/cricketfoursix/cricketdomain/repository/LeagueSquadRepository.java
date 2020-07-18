package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.LeagueSquadAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeagueSquadRepository extends MongoRepository<LeagueSquadAggregate, String > {
}
