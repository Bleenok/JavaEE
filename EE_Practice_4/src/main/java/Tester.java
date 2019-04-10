package com.AspectJ.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

@Aspect
public class Tester {
    @Before("execution(public * *Info())")
    public void request() {
        Date date = new Date();
        System.out.println("Request time:" + date.toString());
    }

    @Before("g580Methods()")
    public void g580Advice() {
        System.out.println("Try it bro");
    }

    @Pointcut("within(com.AspectJ.aspectj.Razer)")
    public void g580Methods() {
    }


    @Before("k10Methods()")
    public void k10Advice() {
        System.out.println("WTF trash laptop");
    }

    @Pointcut("within(com.AspectJ.aspectj.K10)")
    public void k10Methods() {
    }

    @After("execution(public * com.AspectJ.aspectj.G580.setCondition(..))")
    public void conditionSet(JoinPoint joinPoint) {
        G580 laptop = (G580) joinPoint.getTarget();
        if (laptop.condition.equals("Fine")) {
            laptop.name = laptop.name.concat(" fine");
        }
        System.out.println("Name changed");
    }
}