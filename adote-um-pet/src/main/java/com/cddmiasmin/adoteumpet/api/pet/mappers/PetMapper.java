package com.cddmiasmin.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import com.cddmiasmin.adoteumpet.api.pet.dtos.PetResponse;
import com.cddmiasmin.adoteumpet.core.models.Pet;

@Component
public class PetMapper {

    public PetResponse toResponse(Pet pet){
        var petResponse = new PetResponse();
        petResponse.setId(pet.getId());
        petResponse.setNome(pet.getNome());
        petResponse.setHistoria(pet.getHistoria());
        petResponse.setFoto(pet.getFoto());    
        return petResponse;
    }
    
}
