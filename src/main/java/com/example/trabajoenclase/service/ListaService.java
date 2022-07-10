/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.trabajoenclase.service;


import com.example.trabajoenclase.model.Listarepro;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public interface ListaService {

    public Listarepro crear(Listarepro c);

    public Listarepro findById(Long id);

    public List<Listarepro> findByAll();

    public void delete(Long id);

}
