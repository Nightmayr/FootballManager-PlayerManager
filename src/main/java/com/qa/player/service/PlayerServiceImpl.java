package com.qa.player.service;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	public Boolean setPlaying(String isPlaying) {
		boolean playing = false;
		if ("false".equalsIgnoreCase(isPlaying)) {
			playing = true;
		} else {
			playing = false;
		} 
		return playing;
	} 

}
