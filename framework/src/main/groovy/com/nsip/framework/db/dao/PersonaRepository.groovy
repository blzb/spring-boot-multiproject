package com.nsip.framework.db.dao

import com.nsip.framework.db.dbo.Persona
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by apimentel on 7/4/16.
 */
@RepositoryRestResource(collectionResourceRel = "personas", path = "personas")
interface PersonaRepository extends PagingAndSortingRepository<Persona, String> {
}
