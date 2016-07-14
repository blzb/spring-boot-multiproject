package com.mopgp.bienesasegurados.dbo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoBien {

    @Id
    Long id
    String nombre
    String descripcion

    static mapping = {
        table "Cat_TipoBien"
    }
    static constraints = {
    }
}
