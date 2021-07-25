package com.parser.pratice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ParserJson {

	public void marshalling(Employee eobj)
	{
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("employee.json"), eobj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Employee unmarshalling(File filename , Class<Employee> eobj)
	{
		ObjectMapper mapper = new ObjectMapper();
		Employee employData = null;
		try {
			employData = mapper.readValue(filename, eobj);
		} catch (Exception e) {
			
		}
		
		return employData;
	}
}












