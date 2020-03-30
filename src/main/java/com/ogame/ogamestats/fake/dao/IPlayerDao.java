package com.ogame.ogamestats.fake.dao;

import com.ogame.ogamestats.input.PlayerBean;

public interface IPlayerDao {
	
	int insertPlayer(PlayerBean player);
	
	PlayerBean getPlayer(String id);
}
