package com.cddmiasmin.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cddmiasmin.adoteumpet.core.models.Pet;
import com.cddmiasmin.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner{

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Thor");
		pet.setHistoria("Pequeno herói.");
		pet.setFoto("https://t1.ea.ltmcdn.com/pt/posts/7/8/8/fantasias_caseiras_para_gatos_5887_orig.jpg");
	
		petRepository.save(pet);
	}
}
