package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Team;

@Repository
public class TeamDao {

	List<Team> teams = new ArrayList<>();

	public TeamDao() {

	teams.add(new Team(1, "MI", "Mumbai", "Mahela Jayawardene"));
	teams.add(new Team(2, "CSK", "Chennai", "Dwayne Bravo"));
	teams.add(new Team(3, "RCB", "Banglore", "Andy Flower"));
	}
	
	public String addTeam(Team team) {

		teams.add(team);
		return "Team Added Successfully...";
	}


	public List<Team> getAllTeams() {

		List<Team> team = teams;
		return team;
	}


	public Object getTeamById(int id) {

		for (Team team : teams) {
			if(team.getTeamId()==id) {
				return team;
			}
		}
		return "Team Not Found";
	}


	public String updateTeam(int id,Team team) {

		for(int i = 0; i < teams.size(); i++) {
			if(teams.get(i).getTeamId()==id) {
				teams.set(i,team);
				return "Team Updated Successully....";
			}
		}
		return "Couldn't update team. Something went wrong...";
	}

	public String deleteTeam(int id) {
		
		for(int i = 0; i < teams.size(); i++) {
			if(teams.get(i).getTeamId()==id) {
				teams.remove(i);
				return "Team Deleted Successfully....";
			}
		}
		
		return "Couldn't delete team. Something went wrong....";
	}
	
	public int deleteTeamInt(int id) {
		
		for(int i = 0; i < teams.size(); i++) {
			if(teams.get(i).getTeamId()==id) {
				teams.remove(i);
				return 1;
			}
		}
		
		return 0;
	}
	
}
