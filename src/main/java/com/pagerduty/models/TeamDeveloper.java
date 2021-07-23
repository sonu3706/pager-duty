package com.pagerduty.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TeamDeveloper {
    @Id
    private String teamId;
    private String name;
    private List<Developer> developers;
}
