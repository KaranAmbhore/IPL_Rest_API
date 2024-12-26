package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.model.Match;

@Repository
@RequestMapping("api/match")
public class MatchDao {

	private final List<Match> matches = new ArrayList<Match>();

	public String addMatch(Match match) {

		matches.add(match);
		return "Match Added Successfully....";
	}

	public List<Match> getAllMatches() {

		return matches;
	}

	public Object getMatchById(int id) {

		for (Match match : matches) {
			if (match.getMatchId() == id) {
				return match;
			}
		}

		return "Match Not Found in Schedule";
	}

	public String updateMatch(int id, Match match) {

		for (int i = 0; i < matches.size(); i++) {
			if (matches.get(i).getMatchId() == id) {
				matches.set(i, match);
				return "Match Updated Successfully...";
			}
		}

		return "Couldn't update match.Something went wrong...";
	}

	public String deleteMatch(int id) {

		for(int i = 0; i< matches.size(); i++) {
			if(matches.get(i).getMatchId()==id) {
				matches.remove(i);
				return "Match deleted successfully...";
			}
		}
		
		return "Couldn't delete match. Something went wrong...";
	}

}
