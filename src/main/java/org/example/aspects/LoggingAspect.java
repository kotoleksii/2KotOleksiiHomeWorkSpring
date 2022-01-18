package org.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public String getFirstName())")
    public void beforeGetFirstNameAdvice() {
        System.out.println("beforeGetFirstNameAdvice: спроба отримати ім`я");
    }

    @Before("execution(public String getLastName())")
    public void beforeGetLastNameAdvice() {
        System.out.println("beforeGetLastNameAdvice: спроба отримати прізвище");
    }

    @Before("execution(public int getZipCode())")
    public void beforeGetZipCodeAdvice() {
        System.out.println("beforeGetZipCodeAdvice: спроба отримати zip-code");
    }

    @Before("execution(public String getCountry())")
    public void beforeGetCountryAdvice() {
        System.out.println("beforeGetCountryAdvice: спроба отримати країну проживання");
    }

    @Before("execution(public String getCity())")
    public void beforeGetCityAdvice() {
        System.out.println("beforeGetCityAdvice: спроба отримати місто");
    }
}
