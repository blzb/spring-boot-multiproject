package com.mopgp.reticula.dao;

import com.mopgp.reticula.dbo.Funcionario;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by apimentel on 7/27/16.
 */
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {
}
