package com.xworkz.collectionapp.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class DatabaseTester {

	public static void main(String[] args) {
		
Collection<DatabaseVendorDTO> database = new ArrayList<DatabaseVendorDTO>();
database.add(new DatabaseVendorDTO("MS Sql Server", "Microsoft", 100, 200.0,Type.RALATIONAL));
database.add(new DatabaseVendorDTO("PostgreSql", "Merriman", 200, 100.0,Type.SQL));
database.add(new DatabaseVendorDTO("MongoDB", "Dwight Merriman", 110, 50.0,Type.HIERARCHICAL));
database.add(new DatabaseVendorDTO("IBM DB2", "Microsoft", 150, 90.0,Type.SQL));
database.add(new DatabaseVendorDTO("Redis", "Dwight", 250, 150.0,Type.RALATIONAL));

System.out.println("Converting to upper case");
System.out.println();
database.stream().map(ele->ele.getDevelopedBy().toUpperCase())
.collect(Collectors.toSet())
.forEach(dto->System.out.println(dto));

System.out.println();
System.out.println("Finding licenceCost less than 100 and type is sql");
System.out.println();

database.stream().filter(e->e.getLicenceCost()<100 && e.getType().equals(Type.SQL))
.collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
	
	
	}
}
