package Adarsh;

public class FibonacciThread  {
	
	synchronized void Fibonacci(){

		int n = 20, i, n1 = 0, n2 = 1, temp;

		System.out.print("Fibonacci series: ");
		for (i = 0; i <= n; i++) {
			System.out.print(n1 + "  ");
			temp = n1;
			n1 = n2;
			n2 = temp + n2;
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

