package Adarsh;

public class ReverseOrderThread  {
    
    synchronized void Reverse() {
        System.out.print("Reverse Order: ");
        for (int i = 999; i >= 1; i--) {
            System.out.print(i + " ");
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        System.out.println();
    }
}


