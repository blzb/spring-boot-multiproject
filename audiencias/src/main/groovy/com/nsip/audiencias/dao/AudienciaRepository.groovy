package com.nsip.audiencias.dao

import com.nsip.audiencias.db.Audiencia
import com.nsip.framework.db.dbo.Persona
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by apimentel on 7/4/16.
 */
interface AudienciaRepository  extends PagingAndSortingRepository<Audiencia, String> {
}
