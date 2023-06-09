package com.demo_spring;

import com.demo.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MOTService {

  private EmailService emailService;

  @Autowired
  public MOTService(EmailService emailService) {
    this.emailService = emailService;
  }
}
