package com.assignment_02;

class Employee
{
	private int id;
	private String name;
	private double salary;
	public Employee() {
	}
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
}

public class Question_02 {

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[5];
		
		arr[0] = new Employee(1,"Aditya",50000);
		arr[1] = new Employee(2,"Ankush",150);
		arr[2] = new Employee(3,"Nishad",40000);
		arr[3] = new Employee(4,"Mayur",20000);
		arr[4] = new Employee(5,"Omkar",60000);
		
		selectionSort(arr);
	}

	private static void selectionSort(Employee[] arr) {
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i].getSalary() > arr[j].getSalary()){
					Employee temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (Employee e : arr) {
			System.out.println(e);
		}
		
	}

}
