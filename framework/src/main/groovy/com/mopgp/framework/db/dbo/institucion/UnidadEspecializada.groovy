package com.mopgp.framework.db.dbo.institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class UnidadEspecializada {

	@Id
	Long id
	String acronimo
	String nombre


   static constraints = {
   }
}