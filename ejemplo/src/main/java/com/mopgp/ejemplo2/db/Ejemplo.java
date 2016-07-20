package com.mopgp.ejemplo2.db;

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

}
