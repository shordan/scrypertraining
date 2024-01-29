package com.shordan.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shordan.springmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
