package com.ogame.ogamestats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogame.ogamestats.entity.Player;
import com.ogame.ogamestats.input.PlayerBean;
import com.ogame.ogamestats.output.OPlayer;
import com.ogame.ogamestats.repository.IPlayerRepository;

@Service
public class PlayerService implements IPlayerService {
	
	@Autowired
	private IPlayerRepository playerDao;

	@Override
	public OPlayer addPlayer(PlayerBean player) {
		Player p = new Player();
		p.setIdplayer(player.getId());
		p.setName(player.getName());
		p = playerDao.save(p);
		OPlayer output = new OPlayer();
		output.setId(p.getId());
		output.setIdPrivate(p.getIdplayer());
		output.setName(p.getName());
		return output;
	}

	@Override
	public OPlayer getPlayerByPrivateId(String id) {
		Player p = playerDao.findByIdPlayer(id);
		OPlayer output = new OPlayer(p.getId(), p.getIdplayer(), p.getName());
		return output;
	}
}
