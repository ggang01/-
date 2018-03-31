import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Stack 구현 연습
 * push-데이터 저장소에 자리가 있는지 확인 후 데이터 저장
 * pop- 데이터 저장소에 데이터가 있는지 확인 후 마지막에 들어간 데이터 빼기
 * @author kang
 *
 */
public class Stack {
	static int top;
	static int size;
	static Object arr[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 저장소 크기를 입력하세요");
		size=scan.nextInt();
		top=-1;
		arr=new Object[size];

		push(10);
		push(10);
		push("dsada");
		pop();
		pop();
		pop();
		pop();
	
		

	}
	public static void push(Object obj) {
			if(top>=size-1) {
				System.out.println("데이터가 꽉 찻습니다.");
			}
		
			else{
				top++;
				arr[top]=obj;
				
			}
		
	}
	public static void pop() {
		if(top<=-1) {
			System.out.println("데이터가 비어있습니다.");
		}
		else {
			System.out.println(arr[top]+"출력");
			arr[top]="";
			top--;
		}
	}
	
	

}
