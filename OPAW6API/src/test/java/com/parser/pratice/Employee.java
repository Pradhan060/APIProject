package com.parser.pratice;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value = {
		"name",
		"id",
		"gender",
		"salary"
})
public class Employee {

	private String name, gender;
	private int id, salary;
	
	public Employee(String name, String gender, int id, int salary) {
		
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "name : " + name + "\n" + "id : " + id + "\n" + "gender : " + gender + "\n" + "salary : " + salary ;
	}
	
	public Employee() {
		
	}
}
















