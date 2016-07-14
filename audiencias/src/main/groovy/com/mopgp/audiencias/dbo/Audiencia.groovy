package com.mopgp.audiencias.dbo

import com.mopgp.framework.db.dbo.institucion.Funcionario

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Audiencia {
	@Id
	Long id
	Date fechaAudiencia
	Double duracíon
	TipoAudiencia tipo
	Funcionario juez
	Resolutivo resolutivos
    EstatusAudiencia estatusAudiencia
	Transcripcion transcripciones

    static belongsTo = [caso: Caso]
	//static hasMany = [medidasCautelares: MedidaCautelar]

	enum EstatusAudiencia {
		AGENDADA,
		RECHAZADA,
		REAGENDADA,
		CANCELADA,
		EJECUTADA
	}

   static constraints = {
   }

}