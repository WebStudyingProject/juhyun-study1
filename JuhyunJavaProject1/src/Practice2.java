import java.util.*;

// 함수 solution만들기
// 정수x와 자연수n을 입력받기
// x부터 시작해 x씩 증가하는 숫자 n개 지니는 리스트 리턴
/*
 * 제약조건 : x는 -1천만~1천만 사이 정수
 * n은 1000이하 자연수
 */
public class Practice2 {
	
	
		public long[] solution(int x,int n) {
			
			long[] answer=new long[n];
			answer[0]=x;
			for(int i=1;i<n;i++)
			{
				answer[i]=answer[i-1]+x;
			}
			System.out.println(answer);
			return answer;
			
		}
		
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int x=scan.nextInt();
			int n=scan.nextInt();
			
			//long[] answer=solution(x,n);
			
		}
		
		
}
