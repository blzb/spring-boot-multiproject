package com.mopgp.framework.db.dbo.core

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Delito {
    @Id
    Long id
    String nombre
    TipoDelito tipoDelito

    static constraints = {
    }
}
