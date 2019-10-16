package com.exercise11oop.app;
import com.exercise11oop.model.Cat;


public class CatApp {

	
	public static void main(String[] args) 
	{
		Cat michi =new Cat();
		
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(3);

		System.out.println("Michi´s id :" +michi.getId());
		System.out.println("Michi´s name :" +michi.getName());
		System.out.println("Michi´s Age :" +michi.getAge());
	}
	}

