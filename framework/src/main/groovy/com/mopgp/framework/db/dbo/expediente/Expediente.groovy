package com.mopgp.framework.db.dbo.expediente

import com.mopgp.framework.db.dbo.institucion.Funcionario
import com.mopgp.framework.db.dbo.rbi.RBI

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Expediente {
    @Id
    Long id

    Funcionario usuarioCaptura
    String numeroExpediente
    RBI rbi
    Boolean leer
    Boolean modificar
    Boolean eliminar

    static constraints = {
    }

}