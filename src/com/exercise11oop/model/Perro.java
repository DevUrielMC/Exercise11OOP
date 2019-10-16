package com.exercise11oop.model;

public class Perro 
{
	public int id;
	private String name;
	protected String breed;
	public int age;
	public double  height;
	
	//metodo constructor vacio
		public Perro()
		{	
		}
		
	//constructor
	public Perro(int id,String name, String breed, int age, double height)
	{
		this.id=id;
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.height=height;
	}
	
	//constructor para ejemplo de lucho
	public Perro(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	
	
}
