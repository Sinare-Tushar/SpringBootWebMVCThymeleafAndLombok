package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
public class EmployeeController {
	Logger log = LogManager.getLogger(EmployeeController.class);
@RequestMapping("reg")
public String showEmployee() {
	log.info("Hello How Are You");
	log.info("I am Fine");
	return "Register";
}
}
