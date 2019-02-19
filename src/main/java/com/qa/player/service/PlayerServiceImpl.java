package com.qa.player.service;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
	

	public Boolean setPlaying(String isPlaying) {
		if (isPlaying.equalsIgnoreCase("true")) {
			return false;
		} else {
			return true;
		}
	}

}
