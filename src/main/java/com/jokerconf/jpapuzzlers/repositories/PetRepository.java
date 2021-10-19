package com.jokerconf.jpapuzzlers.repositories;

import com.jokerconf.jpapuzzlers.entities.Pet;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    @Override
    List<Pet> findAll();

}