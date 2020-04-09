package com.example.employeemanagement.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public Somebean getSomeBean() {
		return new Somebean("value1", "value2", "value3");
	}
}
