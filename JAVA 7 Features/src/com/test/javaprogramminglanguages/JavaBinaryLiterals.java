package com.test.javaprogramminglanguages;

public class JavaBinaryLiterals {

	public static void main(String[] args) {
	
		int i=0b0101;
		byte b=0B0101;
		short s=0b0101;
		long l=0B0101;
		Integer I=0b0101;
		Short S=0b0101;
	//	Long L=0B0101;					Not possible
		Byte B=0b0101; 
		
		System.out.println("int"+i);
		System.out.println("byte"+b);
		System.out.println("short"+s);
		System.out.println("long"+l);
		System.out.println("Integer"+I);
		System.out.println("Short"+S);
		System.out.println("Byte"+B);
		
		int left=0b0101<<1;
		
		System.out.println("int after one bit left shift"+left);
		
		int right=0b0101>>1;
		
		System.out.println("int after one bit right shift"+right);
		
		int and=i&0b1010;
		
		System.out.println("After and "+and);
		
		int or=i|0b1010;
		
		System.out.println("After or "+or);
	}

}
