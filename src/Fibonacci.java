
public class Fibonacci {

	public static void main(String[] args) {
		
		        int n = 15; // example value for n
		        int result = fib(n);
		        System.out.println("The " + n + "-th Fibonacci number is: " + result);
		    }

		    public static int fib(int n) {
		        if (n == 0) {
		            return 0;
		        } else if (n == 1) {
		            return 1;
		        } else {
		            return fib(n - 1) + fib(n - 2);
		        }
		    }
		}
		
