package com.mopgp.framework.db.dbo.rbi

import com.mopgp.framework.db.dbo.core.Persona

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class DomicilioPersona {

    @Id
    Long id
    String calle
    String numeroExterior
    String numeroInterior
    Double longitud
    Double latitud
    Persona persona


    static hasOne = [persona: Persona]

    static constraints = {
    }
}
