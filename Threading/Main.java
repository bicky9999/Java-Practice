package threading;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		// Threading = Allows a program to run multiple tasks simultaneously
		//				Helps improve performance with time-consuimg operations
		//				(File I/O, network communication, or any background tasks)
		
		// How to create a Thread
		// Option 1. Extend the Thread class (simpler)
		// Option 2. implement the Runnable interface (better) // This method is used here..
	
	Scanner Scanner = new Scanner(System.in);
		
	MyRunnable myRunnable = new MyRunnable();
	Thread thread = new Thread(myRunnable);
	thread.setDaemon(true); // ends main thread prematurely
	thread.start();
	
	System.out.println("Enter your name within 5 seconds");
	System.out.println("What's your name?");
	String name = Scanner.nextLine(); 
	System.out.println("Time's up!!");

	Scanner.close();
	}
}


package threading;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e){
				System.out.println("Something went wrong!");
			}
			
			if ( i == 5) {
				System.out.println("Time's up!!");
				System.exit(0); 
			}
		}
	}
}
