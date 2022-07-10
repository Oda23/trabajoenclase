/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.trabajoenclase.repository;


import com.example.trabajoenclase.model.Listarepro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Estudiante
 */
public interface ListaRepository extends JpaRepository<Listarepro, Long> {
    
}
