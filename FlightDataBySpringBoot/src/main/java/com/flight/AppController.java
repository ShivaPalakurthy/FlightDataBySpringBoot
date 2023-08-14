package com.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	private FlightDataDAO dao;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<FlightData> listFlight=dao.list();
		model.addAttribute("listFlight",listFlight);
		return "index";
	}
}
