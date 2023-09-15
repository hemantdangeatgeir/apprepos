package com.clinicalpatient.intelligence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QueryBuilderContrlr {

	@RequestMapping(value="/getQueryCatalog")
	public String getQueryCatalog() {
		return "response by getQueryCatalog";
	}
	@RequestMapping(value="/getUserList")
	public String getUserList() {
		return "response by getUserList";
	}
}
