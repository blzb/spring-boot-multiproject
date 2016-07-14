package com.mopgp.audiencias.dbo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Transcripcion {
    @Id
    Long id
    String texto
    static constraints = {
    }
}
