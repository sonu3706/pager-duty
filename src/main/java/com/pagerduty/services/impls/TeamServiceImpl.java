package com.pagerduty.services.impls;

import com.pagerduty.exceptions.TeamException;
import com.pagerduty.models.Developer;
import com.pagerduty.models.TeamDeveloper;
import com.pagerduty.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    @Override
    public Boolean createTeam(TeamDeveloper teamDeveloper) {
        Optional<TeamDeveloper> teamDeveloperOptional = teamRepository.findByTeamId(teamDeveloper.getTeamId());
        if (teamDeveloperOptional.isPresent()) {
            throw new TeamException.TeamAlreadyExistException("Team Already exists with id: " + teamDeveloperOptional.get().getTeamId());
        } else {
            teamDeveloper.getDevelopers().forEach(developer -> {
                developer.setId(UUID.randomUUID().toString());
            });
            teamRepository.save(teamDeveloper);
        }
        return Boolean.TRUE;
    }
}
