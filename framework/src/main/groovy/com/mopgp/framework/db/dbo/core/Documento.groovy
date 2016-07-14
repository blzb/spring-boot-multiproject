package com.mopgp.framework.db.dbo.core

import com.mopgp.framework.db.dbo.rbi.RBI

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Documento {
	@Id
	Long id

	String nombre
	String descripcion
	Date fechaCreacion

	static belongsTo= [rbi: RBI]

   static constraints = {
   }
}