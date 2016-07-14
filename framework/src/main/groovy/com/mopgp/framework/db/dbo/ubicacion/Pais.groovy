package com.mopgp.framework.db.dbo.ubicacion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Pais {

    @Id
    Long id
    String nombre
    String iso2
    String iso3
    static hasMany = [estados: Estado]
    static constraints = {
    }
}
