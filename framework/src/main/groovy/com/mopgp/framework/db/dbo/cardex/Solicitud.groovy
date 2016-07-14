package com.mopgp.framework.db.dbo.cardex

import com.mopgp.framework.db.dbo.institucion.Funcionario

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Solicitud {

	@Id
	Long id
	Funcionario funcionarioEnvia
	Funcionario funcionarioRecibe
	String mensage
	TipoSolicitud tipo
	Date fechaGenera
	Date fechaInicioAtencion
	Date fechaTerminoAtencion

	enum Estatus {
		ENVIADA,
		RECIBIDA,
		RECHAZADA,
		CONCLUIDA
	}

	enum Prioridad {
		ALTA,
		MEDIA,
		BAJA
	}

	//static belongsTo= [caso: Caso]

   static constraints = {
   }
}