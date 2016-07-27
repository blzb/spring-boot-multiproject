package com.mopgp.framework.db.dbo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by apimentel on 7/4/16.
 */
@Entity
public class Persona {
  @Id
  String id;

  String nombre;

  String apellido;

  String titulo;

  String departamento;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public Persona() {
    this.id = UUID.randomUUID().toString();
  }
}
