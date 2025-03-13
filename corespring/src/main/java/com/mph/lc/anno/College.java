package com.mph.lc.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Configuration
public class College {
	@Value("1500")
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "College [id=" + id + "]";
	}
	@PostConstruct
	public void initCollege() {
		System.out.println("Createddddd");
	}
	@PreDestroy
	public void desCollege() {
		System.out.println("Deletedddddddddd");
	}

}
