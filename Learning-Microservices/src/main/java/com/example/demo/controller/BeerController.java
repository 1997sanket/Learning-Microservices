/**
 * 
 */
package com.example.demo.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BeerDto;

/**
 * @author 1997s
 *
 */


// UUID = 5fc03087-d265-11e7-b8c6-83e29cd24f4c
// URL = http://localhost:8080/api/v1/beer/
@RestController
@RequestMapping("api/v1/beer/")
public class BeerController {
	
	
	@GetMapping("{beerId}")
	public BeerDto getBeerById(@PathVariable("beerId") UUID beerId) {
		
		return new BeerDto(beerId, "Proper 12");
	
	}
}
