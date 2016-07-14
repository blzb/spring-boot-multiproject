package com.mopgp.framework.db.dbo.cardex

import com.mopgp.framework.db.dbo.rbi.RBI

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TurnoAtencion {
	@Id
	Long id
	TipoAtencion tipo
	Estatus estatus
	Date fechaGenera
	Date fechaInicioAtencion
	Date fechaTerminoAtencion
	RBI rbi

	enum TipoAtencion {
		PENAL,
		NO_PENAL
	}

	enum Estatus {
		ATENDIDA,
		NO_ATENDIDA,
		CANCELADO
	}

   static constraints = {
   	rbi nullable: true
   }
}