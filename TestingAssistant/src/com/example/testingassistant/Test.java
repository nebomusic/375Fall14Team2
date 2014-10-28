package com.example.testingassistant;

public class Test {
	
	public String teacher;
	public String type;
	public int testId = 1;
	public String startTime;
	public String outTime;
	public int elapsedTime;
	public String subject;
	public Test (){
		
	}
	public String getSubject(){
		return subject;
	}
	public void setSubject(String z){
		subject = z;
	}
	public String getTeacher() {
		return teacher;
	}
	
	public void setTeacher(String t){
		teacher = t;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String r){
		type = r;
	}

	public int getTestId(){
		return testId;
	}

	
	
}