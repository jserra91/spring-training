package com.ogame.ogamestats.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ogame.ogamestats.entity.Player;
import com.ogame.ogamestats.output.OPlayer;
import com.ogame.ogamestats.repository.IPlayerRepository;

@ExtendWith(SpringExtension.class)
public class PlayerServiceImplIntegrationTest {

	@TestConfiguration
	static class PlayerServiceImplIntegrationTestContextConfiguration {
		
		@Bean
		public IPlayerService playerService() {
			return new PlayerService();
		}
	}
	
	@Autowired
	private IPlayerService playerService;
	
	@MockBean
	private IPlayerRepository playerRepository;
	
	@BeforeEach
	public void setUp() {
		Player p = new Player();
		p.setId(1);
		p.setIdplayer("UK987654321");
		p.setName("Jorge");
		
		Mockito.when(playerRepository.findByIdPlayer(p.getIdplayer())).thenReturn(p);
	}
	
	@Test
	public void whenValidateName() {
	    String id = "UK987654321";
	    OPlayer found = playerService.getPlayerByPrivateId(id);
	  
	    assertThat(found.getIdPrivate()).isEqualTo(id);
	 }
}
