package com.mitrai.istio.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

	@Value("${UPSTREAM_URI:http://time.jsontest.com}")
	private String upstream_uri;

	@Value("${SERVICE_NAME:istio-demo}")
	private String service_name;

	@RequestMapping("/hello")
	public String hello() {

		Long start = System.currentTimeMillis();

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(upstream_uri, String.class);

		Long end = System.currentTimeMillis();

		return service_name + " : " + (end - start) + "ms" + "\n" + upstream_uri + " : " + result;
	}

	@RequestMapping("/variables")
	public String variables() {
		return upstream_uri + " : " + service_name;
	}

}
