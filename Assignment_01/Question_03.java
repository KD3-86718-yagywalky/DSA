package com.sunbeam.Assignment_01;

import java.util.Scanner;

class Employee{
	
	int id;
	String name;
	public int length;
	public Employee() {
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;	
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Question_03 {
	
	public static void linearSearchByid(Employee[] arr, Object key) {
		
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if (key instanceof Integer) {
				Integer name = (Integer) key;
				if(arr[i].id == name) {
				System.out.println("Employee is found :- "+arr[i]);
				index++;
			}	
			}
			else if(key instanceof String)
			{
				String name1 = (String ) key;
				if(arr[i].name.equals(name1))
				{
					System.out.println("Employee found :- "+arr[i]);
					index++;
				}
			}
		}
		if(index ==0)
		System.out.println("Employee is not found .............");
	}

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[5];
		
		arr[0] = new Employee(1,"Aditya");
		arr[1] = new Employee(2,"Ankush");
		arr[2] = new Employee(3,"Nishad");
		arr[3] = new Employee(4,"Mayur");
		arr[4] = new Employee(5,"Omkar");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id :- ");
		int key = sc.nextInt();
		
		System.out.print("Enter name of the Employee :- ");
		String name =  sc.next();
		linearSearchByid(arr,name);
		//linearSearchByName(arr,name);
	}
	
	public static void linearSearchByName(Employee[] arr, String name) {
		
		int index =0;
		
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i].name.equals(name))
			{
				System.out.println("Employee found Successfully :- "+arr[i]);
				index++;
			}
		}
		if(index ==0)
			System.out.println("Employee not Found ");
		
	}
	
	

}
