package com.mopgp.reticula.dbo;

import javax.persistence.*;

/**
 * Created by apimentel on 7/26/16.
 */
@Entity
@Table(name="funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String puesto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
