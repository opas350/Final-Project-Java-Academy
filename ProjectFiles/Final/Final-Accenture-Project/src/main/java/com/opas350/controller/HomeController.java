package com.opas350.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String home() {
		String message = "Go to the following link for main app ---> http://localhost:8080/index.html";
		return message;
	}

}
