package com.example.practice.retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Retryable(value= RuntimeException.class, maxAttempts = 2, backoff = @Backoff(delay = 5000))
    public void testRetry(){
        System.out.println("Inside testRetry()");
        throw new RuntimeException("Test Exception");
    }
}
