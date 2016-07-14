package com.mopgp.framework.db.dbo.institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Distrito {
    @Id
    Long id

    String nombre
    String acronimo
    static constraints = {
    }
}
