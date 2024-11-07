package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data  // pour gérer les getters et les setters lambok le fait 

@Entity // pour dire c'est une entité
public class Patient {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	//jpa above! 
	private Long id;
	private String prenom;
	private String nom;
	private int age;
	private boolean malade;
	public Patient() {
		
	}
	public Patient(Long id, String prenom, String nom, int age, boolean malade) {
		
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.malade = malade;
	}
}


