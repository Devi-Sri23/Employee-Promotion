package com.empromotion;

public class employee {
private int empId;
private String name;
private String des;
private double sal;
private int performRating;
employee(int empId,String name,String des,double sal,int performRating){
	this.empId=empId;
	this.name=name;
	this.des=des;
	this.sal=sal;
	this.performRating=performRating;
}
public int getEmpId() {
	return empId;
}
public String getName() {
	return name;
}
public String getDes() {
	return des;
}
public double getSal() {
	return sal;
}
public int getPerformRating() {
	return performRating;
}
public void setDes(String des) {
	this.des=des;
}
public void setSal(double sal) {
	this.sal=sal;
}
public void promoteEmployee() {
	if(performRating>=4) {
		sal=sal+(sal*0.20);
		if (des=="Developer") {
	        des = "Senior_Developer";
	    } else if (des=="Senior_Developer") {
	        des = "Team_Lead";
	    } else if (des=="Team_Lead") {
	        des = "Manager";
	    }
	}else {
		System.out.println("Employee has no promotion");
	}
}
}
