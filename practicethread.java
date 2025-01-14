public class practicethread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running thread");
        }
        method3();  // Call method3 inside run()
    }

    public void method3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(".....method3......");
        }
    }

    public static void main(String[] args) {
        
        practicethread pt1 = new practicethread();
        practicethread pt2 = new practicethread();
        
        Thread t = new Thread(pt1);
        Thread x = new Thread(pt2);
        
        t.start();
        x.start();
    }
}
