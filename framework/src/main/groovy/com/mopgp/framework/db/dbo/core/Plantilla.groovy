package com.mopgp.framework.db.dbo.core

import com.mopgp.framework.db.dbo.cardex.TipoPlantilla

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Plantilla {
	@Id
	Long id

	String nombre
	String descripcion
	String path
	TipoPlantilla tipo

   static constraints = {
   }
}