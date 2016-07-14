package com.mopgp.framework.db.dbo.core

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoDelito {
    @Id
    Long id

    static constraints = {
    }
}
