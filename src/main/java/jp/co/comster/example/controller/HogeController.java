package jp.co.comster.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HogeController {

	@GetMapping("/hogehoge")
	private String hogehoge(
			@RequestParam(required = false, defaultValue = "3") String fizznum,
			@RequestParam(required = false, defaultValue = "5") String buzznum,
			Model model) {
		
		int fizz = Integer.parseInt(fizznum);
		int buzz = Integer.parseInt(buzznum);
		StringBuffer sb = new StringBuffer();
		
		for (int i = 1; i <= 100; i++) {
			if (i % fizz == 0 && i % buzz == 0) {
				sb.append("fizzbuzz");
			} else if (i % fizz == 0) {
				sb.append("fizz");
			} else if (i % buzz == 0) {
				sb.append("buzz");
			} else {
				sb.append(i);
			}
			sb.append("\r\n");
		}
		model.addAttribute("message", "Hello, SpringBoot & Thymeleaf!");
		model.addAttribute("results", sb.toString());
		return "hoge";
	}

	


	
}