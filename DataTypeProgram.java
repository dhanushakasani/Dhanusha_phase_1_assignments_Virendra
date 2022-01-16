package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
		boolean status = true;
		System.out.println("welcome to java"  +   status );
		char gender = 'F';
		System.out.println("name as"  + gender);
		int age = 20;
		System.out.println("age is"  + age);
		long dist = 5678456712398L;
		System.out.println("value is too long"  + dist);
		float perct = 56.78f;
		System.out.println("print floating value"  + perct);
		double pi = 3.1456784934;
		System.out.println("value of pi"  + pi);
		int a = 20;
		long ll = a;
		System.out.println("value of long"   +   a);
		long l = 45673867L;
		int aa = (int) ll;
		System.out.println("value of  int"   +    ll);
		char t1 = 'a';
		char t = (char) a;
		System.out.println("value of char"  +  t1);
		double d = 56.78945673;
		float f = (float) d;
		System.out.println("value of float" + f);
		System.out.println("value of double" + d);
		double d1 = 45356.78905674321;
		long l1 = (long) d1;
		int a1 = (int) l1;
		System.out.println("value of double" + d1);
		System.out.println("value of long" + l1);
		System.out.println("value of int" + a1);
		long l2 = 46783467L;
		float f1 = l2;
		System.out.println("float value" + f1);
		byte b;
		int a2 = 456;
	    double d2 = 345.678943;
	    System.out.println("conversion of int to byte");
	    b = (byte) a2;
	    System.out.println("a2 = " + a2 + "b = " + b);
	    System.out.println("conversion of double to byte");
	    b = (byte) d2;
	    System.out.println("d2 =" + d2 + "b = " + b);
	    int a3 = 323;
	    long l3 = a3;
	    System.out.println("long value" + l3);
	    

	}

}
