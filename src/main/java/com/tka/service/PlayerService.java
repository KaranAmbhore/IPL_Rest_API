package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PlayerDao;
import com.tka.model.Player;

@Service
public class PlayerService {

	@Autowired
	private PlayerDao playerDao;

	public String addPlayer(Player player) {

		String addMsg = playerDao.addPlayer(player);

		return addMsg;
	}

	public List<Player> getAllPlayers() {

		return playerDao.getAllPlayers();
	}

	public Object getPlayerById(int id) {

		return playerDao.getPlayerById(id);
		
	}

	public String updatePlayer(int id, Player player) {

		return playerDao.updatePlayer(id,player);
	}

	
	public String deletePlayer(int id) {
		
		return playerDao.deletePlayer(id);
	}
}
