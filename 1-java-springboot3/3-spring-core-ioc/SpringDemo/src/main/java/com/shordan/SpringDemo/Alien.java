package com.shordan.SpringDemo;

public class Alien {
	
	//debemos asegurarnos de poner nuestras variables privadas, solo con getter y setter podemos obtenerlas
	private int age;//si no pongo un valor por defecto lo asume como 0
	private Computer com;
	
	public Alien()
	{
		System.out.println("Alien object created");
	}
	
	
	
	public Computer getCom() {
		return com;
	}



	public void setCom(Computer com) {
		this.com = com;
	}



	//Ejemplo con getter and setter injection
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age assigned");
	}
	

	
	
	public void code()
	{
		System.out.println("hi im coding");
		com.compile();
	}

}
