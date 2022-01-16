package core.programs;

public class TypeCasting {

	public static void main(String[] args) {
		
			   //implicit conversion
				System.out.println("Implicit Type Casting");
				char a='D';
				System.out.println("Value of a: "+a);
				
				int b=10;
				System.out.println("Value of b: "+b);
				
				float c=4.5f;
				System.out.println("Value of c: "+c);
				
				long d=456L;
				System.out.println("Value of d: "+d);
				
				double e=b;
				System.out.println("Value of e: "+e);
				
						
				System.out.println("\n");
				
				System.out.println("Explicit Type Casting");
				//explicit conversion
				
				double x=45.5;
				int y=(int)x;
				System.out.println("Value of x: "+x);
				System.out.println("Value of y: "+y);
				
				double d2 = 456.789;
				float f = (float)d2;
				System.out.println("value of double:" + d2);
				
				double d3 = 43.6789;
				int a3 = (int)d3;
				System.out.println("value of int:" + a3);
				
			}
		}



	
