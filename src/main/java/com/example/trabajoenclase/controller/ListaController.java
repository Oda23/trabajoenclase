/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabajoenclase.controller;

import com.example.trabajoenclase.model.Listarepro;
import com.example.trabajoenclase.service.ListaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Estudiante
 */
@RestController
@RequestMapping("/api/playlist")
public class ListaController {
    
    @Autowired 
    ListaService listaservice;
    
     @GetMapping("/lista")
    public ResponseEntity<List<Listarepro>> listar() {
       
        return new ResponseEntity<>(listaservice.findByAll(), HttpStatus.OK);
    }
    
     @PostMapping("/crear")
    public ResponseEntity<Listarepro> crear(@RequestBody Listarepro c) {
        return new ResponseEntity<>(listaservice.crear(c), HttpStatus.CREATED);
    }
    
     @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Listarepro> eliminar(@PathVariable Long id) {
       listaservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
     @GetMapping("/buscar/{id}")
    public ResponseEntity<Listarepro> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(listaservice.findById(id), HttpStatus.OK);
    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Listarepro> actualizar(@PathVariable Long id, @RequestBody Listarepro u) {
        Listarepro listare = buscarlista(id);
        if (listare == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } else {
            try {
                listare.setDescripcion(u.getDescripcion());
              
               
                
                return new ResponseEntity<>(listaservice.crear(u), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
           
        }

    }    
   
    
      public Listarepro buscarlista(@PathVariable Long id) {
        return listaservice.findById(id);
    }
    
    
}
