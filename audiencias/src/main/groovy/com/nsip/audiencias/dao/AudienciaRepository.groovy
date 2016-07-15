package com.nsip.audiencias.dao

import com.nsip.audiencias.db.Audiencia
import com.nsip.framework.db.dbo.Persona
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.security.access.prepost.PreAuthorize

/**
 * Created by apimentel on 7/4/16.
 */
@PreAuthorize("hasRole('ROLE_USER')")
interface AudienciaRepository  extends PagingAndSortingRepository<Audiencia, String> {
}
