package com.xworkz.spring.thingstest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.SpringConfigure;
import com.xworkz.spring.things.Application;
import com.xworkz.spring.things.Area;
import com.xworkz.spring.things.Bus;
import com.xworkz.spring.things.Chocolate;
import com.xworkz.spring.things.City;
import com.xworkz.spring.things.Cycle;
import com.xworkz.spring.things.Fish;
import com.xworkz.spring.things.Girl;
import com.xworkz.spring.things.God;
import com.xworkz.spring.things.Mall;
import com.xworkz.spring.things.Mask;
import com.xworkz.spring.things.Milk;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Patient;
import com.xworkz.spring.things.Road;
import com.xworkz.spring.things.Temple;

public class SpringTester {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigure.class);
		Road road = spring.getBean(Road.class);
		System.out.println(road);

		Bus bus = spring.getBean(Bus.class);
		System.out.println(bus);

		Cycle cycle = spring.getBean(Cycle.class);
		System.out.println(cycle);

		Girl girl = spring.getBean(Girl.class);
		System.out.println(girl);

		Mask mask = spring.getBean(Mask.class);
		System.out.println(mask);

		Milk milk = spring.getBean(Milk.class);
		System.out.println(milk);

		Patient patient = spring.getBean(Patient.class);
		System.out.println(patient);

		Chocolate chocolate = spring.getBean(Chocolate.class);
		System.out.println(chocolate);

		Fish fish = spring.getBean(Fish.class);
		System.out.println(fish);

		Area area = spring.getBean(Area.class);
		System.out.println(area);

		City city = spring.getBean(City.class);
		System.out.println(city);

		Park park = spring.getBean(Park.class);
		System.out.println(park);

		Temple temple = spring.getBean(Temple.class);
		System.out.println(temple);

		God god = spring.getBean(God.class);
		System.out.println(god);

		Mall mall = spring.getBean(Mall.class);
		System.out.println(mall);

		Application application = spring.getBean(Application.class);
		System.out.println(application);

	}

}
