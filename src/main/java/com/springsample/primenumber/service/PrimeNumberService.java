
package com.springsample.primenumber.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumberService {

  public boolean isPrimeNumber(int num) {

    // Check if num is 0 or 1
    if (num == 0 || num == 1)
      return false;

    // Check if num is 2
    if (num == 2)
      return true;

    // Check if num is a multiple of 2
    if (num % 2 == 0)
      return false;

    // If not, then just check the odd numbers
    for (int i = 3; i * i <= num; i += 2) {

      if (num % i == 0)
        return false;

    }

    return true;

  }

}
