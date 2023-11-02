
/*** I observed that my thread1 is still running  and return  
 *   a true value but in case of thread2 it stop and return false value
 ***  with the help of isAlive() method we can check our thread is running or not 
*/

package test;

public class A3 {
	public static void main(String[] args) {

		Demo d = new Demo(); 
		d.startThreads();

		System.out.println("Thread 1 is running: " + d.isThread1Running());
		System.out.println("Thread 2 is running: " + d.isThread2Running());
	}

}

class Demo {
	private Thread thread1;
	private Thread thread2;

	public Demo() {
		thread1 = new Thread(); {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread 1 - Iteration " + i);
			}
		}

		thread2 = new Thread();{
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread 2 - Iteration " + i);
			}
		}
	}

	public void startThreads() {
		thread1.start(); 
		thread2.start(); 
	}

	public boolean isThread1Running() {
		return thread1.isAlive(); 
	}

	public boolean isThread2Running() {
		return thread2.isAlive(); 
	}
}
