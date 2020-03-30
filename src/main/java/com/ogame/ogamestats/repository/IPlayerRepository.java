package com.ogame.ogamestats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ogame.ogamestats.entity.Player;

@Repository
public interface IPlayerRepository extends JpaRepository<Player, Long> {

	Player findById(long id);
	
	Player findByIdPlayer(String id);
}
