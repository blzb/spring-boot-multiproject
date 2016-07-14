package com.mopgp.framework.db.dbo.core

import com.mopgp.framework.db.dbo.rbi.DomicilioPersona
import com.mopgp.framework.db.dbo.rbi.Escolaridad
import com.mopgp.framework.db.dbo.rbi.MedioContacto
import com.mopgp.framework.db.dbo.rbi.Profesion
import com.mopgp.framework.db.dbo.rbi.RBI
import com.mopgp.framework.db.dbo.ubicacion.Estado

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Persona {

	@Id
	Long id
	String titulo
	String nombre
	String apellidoPaterno
	String apellidoMaterno
	Date   fechaNacimiento
	Estado entidadOrigen
	//PartipacionPersona participacion
	Escolaridad escolaridad
	Profesion profesion
	String RFC

	//String telefono
	//String celular
	//String email
	Genero genero
	EstadoCivil estadoCivil
	SituacionJuridica situacionJuridica
	TipoContribuyente tipoContribuyente

	enum Genero {
		FEMENINO,
		MASCULINO,
		TRASGENERO,
		BISEXUAL,
		HOMOSEXUAL,
		HERMAFRODITA
	}
	enum EstadoCivil {
		SOLTERO,
		UNION_LIBRE,
		CASADO,
		DIVORCIADO,
		VIUDO
	}
	enum SituacionJuridica{
        DETENIDO,
	    SENTENCIADO,
        MUERTO
	}

	enum participacion{
		VICTIMA, DENUNCIANTE, TESTIGO, IMPUTADO
	}
	enum TipoContribuyente {
		FISICA,
		MORAL
	}

	static belongsTo= [rbi: RBI]
    static hasMany = [mediosContacto: MedioContacto , domicilio: DomicilioPersona]//, medidasCautelares: MedidaCautelar ]


   	static constraints = {
		//telefono nullable: true
	    //celular nullable: true
	    //email nullable: true
        medidasCautelares nullable: true
        mediosContacto nullable: true
        profesion nullable: true
        situacionJuridica nullable: true
		domicilio nullable: true
    }

}