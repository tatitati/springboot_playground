package meeee.theater.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHappyFortune implements ServiceFortune {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
