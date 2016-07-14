package com.mopgp.framework.db.dbo.rbi

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class MedioContacto {
    @Id
    Long id
    TipoMedioContacto tipoMedioContacto
    String valor

    static constraints = {
    }
}
