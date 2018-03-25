import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FibonacciThread implements Runnable {
	private int num;

	public FibonacciThread(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println(fibonacci(this.num));
	}

	private int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int randomValue = random.nextInt(50) + 50;
			System.out.println(randomValue);
			executor.submit(new FibonacciThread(randomValue));
		}
	}
}
