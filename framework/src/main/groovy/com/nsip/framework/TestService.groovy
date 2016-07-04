package com.nsip.framework

import com.nsip.framework.db.dao.PersonaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by apimentel on 6/20/16.
 */
@Service
class TestService {
  @Autowired
  PersonaRepository personRepository

  String getRandom(){
    personRepository.count()+"Persons"
  }
}
