package com.data;

public class SampleInstants {
	public SampleInstants(int a) {
		System.out.println("integer");
		System.out.println(a);
		
	}
	public SampleInstants(){
		super();

		System.out.println("default");
		System.out.println(10);
	}
	public SampleInstants(String a) {
		System.out.println("String");
		System.out.println(a);
	}
	public static void main(String[] args) {
		SampleInstants sc2= new SampleInstants("9");
		SampleInstants sc1= new SampleInstants();
		
		SampleInstants sc3= new SampleInstants(10);
		
	}
	
}
