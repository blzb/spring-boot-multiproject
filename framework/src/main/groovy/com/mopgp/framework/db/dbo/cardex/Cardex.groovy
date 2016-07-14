package com.mopgp.framework.db.dbo.cardex

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Cardex {

    @Id
    Long id
    String nombre
    String funcion
    Integer version
    Boolean activo

    enum tipoCardex{
        MENU_LATERAL,
        ACCION_RBI,
        MODULO,
        VENTANA_MODAL
    }

    //static belongsTo = [role: Role]

    static constraints = {
    }

}
