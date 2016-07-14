package com.mopgp.audiencias.dbo

import com.mopgp.framework.db.dbo.cardex.Solicitud

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class SolicitudAudiencia extends Solicitud {
	TipoAudiencia tipoAudiencia
	enum caracter {
		PUBLICO,
		PRIVADO
	}

   static constraints = {
   }
}