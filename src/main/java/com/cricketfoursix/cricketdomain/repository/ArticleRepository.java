package com.cricketfoursix.cricketdomain.repository;

import com.cricketfoursix.cricketdomain.aggregate.ArticleAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ArticleRepository extends MongoRepository<ArticleAggregate, Long>, QuerydslPredicateExecutor<ArticleAggregate> {
}
