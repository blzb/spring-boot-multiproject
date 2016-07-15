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

  public Persona() {
    this.id = UUID.randomUUID().toString();
  }
}
