package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.GamePlayerPointsAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GamePlayerPointsRepository extends MongoRepository<GamePlayerPointsAggregate, Long> {
}
