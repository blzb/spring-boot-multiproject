package com.mopgp.framework.db.dbo.rbi

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class RBI {
	@Id
	Long id


	TipoRBI tipoRbi
    Estatus estatus


	Date fechaHora
	String asunto
	String hecho

    String nuc

    enum Estatus {
        POR_ATENDER,
        ABIERTO,
        CERRADO,
        RECHAZADO
    }

	//UbicacionDelito ubicacion

	static hasMany= [denunciantes: Denunciante,
					 victimas: Victima,
					 imputados: Imputado,
					 testigos: Testigo,
					 ubicacion: UbicacionDelito
					 ]

    static constraints = {
       // corporacion nullable: true
   	    denunciantes nullable: true
   	    victimas  nullable: true
   	    imputados nullable: true
   	    testigos  nullable: true
		ubicacion  nullable: true

		nuc  nullable: true
    }

	public RBI(String asunto, String hecho,  TipoRBI tipo){
		this.hecho = hecho
		this.asunto = asunto
		this.fechaHora = new Date()
		this.tipoRbi = tipo
		this.estatus = RBI.Estatus.ABIERTO
	}
}