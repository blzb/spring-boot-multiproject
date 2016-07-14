package com.mopgp.medidacautelar.dbo

import com.mopgp.audiencias.dbo.Audiencia

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by Fernando on 30/06/2016.
 */
@Entity
class SeguimientoMedidaCautelar {
    @Id
    Long id

    Audiencia audiencia
    MedidaCautelar medidaCautelar
    Date fechaRegistro
    EstatusCumplimiento estatusCumplimiento

    enum EstatusCumplimiento {
        CUMPLIDA,
        NO_CUMPLIDA
    }

}