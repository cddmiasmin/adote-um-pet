package com.cddmiasmin.adoteumpet.api.adocao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cddmiasmin.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.cddmiasmin.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.cddmiasmin.adoteumpet.api.adocao.mappers.AdocaoMapper;
import com.cddmiasmin.adoteumpet.core.repositories.AdocaoRepository;

@RestController
public class AdocaoController {
    
    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AdocaoMapper adocaoMapper;

    @PostMapping("/api/adocoes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AdocaoResponse create(@RequestBody AdocaoRequest adocaoRequest){
        var adocao = adocaoMapper.toModel(adocaoRequest);
        var createAdocao = adocaoRepository.save(adocao);
        return adocaoMapper.toResponse(createAdocao);
    }
}
