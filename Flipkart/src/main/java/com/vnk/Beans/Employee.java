package com.vnk.Beans;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Employee implements Serializable {
private String Name;
private Long phno;
private Byte age;
private byte experiance;
public Employee() {}
public Employee(String name, Long phno, Byte age, byte experiance) {
	super();
	Name = name;
	this.phno = phno;
	this.age = age;
	this.experiance = experiance;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
public Byte getAge() {
	return age;
}
public void setAge(Byte age) {
	this.age = age;
}
public byte getExperiance() {
	return experiance;
}
public void setExperiance(byte experiance) {
	this.experiance = experiance;
}

}
