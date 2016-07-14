package com.mopgp.audiencias.dbo

import com.mopgp.framework.db.dbo.core.Delito
import com.mopgp.framework.db.dbo.core.Persona

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Caso {
   @Id
   Long id
   Persona victima
   Persona imputado
   Delito delito
   String numeroCausa

   static constraints = {
   }
}