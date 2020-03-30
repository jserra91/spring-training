package com.ogame.ogamestats.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogame.ogamestats.input.PlayerBean;
import com.ogame.ogamestats.output.OPlayer;
import com.ogame.ogamestats.service.IPlayerService;

@RequestMapping("api/v1/player")
@RestController
public class PlayerController {

	@Autowired
	private IPlayerService service;
	
	@PostMapping("/save")
	public OPlayer addPlayer(@Valid @RequestBody PlayerBean player) {
		return this.service.addPlayer(player);
	}
	
	@GetMapping("/{id}")
	public OPlayer getPlayer(@PathVariable("id") String id) {
		return this.service.getPlayerByPrivateId(id);
	}
}
