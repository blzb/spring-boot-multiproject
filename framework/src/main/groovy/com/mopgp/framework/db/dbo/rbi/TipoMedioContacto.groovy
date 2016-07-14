package com.mopgp.framework.db.dbo.rbi

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoMedioContacto {
    @Id
    Long id

    static mapping = {
        table "Cat_TipoMedioContacto"
    }
    static constraints = {
    }
}
