
import java.io.Serializable;

public class thread implements Runnable  {
	
	//synchronized	
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		
		
		for(int i = 0; i <= 1000; i++) {
			System.out.println(priority+"run()"+threadName);
		}
		
		if (threadName.equals("MyDream") ) {
			method1();
		}else {
			method3();
			}
		}

		
		
	
	public void method1() {
		
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println("before sleep");
				Thread.currentThread().sleep(100);
				System.out.println("After sleep");
				}
			
			
		}catch(Exception e) {}
		
	}
	
	public void method3() {
		for(int i = 0; i <= 10; i++) {
		System.out.println(".....method3......");
		}
	}

	public static void main(String[] args) {
		thread s = new thread();
		Thread t = new Thread(s);
		Thread x = new Thread(s);
		
		//t.setPriority(1); // minimum priority
		//x.setPriority(10); // minimum priority
		
		
		t.setName("MyDream");
		x.setName("EnduBridge");
		
		
		
		t.start();
		x.start();
		//s.method1();
		
		System.gc();
		//Runtime runtime = null ;//= new Runtime();
		
		System.out.println("garbage Collector");
		
	}
	
}