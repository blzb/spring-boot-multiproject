package com.mopgp.medidacautelar.dbo

import com.mopgp.framework.db.dbo.core.Persona

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
class MedidaCautelar {

    @Id
    Long id
    String nombre

    @OneToOne
    TipoMedidaCautelar tipoMedidaCautelar
    Date fechaInicio
    Date fechaFin

    static hasOne = [persona: Persona]

    static constraints = {
    }
}
