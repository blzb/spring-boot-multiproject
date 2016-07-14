package com.mopgp.framework.db.dbo.institucion

import com.mopgp.framework.db.dbo.security.User

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Funcionario extends User{


	String numeroEmpleado
	String nombre
	String apellidoPaterno
	String apellidoMaterno
	Date   fechaNacimiento

	Agencia agencia
	UnidadEspecializada unidadEspecializada
	Puesto puesto

   static constraints = {
   	unidadEspecializada nullable: true
   }
}