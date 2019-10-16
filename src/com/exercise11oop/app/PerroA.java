package com.exercise11oop.app;
import com.exercise11oop.model.Perro;

public class PerroA {

	public static void main(String[] args) 
	{
		// way 1
		Perro pluto;
		pluto=new Perro();
		
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's heigth: "+pluto.height);
		System.out.println("Pluto's id: "+pluto.id+"\n");
		//Way 2
		//Perro tribilin = new Perro();
		
		pluto.age =15;
		pluto.height=50;
		pluto.id=10;
		
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's heigth: "+pluto.height);
		System.out.println("Pluto's id: "+pluto.id+"\n");
		
		Perro firulais=new Perro (1,"Firulais","Labrador",5,60.0);
		System.out.println("firulais age: "+firulais.age);
		System.out.println("firulais heigth: "+firulais.height);
		System.out.println("firulais id: "+firulais.id+"\n");
		
		Perro lucho=new Perro (1,"Firulais");
		System.out.println("lucho age: "+lucho.age);
		System.out.println("lucho heigth: "+lucho.height);
		System.out.println("lucho id: "+lucho.id+"\n");
	}

}
