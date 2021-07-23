package com.pagerduty.controller;

import com.pagerduty.models.TeamDeveloper;
import com.pagerduty.services.impls.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/teams")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createTeam(@RequestBody() TeamDeveloper teamDeveloper) {
        return ResponseEntity.status(HttpStatus.CREATED).body(teamService.createTeam(teamDeveloper));
    }
}
