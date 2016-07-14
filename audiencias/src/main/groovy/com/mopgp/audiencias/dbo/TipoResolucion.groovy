package com.mopgp.audiencias.dbo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoResolucion {
    @Id
    Long id
    String nombre
    static mapping = {
        table "Cat_TipoResolucion"
    }
    static constraints = {
    }
}
