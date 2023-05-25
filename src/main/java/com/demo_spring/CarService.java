package com.demo_spring;

import com.demo.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {

  private CarDAO carDAO;
  private EmailService emailService;
  private MOTService motService;

  @Autowired
  public CarService(CarDAO carDAO, EmailService emailService, MOTService motService) {
    this.carDAO = carDAO;
    this.emailService = emailService;
    this.motService = motService;
  }

  public void showService() {
    carDAO.showDetailsDao();
  }
}
