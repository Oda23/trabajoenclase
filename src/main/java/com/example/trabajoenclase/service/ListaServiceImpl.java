/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabajoenclase.service;


import com.example.trabajoenclase.model.Listarepro;
import com.example.trabajoenclase.repository.ListaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Estudiante
 */
@Service
public class ListaServiceImpl implements ListaService {
    @Autowired
    public ListaRepository listarepository;

    @Override
    public Listarepro crear(Listarepro c) {

        return listarepository.save(c);
    }

    @Override
    public Listarepro findById(Long id) {

        return listarepository.findById(id).orElse(null);
        
    }

    @Override
    public List<Listarepro> findByAll() {
        return listarepository.findAll();
    }

    @Override
    public void delete(Long id) {
        listarepository.deleteById(id);
    }
    
}
