
public class dia {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<5;i++) {
			if(i<3) {
				count++;
			}
			else {
				count--;
			}
			for(int j=0;j<3-count;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*count-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
			
			
		}
	
	}

}
