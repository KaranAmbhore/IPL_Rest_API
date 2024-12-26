package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Player;
import com.tka.service.PlayerService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/player")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@PostMapping("add")
	public String addPlayer(@RequestBody Player player) {

		String addMsg = playerService.addPlayer(player);

		return addMsg;

	}

	@GetMapping("allplayers")
	public List<Player> getAllPlayers() {

		List<Player> players = playerService.getAllPlayers();
		return players;
	}

	@GetMapping("{id}")
	public Object getPlayerById(@PathVariable int id) {

		return playerService.getPlayerById(id);
	}
	
	
	@PutMapping("update/{id}")
	public String updatePlayer(@PathVariable int id,@RequestBody Player player) {
		
		
		return playerService.updatePlayer(id,player);
	}
	
	@DeleteMapping("delete/{id}")
	public String deletePlayer(@PathVariable int id) {
		
		return playerService.deletePlayer(id);
	}
	
}
