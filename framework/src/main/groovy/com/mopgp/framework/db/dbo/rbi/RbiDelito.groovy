package com.mopgp.framework.db.dbo.rbi

import com.mopgp.framework.db.dbo.core.Delito

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class RbiDelito  implements Serializable {
    @Id
    Long id

    RBI rbi
    Delito delito


    public RbiDelito (RBI rbi, Delito delito) {
        this.rbi = rbi
        this.delito = delito
    }

/*
    static RbiDelito create(RBI rbi, Delito delito) {
        def instance = new RbiDelito(rbi: RBI, delito: Delito)
        instance.save()
        instance
    }*/

    static constraints = {
    }
    static mapping = {
        id composite: ['rbi', 'delito']
        version false
    }
}
