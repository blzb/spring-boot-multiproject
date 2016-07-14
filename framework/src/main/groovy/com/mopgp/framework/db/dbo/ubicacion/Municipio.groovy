package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Municipio {

	@Id
	Long id
	String nombre;

	static belongsTo= [estado: Estado]
	static hasMany= [asentamientos: Asentamiento]

    static constraints = {
    }
}
