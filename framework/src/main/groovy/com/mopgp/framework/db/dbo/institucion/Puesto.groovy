package com.mopgp.framework.db.dbo.institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Puesto {
	@Id
	Long id
	String nombre
	String descripcion

	static mapping = {
		table "Cat_Puesto"
	}
   static constraints = {
   }
}