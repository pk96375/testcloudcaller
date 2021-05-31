package com.testcloud.caller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerController {

	@Value("${cloud.rest.url}")
	private String url;
	@Autowired
	RestTemplate template;

	@GetMapping(value = "/call")
	public ResponseEntity<String> callWebService(@RequestParam("name") String name) {

		return template.getForEntity(url + "?name=" + name, String.class);
	}
}
