package com.tka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Team;
import com.tka.service.TeamService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/team")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("add")
	public String addTeam(@RequestBody Team team) {

		System.out.println(team);
		String msg = teamService.addTeam(team);
		return msg;
	}

	@GetMapping("allteams")
	public List<Team> getAllTeams() {

		List<Team> teams = teamService.getAllTeams();
		return teams;
	}

	@GetMapping("{id}")
	public Object getTeamById(@PathVariable int id) {

		return teamService.getTeamById(id);
	}

	@PutMapping("update/{id}")
	public String updateTeam(@PathVariable int id, @RequestBody Team team) {

		String updateMsg = teamService.updateTeam(id, team);
		return updateMsg;
	}

	@DeleteMapping("delete/{id}")
	public String deleteTeam(@PathVariable int id) {

		String dltMsg = teamService.deleteTeam(id);

		return dltMsg;
	}
}
