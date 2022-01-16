package abstractclass.java;


abstract class vehicle{
	int speed = 65;
	long distance = 4500;
	vehicle(){
		
		System.out.println("vehicle created....");
	}
	vehicle(int a,long d){
		speed = a;
		distance = d;
		
	}
	abstract void run();
	abstract void stop();
	public void fuel(int a) {
		System.out.println("value is=" + a);
	}
	public void fuel(float x,String y) {
		System.out.println("value is ="+x+"and ="+y);
	}
	public void fuel(char c,int b) {
		System.out.println("value is" + c + "and ="+b);
		
	}
	
}
class vehicle1 extends vehicle{
	@Override
	void run() {
		
	}
	void stop() {
		
	}
}
class twowheeler extends vehicle{
	int no_of_tyres = 2;
	int speed = 45;
	long distance = 4600;
	
	twowheeler(){
		System.out.println("twowheeler is created");
	}
	void run() {
		System.out.println("vehicle is moving");
	}
	void stop() {
		System.out.println("vehicle is stopped");
	}
	 
	 void display() {
		System.out.println("twowheeler-Speed: " +speed+" "+"twowheeler-Distance: "+distance+" "+"twowheeler-no_of_tyres: "+ no_of_tyres);
		System.out.println("vehicle-speed:"+super.speed+"vehicle-distance:"+super.distance);
	 }
	 
}
class threewheeler extends vehicle{
	int no_of_tyres = 3;
	int speed = 40;
	long distance = 4000;
	 void run() {
		System.out.println("vehicle is running");
	}
	void stop() {
		System.out.println("vehicle is stopped");
	}
	threewheeler(){
		System.out.println("three-wheeler is created");
	}
	 void display() {
			System.out.println("three-wheelerSpeed: " +speed+" "+"three-whleerDistance: "+distance+ "no_of_tyres: "+ no_of_tyres);
			System.out.println("vehicle-speed:"+super.speed+"vehicle-distance:"+super.distance);
		 }
	
     
}
class fourwheeler extends vehicle{
	int no_of_tyres = 4;
	int speed = 67;
	long distance = 5000;
	 void run() {
		System.out.println("vehicle is running");
	}
	void stop() {
		System.out.println("vehicle is stopped");
	}
	fourwheeler(){
		System.out.println("four-wheeler is created");
	}
	
	 void display() {
			System.out.println("four-whleerSpeed: " +speed+" "+"four-wheelerDistance: "+distance+" "+"no_of_tyres: "+ no_of_tyres);
			System.out.println("vehicle-speed:"+super.speed+"vehicle-distance:"+super.distance);
		 }
	}
class eightwheeler extends vehicle{
	int no_of_tyres = 8;
	int speed = 35;
	long distance = 3000;
	 void run() {
		System.out.println("vehicle is running");
	}
	void stop() {
		System.out.println("vehicle is stopped");
	}
	eightwheeler(){
		System.out.println("eight-wheeler is created");
	}
	
	 
	 void display() {
			System.out.println("eight-wheelerSpeed: " +speed+" "+"eight-wheelerDistance: "+distance+" "+"no_of_Tyres: "+ no_of_tyres);
			System.out.println("vehicle-speed:"+super.speed+"vehicle-distance:"+super.distance);
		}
		 }
	


public class assignOOps{

	public static void main(String[] args) {
		vehicle1 vv = new vehicle1();
		vv.fuel(45);
		vv.fuel(35.5f,"Hello");
		vv.fuel('a',40);
		vehicle s1 = new twowheeler();
		s1.run();
		s1.stop();
		vehicle s2 = new threewheeler();
		s2.run();
		s2.stop();
		vehicle s3 = new fourwheeler();
		s3.run();
		s3.stop();
		vehicle s4 = new eightwheeler();
		s4.run();
		s4.stop();
		twowheeler t = new twowheeler();
		t.display();
		threewheeler t1 = new threewheeler();
		t1.display();
		fourwheeler t2 = new fourwheeler();
		t2.display();
		eightwheeler t3 = new eightwheeler();
		t3.display();
		

	}

}
