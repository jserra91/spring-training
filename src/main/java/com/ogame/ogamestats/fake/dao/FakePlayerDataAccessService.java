package com.ogame.ogamestats.fake.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ogame.ogamestats.input.PlayerBean;

@Repository("fakePlayer")
public class FakePlayerDataAccessService implements IPlayerDao {
	
	private static List<PlayerBean> DB = new ArrayList<PlayerBean>();
	
	@Override
	public int insertPlayer(PlayerBean player) {
		DB.add(player);
		return 1;
	}

	@Override
	public PlayerBean getPlayer(String id) {
		PlayerBean player = new PlayerBean();

		for (PlayerBean n : DB) {
			if (id.equals(n.getId())) {
				player = n;
			}
		}
		
		return player;
	}
}
