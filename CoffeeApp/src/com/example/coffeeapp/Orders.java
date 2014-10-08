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
//End: Monarchik
	//10/8/2014 1:46pm
	
	
	
	}//End Orders Class

