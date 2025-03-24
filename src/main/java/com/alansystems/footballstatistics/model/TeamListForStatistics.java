package com.alansystems.footballstatistics.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class TeamListForStatistics {
    @JsonProperty("teams")
    private List<String> teams;


}
