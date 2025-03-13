package com.mph.xmlconfig;

public class GreetingServiceImpl implements GreetingService {

	private String greetMsg;

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}

	@Override
	public void sayHi() {
		System.out.println("Hi Everyone "+greetMsg);

	}

}
