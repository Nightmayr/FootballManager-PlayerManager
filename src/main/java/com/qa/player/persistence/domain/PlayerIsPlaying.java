package com.qa.player.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class PlayerIsPlaying {
	
	@Id
	private Long id;
	
	@JsonProperty("playing")
	private Boolean isPlaying;
	
	public PlayerIsPlaying() {}
	
	public PlayerIsPlaying(Boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(Boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

}
