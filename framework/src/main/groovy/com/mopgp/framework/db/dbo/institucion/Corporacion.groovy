package com.mopgp.framework.db.dbo.institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Corporacion {

	@Id
	Long id
	String nombre
	TipoCorporacion tipo

	enum TipoCorporacion {
		FEDERAL,
		ESTATAL,
		MUNICIPAL
	}

   static constraints = {
   }
}