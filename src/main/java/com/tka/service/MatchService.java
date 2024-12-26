package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.dao.MatchDao;
import com.tka.model.Match;

@Service
@RequestMapping("api/match")
public class MatchService {

	
	@Autowired
	private MatchDao matchDao;
	
	public String addMatch(Match match) {

		return matchDao.addMatch(match);
	}

	public List<Match> getAllMatches() {
		return matchDao.getAllMatches();
	}

	public Object getMatchById(int id) {

		return matchDao.getMatchById(id);
	}

	public String updateMatch(int id, Match match) {
		return matchDao.updateMatch(id,match);
	}

	public String deleteMatch(int id) {
		return matchDao.deleteMatch(id);
	}

}
