package com.mopgp.audiencias.dbo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoAudiencia {
  @Id
  Long id
	String nombre
	String descripcion
    static mapping = {
        table "Cat_TipoAudiencia"
    }
   static constraints = {
   }
}
