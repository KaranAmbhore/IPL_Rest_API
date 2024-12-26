package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Player;

@Repository
public class PlayerDao {

	private final List<Player> players = new ArrayList<Player>();

	public String addPlayer(Player player) {

		players.add(player);
		return "Player Added Successfully...";
	}

	public List<Player> getAllPlayers() {

		return players;
	}

	public Object getPlayerById(int id) {
		
		for (Player player : players) {
			if(player.getPlayerId()==id) {
				return player;
			}
		}
		
		return "Player Not Found";
	}

	public String updatePlayer(int id, Player player) {

		for(int i = 0; i< players.size(); i++) {
			if(players.get(i).getPlayerId()==id) {
				players.set(i, player);
				return "Player Updated Successfully...";
			}
		}
		return "Couldn't Update Player. Something went wrong...";
	}
	
	
	public String deletePlayer(int id) {
		
		for(int i = 0; i< players.size(); i++) {
			if(players.get(i).getPlayerId()==id) {
				players.remove(i);
				return "Player deleted successfully...";
			}
		}
		return "Couldn't delete player. Something went wrong...";
	}
}
