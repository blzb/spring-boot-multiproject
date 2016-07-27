package com.mopgp.ejemplo.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by apimentel on 7/4/16.
 */
@Entity
public class Ejemplo {
  @Id
  String id;

  Date fecha;

  String status;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
