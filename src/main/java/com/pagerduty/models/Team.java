package com.pagerduty.models;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Team {

    private Integer id;
    private String name;
}
