package com.exercise11oop.app;
import com.exercise11oop.model.Perro;

public class PerroA {

	public static void main(String[] args) 
	{
		// way 1
		Perro pluto;
		pluto=new Perro();
		//Way 2
		Perro tribilin = new Perro();
		
		pluto.age =15;
		pluto.height=50;
		pluto.id=10;
		
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's heigth: "+pluto.height);
		System.out.println("Pluto's id: "+pluto.id);
	}

}
