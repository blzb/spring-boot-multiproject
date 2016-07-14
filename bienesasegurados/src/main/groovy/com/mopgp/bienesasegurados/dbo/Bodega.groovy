package com.mopgp.bienesasegurados.dbo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Bodega {
    @Id
    Long id
    String nombre
    UbicacionBodega ubicacion

    static hasMany = [bienes: Bien]
    static constraints = {
    }
}
