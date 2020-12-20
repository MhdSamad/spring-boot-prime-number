
package com.springsample.primenumber.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.springsample.primenumber.service.PrimeNumberService;

@RestController
@RequestMapping("/api/primenumber")
public class PrimeNumberController {

  @Autowired
  private PrimeNumberService primeNumberService;

  @GetMapping("/{num}")
  public ResponseEntity<String> checkPrimeNumber(@PathVariable("num") int num) {

    // Make sure num is non-negative
    if (num < 0)
      return new ResponseEntity<>("<h1>Please provide a non-negative integer</h1>", HttpStatus.BAD_REQUEST);

    boolean isPrimeNumber = primeNumberService.isPrimeNumber(num);

    String response = String.format("<h1>%d is%s a prime number</h1>", num, (isPrimeNumber ? "" : " not"));

    return new ResponseEntity<>(response, HttpStatus.OK);

  }

}
