package com.qa.player.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.player.service.PlayerService;

@RequestMapping("${path.base}")
@RestController
public class PlayerRest {
	
	@Autowired
	private PlayerService service;
	
	@PutMapping("${path.setPlaying}")
	public Boolean setPlaying(@RequestBody String player) {
		return service.setPlaying(player);
	}

}
