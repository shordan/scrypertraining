//es mejor tener todas nuestras model classes en el paquete model ([se le agrega el .model al final
package com.shordan.springmvcboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	public Alien() {}
	
	public Alien(int aid, String aname)
	{
		super();
		this.aid=aid;
		this.aname=aname;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
