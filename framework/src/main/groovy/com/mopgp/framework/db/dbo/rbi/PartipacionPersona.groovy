package com.mopgp.framework.db.dbo.rbi

import com.mopgp.framework.db.dbo.core.Persona

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Indica la participacion de la persona dentro del RBI: denunciante, imputado, testigo y victima
 */
@Entity
class PartipacionPersona {
    @Id
    Long id
    String nombre
    static belongsTo = [persona:Persona]
    static constraints = {
    }
}
