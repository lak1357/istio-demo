package com.mitrai.istio.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${UPSTREAM_URI:http://time.jsontest.com}")
	private String upstream_uri;

	@Value("${SERVICE_NAME:istio-demo}")
	private String service_name;

	@RequestMapping("/variables")
	public String variables() {
		return upstream_uri + " : " + service_name;
	}

}
