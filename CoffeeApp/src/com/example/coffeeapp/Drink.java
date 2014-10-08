package com.example.coffeeapp;

import java.util.Date;



public class Drink {
	//Fields
	private boolean hot;  // hot or cold
	private  String type; //Coffee, tea...
	private String flavor; //Mocha...
	private String topping; //drizzle
	private String dairy; //milk, soy..
	private int size; //in ounces
	private String instructions; //special instructions
	private Date date;  // Date and time ordered
	private boolean served; // was this drink served 
	
	//Constructor - no initialization of fields 
	public Drink()   {
		
	}//End Constructor
	
	//Second Constructor with fields 
	public Drink(boolean h, String t, String f, String tp, String d, int sz, String ins)   {
		hot = h;
		type = t;
		flavor = f;
		topping = t; 
		dairy = d;
		size = sz;
		instructions = ins;
		served = false;

	}//End Second Constructor 
	
	
	//Modifiers 
	public void setHot(boolean h)  {
		hot = h;
	}
	public void setType(String t)  {
		type = t;
		}
	public void setFlavor(String f)  {
		flavor = f;
	}
	public void setDairy(String d)   {
		dairy = d;
	}
	public void setSize(int s)   {
		size = s;
	}
	public void setInstructions(String i)  {
		instructions = i;
	}
	public void setDate(Date d)   {
		date = d;
		}
	
	
	//Accessors
	public boolean getHot() {
		return hot;
	}
	public String getType()  {
		return type;
	}
	public String getFlavor()  {
		return flavor;
	}
	public String getTopping()  {
		return topping;
	}
	public String getDairy()  {
		return dairy;
		}
	public int getSize()  {
		return size;
	}
	public Date getDate()  {
		return date;
	}
	public boolean getServed()  {
		return served;
	}
	public void setServed(boolean s)  {
		served = s;
	}
} // end class Drink 
