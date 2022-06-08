package com.cddmiasmin.adoteumpet.api.pet.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cddmiasmin.adoteumpet.api.pet.dtos.PetResponse;
import com.cddmiasmin.adoteumpet.api.pet.mappers.PetMapper;
import com.cddmiasmin.adoteumpet.core.models.Pet;
import com.cddmiasmin.adoteumpet.core.repositories.PetRepository;

@RestController
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {
        var pets = petRepository.findAll();
        var petResponses = new ArrayList<PetResponse>();
        for(Pet pet : pets){
            petResponses.add(petMapper.toResponse(pet));
        }
        return petResponses;
    }

}
