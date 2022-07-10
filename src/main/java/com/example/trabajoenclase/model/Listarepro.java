/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabajoenclase.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "listarepro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listarepro.findAll", query = "SELECT l FROM Listarepro l"),
    @NamedQuery(name = "Listarepro.findByIdlistarepro", query = "SELECT l FROM Listarepro l WHERE l.idlistarepro = :idlistarepro"),
    @NamedQuery(name = "Listarepro.findByDescripcion", query = "SELECT l FROM Listarepro l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "Listarepro.findByNombre", query = "SELECT l FROM Listarepro l WHERE l.nombre = :nombre")})
public class Listarepro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlistarepro")
    private Long idlistarepro;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLista")
    private List<Cancion> cancionList;

    public Listarepro() {
    }

    public Long getIdlistarepro() {
        return idlistarepro;
    }

    public void setIdlistarepro(Long idlistarepro) {
        this.idlistarepro = idlistarepro;
    }

   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Cancion> getCancionList() {
        return cancionList;
    }

    public void setCancionList(List<Cancion> cancionList) {
        this.cancionList = cancionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlistarepro != null ? idlistarepro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listarepro)) {
            return false;
        }
        Listarepro other = (Listarepro) object;
        if ((this.idlistarepro == null && other.idlistarepro != null) || (this.idlistarepro != null && !this.idlistarepro.equals(other.idlistarepro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.trabajoenclase.model.Listarepro[ idlistarepro=" + idlistarepro + " ]";
    }
    
}
