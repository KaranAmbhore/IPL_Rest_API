package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Match;
import com.tka.service.MatchService;



@RestController
@RequestMapping("api/match")
public class MatchController {

	@Autowired
	private MatchService matchService;

	@PostMapping("add")
	public String addMatch(@RequestBody Match match) {

		return matchService.addMatch(match);

	}
	
	
	@GetMapping("allmatches")
	public List<Match> getAllMatches() {
		
		return matchService.getAllMatches();
	}
	
	@GetMapping("{id}")
	public Object getMatchById(@PathVariable int id) {
		return matchService.getMatchById(id);
	}
	
	
	@PutMapping("update/{id}")
	public String updateMatch(@PathVariable int id, @RequestBody Match match) {
		
		return matchService.updateMatch(id,match);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteMatch(@PathVariable int id) {
		return matchService.deleteMatch(id);
		
	}
	
	
}
