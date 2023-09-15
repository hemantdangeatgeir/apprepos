package com.clinicalpatient.intelligence;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QueryBuilderContrlr {

	@GetMapping("/getQueryCatalogList")
	public String getQueryCatalog() {
		return "response by getQueryCatalog api.";
	}
	@RequestMapping(value="/getUserList")
	public String getUserList() {
		return "response by getUserList";
	}
}
