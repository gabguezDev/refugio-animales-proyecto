/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refugioanimales.refugioanimales.service;

import com.refugioanimales.refugioanimales.model.Adoptante;
import com.refugioanimales.refugioanimales.repository.IAdoptanteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptanteService implements IAdoptanteService{
    
    @Autowired
    private IAdoptanteRepository adoptanteRepo;

    @Override
    public List<Adoptante> getAdoptantes() {
        List<Adoptante> listaAdoptantes = adoptanteRepo.findAll();
        return listaAdoptantes;
    }

    @Override
    public void saveAdoptante(Adoptante adoptante) {
        adoptanteRepo.save(adoptante);
    }

    @Override
    public void deleteAdoptante(Long id) {
        adoptanteRepo.deleteById(id);
    }

    @Override
    public void editAdoptante(Adoptante adoptante) {
        this.saveAdoptante(adoptante);
    }

    @Override
    public Adoptante getAdoptante(Long id) {
        Adoptante adoptante = adoptanteRepo.findById(id).orElse(null);
        return adoptante;
    }
    
}
