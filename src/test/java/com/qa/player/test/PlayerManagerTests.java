package com.qa.player.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.player.service.PlayerServiceImpl;


public class PlayerManagerTests {
	
	PlayerServiceImpl service = new PlayerServiceImpl();
	
	@Test
	public void testWhenInputIsFalse() {
		assertTrue(service.setPlaying("false"));
	}
	
	@Test
	public void testWhenInputIsTrue() {
		assertFalse(service.setPlaying("true"));
	}
	
	@Test
	public void testWhenInputIsInvalid() {
		assertFalse(service.setPlaying("adfgdfgddjfhkg"));
	}
	
	@Test
	public void testWhenInputIsEmpty() {
		assertFalse(service.setPlaying(""));
	}

}