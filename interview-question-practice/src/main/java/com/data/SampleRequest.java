package com.data;

public class SampleRequest {
  
	static boolean b=false;
	static  boolean c=true;
	
	public boolean hi(boolean a, boolean b) {
		if (a=b) {
			return true;
			
			
		}else {
			return false;
		}
		

	}
	
	public static void main(String[] args) {
		SampleRequest sr= new SampleRequest();
		boolean b1=sr.hi(b, c);
		System.out.println(b1);

	}

	
	
}
