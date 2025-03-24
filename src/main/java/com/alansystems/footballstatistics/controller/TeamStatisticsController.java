package com.alansystems.footballstatistics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/statistics")
public class TeamStatisticsController {

@GetMapping
    public String getFootballStatistics(@RequestParam List<String> teams) {
 return "default statistic:" +
         "Barcelona WWL 4.33 6 5 11 4";
}
}
