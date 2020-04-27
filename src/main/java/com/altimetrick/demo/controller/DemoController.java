package com.altimetrick.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.altimetrick.demo.entity.ResponseVO;
import com.altimetrick.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

	@Autowired
	DemoService demoService;
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleError() {
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseVO> getPredictData() {
		ResponseVO response = demoService.getPredictData();
		if (response.getStatus().equals(ResponseVO.FAIL)) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
	}
}
