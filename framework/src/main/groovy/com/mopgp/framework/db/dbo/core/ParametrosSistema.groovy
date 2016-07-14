package com.mopgp.framework.db.dbo.core

import com.mopgp.framework.db.dbo.institucion.Institucion

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class ParametrosSistema {
    @Id
    Long id

    Institucion institucion
    String direccion
    Boolean guardaImagenes
    Boolean mapaActivado
    String idioma

    enum tipoTransferenciaRBI{
        JMS, WS, ESB
    }

    enum tipoManejadorContenidos{
        JACKRABBIT_OAK, ALFRESCO, MODESHAPE
    }

    String urlContenidos
    String jndiJMS
    String jndi

    static constraints = {
    }
}
