package com.mopgp.framework.db.dbo.cardex

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoPlantilla {
  @Id
  Long id

	String nombre
	String descripcion

    static mapping = {
        table "Cat_TipoPlantilla"
    }
   static constraints = {
   }
}