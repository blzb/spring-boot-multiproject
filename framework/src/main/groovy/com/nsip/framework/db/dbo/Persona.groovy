package com.nsip.framework.db.dbo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by apimentel on 7/4/16.
 */
@Entity
class Persona {
  @Id
  String id

  String nombre

  String apellido

  String titulo

  String departamento

  public Persona() {
    this.id = UUID.randomUUID().toString();
  }
}
