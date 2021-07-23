package com.pagerduty.models;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Developer {
    private String id;
//    private Integer teamId;
    private String name;
    private Long phoneNumber;
}
