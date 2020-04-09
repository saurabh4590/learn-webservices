package com.example.employeemanagement.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	/**
	 * Static filtering of JSON Values
	 * 
	 * @return
	 */
	@GetMapping("/staticFiltering")
	public StaticFilterSomeBean getSomeBean() {
		StaticFilterSomeBean somebean = new StaticFilterSomeBean("value1", "value2", "value3", "value4", "value5");
		return somebean;
	}

	/**
	 * Dynamic filtering of JSON Values
	 * 
	 * @return
	 */
	@GetMapping("/dynamicFiltering")
	public MappingJacksonValue getSomeDynamicBean() {
		DynamicFilterSomeBean somebean = new DynamicFilterSomeBean("value1", "value2", "value3", "value4", "value5");

		// Dynamic Filtering - Start
		SimpleBeanPropertyFilter beanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field4", "field5");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("filterValue", beanPropertyFilter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(somebean);
		jacksonValue.setFilters(filterProvider);
		// Dynamic Filtering - End

		return jacksonValue;

	}
}
