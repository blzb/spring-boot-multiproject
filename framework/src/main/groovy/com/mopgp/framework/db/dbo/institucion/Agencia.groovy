package com.mopgp.framework.db.dbo.institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Agencia {

	@Id
	Long id
	String acronimo
	String nombre

	static hasMany = [unidadesEspecializadas:UnidadEspecializada]

   static constraints = {
	   unidadesEspecializadas nullable: true
   }
}