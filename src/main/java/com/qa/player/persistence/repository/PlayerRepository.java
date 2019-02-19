package com.qa.player.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.player.persistence.domain.PlayerIsPlaying;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerIsPlaying, Boolean> {

}
