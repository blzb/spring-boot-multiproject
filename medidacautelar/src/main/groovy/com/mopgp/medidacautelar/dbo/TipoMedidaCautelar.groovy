package com.mopgp.medidacautelar.dbo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TipoMedidaCautelar {
    @Id
    Long id
    String nombre
    String descripcion

    static mapping = {
        table "Cat_TipoMedidaCautelar"
    }
    static constraints = {
    }

}