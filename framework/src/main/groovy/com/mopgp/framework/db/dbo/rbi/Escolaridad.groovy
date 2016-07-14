package com.mopgp.framework.db.dbo.rbi

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Escolaridad {
    @Id
    Long id
    String nombre

    public Escolaridad(String nombre) {
        this.nombre = nombre
    }
    static mapping = {
        table "Cat_Escolaridad"
    }
    static constraints = {
    }
}
