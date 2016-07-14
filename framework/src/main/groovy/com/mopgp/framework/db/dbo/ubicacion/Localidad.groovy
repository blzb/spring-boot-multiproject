package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Localidad {

	@Id
	Long id
	String nombre
	Double latitud
	Double altitud
	Double longitud

	static belongsTo= [estado: Estado]
	static hasMany= [asentamientos: Asentamiento]

    static constraints = {
    }

}
