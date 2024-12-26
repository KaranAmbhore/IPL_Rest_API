package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.TeamDao;
import com.tka.model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;
	
	public String addTeam(Team team) {

		String msg = teamDao.addTeam(team);		
		return msg;
	}

	public List<Team> getAllTeams() {

		List<Team> teams = teamDao.getAllTeams();
		
		return teams;
	}

	public Object getTeamById(int id) {

		return teamDao.getTeamById(id);
	}

	public String updateTeam(int id, Team team) {

		String updateMsg = teamDao.updateTeam(id,team);
		return updateMsg;
	}

	public String deleteTeam(int id) {
		
		int status = teamDao.deleteTeamInt(id);
		String dltMsg ;
//		String dltMsg = teamDao.deleteTeam(id);
		
		if(status == 1) {
			dltMsg = "Team Deleted Successfully..";
		return dltMsg;
		}else {
		dltMsg  = "Team Not Found";
		return dltMsg; 
		}
		
	}
	
}
