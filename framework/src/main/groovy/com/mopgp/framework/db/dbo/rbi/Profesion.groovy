package com.mopgp.framework.db.dbo.rbi

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Catalogo para las profesiones
 */
@Entity
class Profesion {
    @Id
    Long id

    String nombre

    public Profesion(String nombre) {
        this.nombre = nombre
    }
    static mapping = {
        table "Cat_Profesion"
    }
    static constraints = {
    }
}
