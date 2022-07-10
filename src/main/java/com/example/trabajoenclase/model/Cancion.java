/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabajoenclase.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "cancion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cancion.findAll", query = "SELECT c FROM Cancion c"),
    @NamedQuery(name = "Cancion.findByIdcancion", query = "SELECT c FROM Cancion c WHERE c.idcancion = :idcancion"),
    @NamedQuery(name = "Cancion.findByTitulo", query = "SELECT c FROM Cancion c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Cancion.findByArtista", query = "SELECT c FROM Cancion c WHERE c.artista = :artista"),
    @NamedQuery(name = "Cancion.findByAlbum", query = "SELECT c FROM Cancion c WHERE c.album = :album"),
    @NamedQuery(name = "Cancion.findByAnio", query = "SELECT c FROM Cancion c WHERE c.anio = :anio")})
public class Cancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcancion")
    private Long idcancion;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "artista")
    private String artista;
    @Basic(optional = false)
    @Column(name = "album")
    private String album;
    @Basic(optional = false)
    @Column(name = "anio")
    private int anio;
    @JoinColumn(name = "id_lista", referencedColumnName = "idlistarepro")
    @ManyToOne(optional = false)
    private Listarepro idLista;

    public Cancion() {
    }

    public Long getIdcancion() {
        return idcancion;
    }

    public void setIdcancion(Long idcancion) {
        this.idcancion = idcancion;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Listarepro getIdLista() {
        return idLista;
    }

    public void setIdLista(Listarepro idLista) {
        this.idLista = idLista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcancion != null ? idcancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancion)) {
            return false;
        }
        Cancion other = (Cancion) object;
        if ((this.idcancion == null && other.idcancion != null) || (this.idcancion != null && !this.idcancion.equals(other.idcancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.trabajoenclase.model.Cancion[ idcancion=" + idcancion + " ]";
    }
    
}
