package com.nsip.audiencias.db

import javax.persistence.Entity
import javax.persistence.Id;
/**
 * Created by apimentel on 7/4/16.
 */
@Entity
class Audiencia {
  @Id
  String id

  Date fecha

  String status

}
