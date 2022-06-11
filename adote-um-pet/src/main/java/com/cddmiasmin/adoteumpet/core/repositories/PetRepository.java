package com.cddmiasmin.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cddmiasmin.adoteumpet.core.exceptions.PetNotFoundException;
import com.cddmiasmin.adoteumpet.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id){
        // var petOptional = findById(id);

        // if (petOptional.isPresent()) return petOptional.get();
        // throw new PetNotFoundException();

        return findById(id)
            .orElseThrow(PetNotFoundException::new);
    }
}