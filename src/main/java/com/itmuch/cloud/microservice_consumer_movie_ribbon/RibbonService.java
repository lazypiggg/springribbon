package com.itmuch.cloud.microservice_consumer_movie_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
  @Autowired
  private RestTemplate restTemplate;

  public User findById(Long id) {
    // http://服务提供者的serviceId/url
	System.out.println(this.hashCode());
	return new User(new Long(id), java.util.Calendar.getInstance().getTime().toLocaleString(), 12);
    //return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
  }
}
