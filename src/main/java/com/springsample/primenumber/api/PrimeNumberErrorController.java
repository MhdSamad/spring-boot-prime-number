
package com.springsample.primenumber.api;

import org.springframework.web.bind.annotation.*;

import org.springframework.boot.web.servlet.error.ErrorController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;

import org.springframework.http.HttpStatus;

@RestController
public class PrimeNumberErrorController implements ErrorController {

  @Override
  public String getErrorPath() {

    return "/error";

  }

  @GetMapping("/error")
  public String handleError(HttpServletRequest request) {

    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

    if (status != null) {

      Integer statusCode = Integer.valueOf(status.toString());

      if (statusCode == HttpStatus.BAD_REQUEST.value()) {

        return "<h1>Please provide a non-negative integer</h1>";

      }

    }

    return String.format("<h1>HTTP Error %s</h1>", status);

  }

}
