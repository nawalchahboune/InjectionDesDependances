package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.JOptCommandLinePropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

import com.example.demo.dao.PatientRepository;
import com.example.demo.entities.Patient;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private PatientRepository patientRepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepo.save( new Patient(null,"nawal","chahboune",21,false));
		patientRepo.save( new Patient(null,"hicham","chahboune",24,false));
		patientRepo.findAll().forEach(p->{
			System.out.println(p.getPrenom());
		});
		
	}
}
