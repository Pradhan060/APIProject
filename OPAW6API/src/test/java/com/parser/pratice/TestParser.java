package com.parser.pratice;

import java.io.File;

public class TestParser {

	public static void main(String[] args) {
		
//		Employee eobj = new Employee("Rajesh", "male", 25, 30000);
//		
//		ParserJson parser = new ParserJson();
//		parser.marshalling(eobj);
//		
//		System.out.println("pass");
		
		File file = new File("employee.json");
		ParserJson parser = new ParserJson();
		Employee eobj = parser.unmarshalling(file, Employee.class);
		
		System.out.println(eobj);
	}
}
