package com.pagerduty.services.impls;

import com.pagerduty.models.Team;
import com.pagerduty.models.TeamDeveloper;

public interface TeamService {

    Boolean createTeam(TeamDeveloper teamDeveloper);
}
