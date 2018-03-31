
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(fibo(i));
		}
		System.out.println("------------");
		for(int i=0;i<=9;i++) {
			System.out.println(fibo2(i));
		}

	}
	public static int fibo(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		else
		return fibo(n-1)+fibo(n-2);
	}
	public static int fibo2(int n) {
		int before=0;
		int cur=1;
		int temp;
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else 
		for(int i=1;i<n;i++) {
			temp=cur;
			cur+=before;
			before=temp;
			
		}
		return cur;
	}

}
