package com.exercise11oop.model;

public class Angora extends Cat 
{		//propiedades
	private double mouthLong;

	//constructor vacio e inicializado
	public Angora()
	{
	}
	
	public Angora(int id, String name, int age)
	{
		super(id,name,age);
		this.mouthLong=mouthLong;
	}
	
	//getters y setters
	public double getMouthLong()
	{
		return mouthLong;
	}
	public void setMouthLong(double mouthLong)
	{
		this.mouthLong=mouthLong;
	}
	//to string method specific to Angora Class
	public String ToString()
	{
		return "ID:["+getId()+"],name:["+getName()+"],age:["+getAge()+"], mouthLongitude:["+mouthLong+"]";
	}

	@Override
	public void Meow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Scratch() {
		// TODO Auto-generated method stub
		
	}
}
