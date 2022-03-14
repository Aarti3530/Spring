package com.practice.firstproj.MavenPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	
	Computer com;
	void code() {
		this.com.code();
	}
	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}

}
