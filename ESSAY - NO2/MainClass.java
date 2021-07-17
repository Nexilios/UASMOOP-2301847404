
public class MainClass {
	
	public MainClass() {
		Multithreading_Extends thread1 = new Multithreading_Extends("T1");
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread1);
		Thread t3 = new Thread(thread1);
		Thread t4 = new Thread(thread1);
		Thread t5 = new Thread(thread1);
		Thread t6 = new Thread(thread1);
		Thread t7 = new Thread(thread1);
		Thread t8 = new Thread(thread1);
		Thread t9 = new Thread(thread1);
		Thread t10 = new Thread(thread1);
		
		Multithreading_Implements thread2 = new Multithreading_Implements("T2");
		
		Thread td1 = new Thread(thread2);
		Thread td2 = new Thread(thread2);
		Thread td3 = new Thread(thread2);
		Thread td4 = new Thread(thread2);
		Thread td5 = new Thread(thread2);
		Thread td6 = new Thread(thread2);
		Thread td7 = new Thread(thread2);
		Thread td8 = new Thread(thread2);
		Thread td9 = new Thread(thread2);
		Thread td10 = new Thread(thread2);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		td1.start();
		td2.start();
		td3.start();
		td4.start();
		td5.start();
		td6.start();
		td7.start();
		td8.start();
		td9.start();
		td10.start();
	}

	public static void main(String[] args) {
		new MainClass();

	}

}
