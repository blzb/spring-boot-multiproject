package com.mopgp.bienesasegurados.dbo

import com.mopgp.framework.db.dbo.rbi.RBI

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Bien {
    @Id
    Long id
    Integer nombre
    TipoBien tipoBien
    Date fechaRegistro
    Date fechaEnvioBodega
    Date fechaRecuperacion
    String descripcion

    enum CondicionBien{
        ROBADO, RECUPERADO, NO_ENCONTRADO, PERDIDO, REMATADO
    }
    enum EstatusBien{
        EN_MINISTERIO_PUBLICO,
        EN_BODEGA,
        EN_INVESTIGACION
    }

    static belongsTo = [rbi: RBI, bodega: Bodega]
    static constraints = {
    }
}
