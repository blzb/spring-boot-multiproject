package com.mopgp.framework.db.dbo.cardex

import com.mopgp.framework.db.dbo.core.Plantilla

import javax.persistence.Id


/**
 * Contiene los tipos de solicitudes de funcionario a funcionario
 * Por ejemplo: Solicitud e Audiencias, Unidad de Atención de Victimas al Delito (UAVD), JAR, Médicos, Defensor...
 *
 */

class TipoSolicitud {
   @Id
   Long id
   String  nombre
   String  descripcion
   Plantilla plantilla

   static mapping = {
      table "Cat_TipoSolicitud"
   }
   static constraints = {
    }
}
