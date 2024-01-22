package com.shordan.SpringDemo;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
//Topic: Singleton vs Prototype
    	
        //Alien obj1 = (Alien) factory.getBean("alien");
        //obj1.code();
        //obj1.age=15;
        //System.out.println(obj1.age);
       
        //Alien obj2 = (Alien) factory.getBean("alien");
        //obj2.code();
        //System.out.println(obj2.age);//tambien imprimi 15 a pesar de no haber declarado un valor para age de obj2
        //Esto sucede porque por defecto spring usa un patron de diseño "SINGLETON" (por defecto el contenedor de spring dará 1 objeto)
        //para cambiar eso ponemos un: scope = "prototype" en el file spring.xml
        //singleton (crea 1 solo objeto), protorype(puedes crear multiples objetos)
        
//Topic: getter & setter injection
    	//generamos getter and setter in alien class file
    	//I want to receive a default age different to 0 
    	//one option is just initialize inside of alien class attributes, but I want to assign age value in spring.xml
    	//for that I define property with name and value in sping.xml
    	//el setAge se ejecuta por default luego de crear el objeto ya que esta en el spring.xml property
    	
    	//Alien object created
    	//Age assigned
    	//hi im coding
    	//10

    	
        Alien obj1 = (Alien) factory.getBean("alien");
        obj1.code();
        System.out.println(obj1.getAge());
        
//Topic: ref attribute
    	
        //si tienes una nueva clase debes crear si o si un bean en el spring.xml
        //en el xml, se debe hacer una referencia del bean laptop (su id) mediante ref = laptop(id del bean laptop)
        
        
    }
}
