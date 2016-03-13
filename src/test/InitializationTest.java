package test;

public class InitializationTest {
	public static void main(String args[]){
		System.out.println("creating 1");
		new Cupboard();
		System.out.println("creating 2");
		new Cupboard();
		InitializationTest i = new InitializationTest();
		i.m(1,2);
	}
	
	public static String x(){
		System.out.println("xxxxxxxx");
		return "xxxxxxxxx";
	}
	
	public  void m(int i, int... j){
		System.out.println("i");
	}
	public  void m(int i){
		System.out.println("xxxxxxxx");
	}
}

class Bowl {
	Bowl(int marker){
		System.out.println("bowl"+ marker);
	}
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("table()");
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
	static Bowl bowl3 = new Bowl(3);
	Cupboard(){
		System.out.println("cupboard()");
		new Bowl(4);
	}
}
