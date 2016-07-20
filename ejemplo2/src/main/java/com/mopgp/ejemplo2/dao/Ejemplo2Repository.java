package com.mopgp.ejemplo2.dao;

import com.mopgp.ejemplo2.Ejemplo2;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by apimentel on 7/4/16.
 */
@PreAuthorize("hasRole('ROLE_USER')")
public interface Ejemplo2Repository extends PagingAndSortingRepository<Ejemplo2, String> {
}
