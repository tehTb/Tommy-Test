package com.mod.niklas.test;

public class MinString {
	public String s;
	
	public MinString(String s){
		this.s = s;
	}
	
	public String getMinString(){
		return s;
	}
	
	public void setString(String newString){
		s = newString;
	}
	
	public void printString(){
		System.out.println(s);
	}
}
