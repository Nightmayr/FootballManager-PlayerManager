package com.qa.player.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.player.service.PlayerService;

@RequestMapping("${path.base}")
@RestController
public class PlayerRest {
	
	@Autowired
	private PlayerService service;
	
	@GetMapping("${path.setPlaying}")
	public Boolean setPlaying(@PathVariable String isPlaying) {
		return service.setPlaying(isPlaying);
	}

}
