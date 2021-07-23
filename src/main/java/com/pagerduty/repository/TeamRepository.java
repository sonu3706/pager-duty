package com.pagerduty.repository;

import com.pagerduty.models.TeamDeveloper;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TeamRepository extends MongoRepository<TeamDeveloper, String> {
    Optional<TeamDeveloper> findByTeamId(String teamId);
}
