package com.TestNg;


public class Constant_Static {
public static String value;
	 public Constant_Static() {
value="starc";
	 }
	public void abc() {
System.out.println("data");
	}
	private static void xyz() {
System.out.println(value);	

	}
public static void main(String[] args) {
	xyz();//before constructor invoke value=null;
	Constant_Static f=new Constant_Static();
   f.abc();
//xyz();//after constructor invoke value=starc

}



}
	


