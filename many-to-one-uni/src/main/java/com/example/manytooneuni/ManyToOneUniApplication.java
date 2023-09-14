package com.example.manytooneuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.manytooneuni.entity.Application;
import com.example.manytooneuni.entity.Mobile;
import com.example.manytooneuni.repository.ApplicationRepository;
import com.example.manytooneuni.repository.MobileRepository;

@SpringBootApplication
public class ManyToOneUniApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneUniApplication.class, args);
	}

	@Autowired
	private ApplicationRepository ar;
	//@Autowired
	//private MobileRepository mr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.setName("OnePlus");
		//mr.save(m);
		Application a=new Application();
		a.setName("App1");
		a.setMobile(m);
		//ar.save(a);
		//Application a1=new Application();
		a.setName("App2");
		a.setMobile(m);
		ar.save(a);
		
		
	}

	
	
}
