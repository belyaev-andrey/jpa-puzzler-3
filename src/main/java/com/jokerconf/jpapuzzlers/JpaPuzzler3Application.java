package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPuzzler3Application implements CommandLineRunner {

    @Autowired
    private PetRepository petRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaPuzzler3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        petRepository.findById(1L).ifPresent(pet -> {
            System.out.println(pet);
            System.out.println(pet.getOwner());
            System.out.println(pet.getCollar());
        });
    }
}