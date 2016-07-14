package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Ciudad {
    @Id
    Long id

    static constraints = {
    }
}
