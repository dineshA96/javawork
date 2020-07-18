package org.ja;

public class Pojo1 {
public static void main(String[] args) {
	Pojo p=new Pojo();
	p.setName("aaa");
	p.setId("bbb");
	p.setSalary(100000);
	System.out.println(p.getName());
	System.out.println(p.getId());
	System.out.println(p.getSalary());
	
	Pojo p1=new Pojo();
	p1.setName("asasas");
	p1.setId("afafsf");
	p1.setSalary(444444);
	System.out.println(p1.getName());
	System.out.println(p1.getId());
	System.out.println(p1.getSalary());
}
}
