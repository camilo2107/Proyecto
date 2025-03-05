package com.example.services;

import com.example.models.Match;
import java.util.ArrayList;
import java.util.List;

public class MatchService {
    private List<Match> matches;

    public MatchService() {
        this.matches = new ArrayList<>();
    }

    public void recordMatch(Match match) {
        matches.add(match);
    }

    public List<Match> getAllMatches() {
        return matches;
    }

    public Match getMatchById(int id) {
        for (Match match : matches) {
            if (match.getId() == id) {
                return match;
            }
        }
        return null;
    }

    public void updateMatch(int id, Match updatedMatch) {
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).getId() == id) {
                matches.set(i, updatedMatch);
                return;
            }
        }
    }

    public void deleteMatch(int id) {
        matches.removeIf(match -> match.getId() == id);
    }
}