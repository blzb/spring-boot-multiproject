package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Estado {
  @Id
	Integer id
	String nombre

	// static hasMany= [municipios: Municipio]
	// static hasMany=[localidades:Localidad]
    static belongsTo = [pais:Pais]
    static constraints = {
    }

}
