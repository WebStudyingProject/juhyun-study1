import java.util.*;
public class Add {

	public int add(int n) {
	        int answer = 0;

	        while(n>10){
	            answer+=n%10;
	            if(n<10)
	                break;

	            n=n/10;
	        }
		
	        System.out.println(answer);
	        return answer;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Add add=new Add();
		System.out.println(add.add(n));
		
	}

}

