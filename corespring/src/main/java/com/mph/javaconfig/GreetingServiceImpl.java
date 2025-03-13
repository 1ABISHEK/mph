package com.mph.javaconfig;

public class GreetingServiceImpl implements GreetingServices {
	private String greetMsg;

	public GreetingServiceImpl() {

	}

	public GreetingServiceImpl(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	@Override
	public void sayHi() {
		System.out.println("Hi Everyone " + greetMsg);

	}
}
