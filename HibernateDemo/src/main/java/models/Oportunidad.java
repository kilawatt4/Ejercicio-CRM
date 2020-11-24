/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Oportunidad {
    public Integer id;
    public models.Contacto contacto;
    public String descripcion;
    public BigDecimal valor;
    public Date fecha;
    public String nivel;
    public String estado;
    private Set<models.Actividad> actividades;

    public Set<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    public Oportunidad() {
        this.descripcion="";
        this.fecha=new Date();
        this.nivel="";
        this.estado="";
        this.actividades = new HashSet(0);
    }

    public Oportunidad(models.Contacto contacto, String descripcion, BigDecimal valor, Date fecha, String nivel, String estado) {
        this.contacto=contacto;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha = fecha;
        this.nivel = nivel;
        this.estado = estado;
        this.actividades = new HashSet(0);
    }

    public Integer getId() {
        return id;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNivel() {
        return nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.contacto);
        hash = 79 * hash + Objects.hashCode(this.descripcion);
        hash = 79 * hash + Objects.hashCode(this.valor);
        hash = 79 * hash + Objects.hashCode(this.fecha);
        hash = 79 * hash + Objects.hashCode(this.nivel);
        hash = 79 * hash + Objects.hashCode(this.estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Oportunidad other = (Oportunidad) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.nivel, other.nivel)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.contacto, other.contacto)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    

   

    @Override
    public String toString() {
        return "Oportunidad{" + "id=" + id + ", contacto=" + contacto + ", descripcion=" + descripcion + ", valor=" + valor + ", fecha=" + fecha + ", nivel=" + nivel + ", estado=" + estado + '}';
    }
    
}
