package com.qa.player.service;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

	public Boolean setPlaying(String isPlaying) {
		boolean playing;
		if ("${choice.bool}".equalsIgnoreCase(isPlaying)) {
			playing = false;
		} else {
			playing = true;
		} 
		return playing;
	} 

}
