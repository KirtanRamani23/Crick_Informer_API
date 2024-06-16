package com.crick.apis.services;

import com.crick.apis.entities.Match;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public interface MatchService {

    //    Get all Matches
    List<Match> getAllMatches();



    //    Get Live Matches
    List<Match> getLiveMatches();




    //    Get Point table
    List<List<String>> getPointTable();
}
