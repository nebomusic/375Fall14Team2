package com.example.coffeeapp;

import java.util.ArrayList;
import java.util.List;

public class Orders {
	//Field
	private List <Drink> drinks;
	
	//Constructor
	public Orders(){
		drinks = new ArrayList<Drink> (0);
	} //End Constructor
	
	//Accessor
	public List <Drink> getDrinks(){
		return drinks;
	}
// Add Drink to the List
	public void addDrink(Drink d){
		drinks.add(d);
	}
	
	//Total Drinks Served
	public int getNumServed(){
		int total = 0;
		for(int d=0; d<drinks.size(); d++){
			if (drinks.get(d).getServed()== true){
				total++;
			}
			
		}
	return total;
	}//End get NumServed


	//Get individual order
	public Drink getDrink(int i){
		return drinks.get(i);
	}
	
//Get the Drinks ordered
	public int getNumDrinks(){
		return drinks.size();
	}
	//End Monarchik Code
	//10.8.2014 In Class
	
	
	}//End Orders Class

