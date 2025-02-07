package com.example.servingwebcontent;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) throws UnknownHostException {
		model.addAttribute("name", name);
		model.addAttribute("host", InetAddress.getLocalHost().getHostName());
		return "greeting";
	}

}
