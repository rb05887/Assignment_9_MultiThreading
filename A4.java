package test;

public class A4 {
	public static void main(String[] args) {
		String[] course= {"Java","J2EE","Spring"};
		
		for(String str :course) {
			MyRunnable r1=new MyRunnable("Java");
			Thread t1=new Thread(r1);
			t1.start();
			MyRunnable r2=new MyRunnable("J2EE");
			Thread t2=new Thread(r2);
			t2.start();
			MyRunnable r3=new MyRunnable("Spring");
			Thread t3=new Thread(r3);
			t3.start();
		}
	}
}

class MyRunnable implements Runnable {
	private String str;
public MyRunnable(String s) {
	this.str=s;
}	
	public void run() {
		System.out.println(str);
	}
	
}


