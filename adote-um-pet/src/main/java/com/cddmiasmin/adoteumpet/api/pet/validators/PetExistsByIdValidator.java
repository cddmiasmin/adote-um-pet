package com.cddmiasmin.adoteumpet.api.pet.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cddmiasmin.adoteumpet.core.repositories.PetRepository;

@Component
public class PetExistsByIdValidator implements ConstraintValidator<PetExistsById, Long> {

    @Autowired
    private PetRepository petRepository;
    
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        
        if(value == null) return true;
        
        return petRepository.existsById(value);
    }
    
}
