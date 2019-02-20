package com.qa.player.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.player.service.PlayerServiceImpl;


public class PlayerManagerTests {
	
	PlayerServiceImpl service = new PlayerServiceImpl();
	
	@Test
	public void TestWhenInputIsFalse() {
		assertTrue(service.setPlaying("false"));
	}
	
	@Test
	public void TestWhenInputIsTrue() {
		assertFalse(service.setPlaying("true"));
	}
	
	@Test
	public void TestWhenInputIsInvalid() {
		assertFalse(service.setPlaying("adfgdfgddjfhkg"));
	}
	
	@Test
	public void TestWhenInputIsEmpty() {
		assertFalse(service.setPlaying(""));
	}

}
