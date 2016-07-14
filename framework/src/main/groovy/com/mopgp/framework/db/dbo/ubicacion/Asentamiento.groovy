package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Asentamiento {

	@Id
	Long id
	String nombre
	String codigoPostal
	TipoAsentamiento tipo
	Double latitud
	Double longitud
	Double altitud

	static belongsTo= [municipio: Municipio]

    static constraints = {
    }
}
