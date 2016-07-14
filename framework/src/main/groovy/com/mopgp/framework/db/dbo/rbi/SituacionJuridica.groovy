package com.mopgp.framework.db.dbo.rbi

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Catalogo que define la situacion juridica del detenido: detenido, etc.
 */
@Entity
class SituacionJuridica {
    @Id
    Long id
    String nombre
    static constraints = {
    }
}
