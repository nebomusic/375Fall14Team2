package com.example.testingassistant;

import java.util.ArrayList;
import java.util.List;

public class TestingCenter {
	
 private List <Student> students;
 private List <Test> tests;
 
 public TestingCenter() {
	 students = new ArrayList<Student>(0);
	 tests = new ArrayList<Test>(0);
 }
 
 public void addStudent (Student s){
students.add(s);
 }
 public void addTest (Test t){
	 tests.add(t);
 }
 public List<Student> getStudent() {
	 return students;
 }
 
 public List<Test> getTest(){
	 return tests;
 }
 
}
