package com.mopgp.audiencias.dbo

import com.mopgp.framework.db.dbo.institucion.Funcionario

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Resolutivo {
    @Id
    Long id
    Audiencia audiencia
    String texto
    TipoResolucion tipoResolucion
    Date fechaResolutivo
    Funcionario juez


    static constraints = {
    }
}