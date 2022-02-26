package com.dit.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Param Cons");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class ObjectReadWriteDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee ram = new Employee(1001, "Ram Kumar", 10000);
		
//		object to byte file: Serialization
		
		FileOutputStream fo = new FileOutputStream("E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs\\sample.txt");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		os.writeObject(ram);
		
		os.close();
		fo.close();
		
		System.out.println("Object Write Done");
		
//		Byte file to object data: Deserialization
		
		FileInputStream fs = new FileInputStream("E:\\DIT_Java_Batch-1\\Java_TTBatch-1_Eclipse\\File\\songs\\sample.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		
		Employee e = (Employee)oi.readObject();
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());

	}

}
