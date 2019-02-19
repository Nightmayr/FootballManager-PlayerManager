package com.qa.player.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	ObjectMapper mapper = new ObjectMapper();
	@Value("${choice.attribute}")
	private String attribute;

	public Boolean setPlaying(String player) {
		JsonNode realPlayer;
		try {
			realPlayer = mapper.readTree(player);
			if (realPlayer.get(attribute).asBoolean() == true) {
				return false;
			} else {
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
