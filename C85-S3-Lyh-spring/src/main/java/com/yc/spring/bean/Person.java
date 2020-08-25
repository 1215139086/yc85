package com.yc.spring.bean;

import java.util.List;

public class Person {
	private String name;
	
	private String id;
	
	private int age;
	private List<String> killeds;
	private int Height;
	private String alisa;
	private Person friend;
	
	public static Person PersonFactory() {
		Person p=new Person();
		p.setAge(40);
		return p;
	}
	
	public Person PersonFactory1() {
		Person p = new Person();
		p.setAge(20);
		return p;
	}
	public Person() {
		
	}
	
	public Person(int age,String name,String alisa){
		super();
		System.out.println("=======1=======");
		this.name=name;
		this.age=age;
		this.alisa=alisa;
	}
	public Person(String name,int age,String alisa){
		super();
		System.out.println("=======2=======");
		this.name=name;
		this.age=age;
		this.alisa=alisa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getKilleds() {
		return killeds;
	}
	public void setKilleds(List<String> killeds) {
		this.killeds = killeds;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public String getAlisa() {
		return alisa;
	}
	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}

	public void setAlisa(String alisa) {
		this.alisa = alisa;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + ", killeds=" + killeds + ", Height=" + Height
				+ ", alisa=" + alisa + "]";
	}
	
	
	
}
