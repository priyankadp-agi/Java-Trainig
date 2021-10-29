package com.mavan.spring;

import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
	
	public String greeting = "good moring";

	public MorningGreeting() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(greeting);
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
