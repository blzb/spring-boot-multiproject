package com.mopgp.framework.db.dbo.rbi

import com.mopgp.framework.db.dbo.institucion.Institucion

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Define las Carpetas en las que se podra encontrar un expediente segun una institucion, por ejemplo:
 * IPH,
 * DENUNCIA,
 * ACTA_CIRCUNSTANCIADA,
 * CARPETA_CORROBORACION,
 * CAUSA
 */
@Entity
class TipoRBI {

    @Id
    Long id
    String nombre
    String descripcion
    //Institucion institucion
    static belongsTo = [institucion: Institucion]

    public TipoRBI(String nombre, Institucion inst){
        this.nombre = nombre
        this.institucion = inst

    }

    static constraints = {
        descripcion nullable: true
    }
}
