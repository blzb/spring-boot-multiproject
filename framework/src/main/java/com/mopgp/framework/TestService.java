package com.mopgp.framework;

import com.mopgp.framework.db.dao.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apimentel on 6/20/16.
 */
@Service
public class TestService {
  @Autowired
  PersonaRepository personRepository;

  public String getRandom(){
    return personRepository.count()+"Persons";
  }
}
