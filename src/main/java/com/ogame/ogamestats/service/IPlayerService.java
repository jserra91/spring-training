package com.ogame.ogamestats.service;

import com.ogame.ogamestats.input.PlayerBean;
import com.ogame.ogamestats.output.OPlayer;

public interface IPlayerService {
	
	public OPlayer addPlayer(PlayerBean player);

	public OPlayer getPlayerByPrivateId(String id);
}
