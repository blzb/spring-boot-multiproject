package com.nsip.framework.db.dao;

import com.nsip.framework.db.dbo.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by apimentel on 7/4/16.
 */
@RepositoryRestResource(collectionResourceRel = "personas", path = "personas")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface PersonaRepository extends PagingAndSortingRepository<Persona, String> {
}
