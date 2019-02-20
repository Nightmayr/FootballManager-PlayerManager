package com.qa.player.service;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	public Boolean setPlaying(String isPlaying) {
		return "false".equalsIgnoreCase(isPlaying) ? true : false;
	} 

}