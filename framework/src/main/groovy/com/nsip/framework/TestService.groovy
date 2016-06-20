package com.nsip.framework

import org.springframework.stereotype.Service

/**
 * Created by apimentel on 6/20/16.
 */
@Service
class TestService {
  String getRandom(){
    UUID.randomUUID().toString()
  }
}
