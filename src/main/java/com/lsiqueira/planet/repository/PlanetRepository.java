package com.lsiqueira.planet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsiqueira.planet.entity.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long>{

	Optional<Planet> findByName(String name);
}
