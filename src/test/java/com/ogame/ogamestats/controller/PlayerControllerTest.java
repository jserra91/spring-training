package com.ogame.ogamestats.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ogame.ogamestats.api.PlayerController;
import com.ogame.ogamestats.input.PlayerBean;
import com.ogame.ogamestats.service.IPlayerService;


@ExtendWith(SpringExtension.class)
@WebMvcTest(PlayerController.class)
public class PlayerControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@MockBean
	private IPlayerService service;

	@Test
	public void addPlayers() throws Exception {
		PlayerBean p = new PlayerBean();
		p.setId("UK569874123");
		p.setName("Jordi");
		
		ResultActions result = mvc.perform(post("/api/v1/player/save")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content(objectMapper.writeValueAsString(p)))
		        .andExpect(status().isOk());
		// .andExpect(status().isBadRequest()); <-- cuando es 500
		
		
	}
}
