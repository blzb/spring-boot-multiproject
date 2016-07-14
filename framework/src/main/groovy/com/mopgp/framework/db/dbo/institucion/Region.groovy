package com.mopgp.framework.db.dbo.institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Region {
    @Id
    Long id

    String nombre
    String acronimo
    static hasMany = [distritos: Distrito]
    static constraints = {
    }
}
