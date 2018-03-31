import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) throws IOException {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        int T = Integer.parseInt(br.readLine().trim());
        int j;
        String [] result=new String[T];
        for (int i = 0; i < T; ++i) {
        	int count=1;
            String word = br.readLine().trim();
            char[] strarry=word.toCharArray();
            for(j=0;j<strarry.length-1;j++) {
            		if(strarry[j]==strarry[j+1]) {
                		count++;
                		if(j==strarry.length-2) {
                			if(result[i]==null) {
                				result[i]=count+String.valueOf(strarry[j]);
                			}
                			else if(result[i]!=null) result[i]+=count+String.valueOf(strarry[j]);
                		}
                	}
            		else if(strarry[j]!=strarry[j+1]){
            			if(result[i]==null) {
            				result[i]=count+String.valueOf(strarry[j]);
            			}
            			else if(result[i]!=null)result[i]+=count+String.valueOf(strarry[j]);
            			if(j==strarry.length-2&&strarry.length!=2) {
            				result[i]+=1+String.valueOf(strarry[strarry.length-1]);
            			}
            			count=1;
            		}
            	}
            
            }
        for(int i=0;i<result.length;i++) {
        	System.out.println(result[i]);
        }

        

        }
	

    }

	}


