package test;

public class A1 {
	public static void main(String[] args) {
		Number n = new Number();
		Alphabets a=new Alphabets();
		n.start();
		a.start();
	}
}
class Number extends Thread {
	public void run() {
		for (int i = 1; i <= 10; ++i) {
			System.out.print(i+" ");
		}
	}
}

class Alphabets extends Thread {
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			System.out.print(ch+" ");
		}
	}
}
