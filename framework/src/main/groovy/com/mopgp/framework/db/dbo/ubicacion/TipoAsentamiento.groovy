package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoAsentamiento {

  @Id
  Long id
	String nombre

    static constraints = {
    }
}
