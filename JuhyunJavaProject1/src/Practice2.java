import java.util.*;

// �Լ� solution�����
// ����x�� �ڿ���n�� �Է¹ޱ�
// x���� ������ x�� �����ϴ� ���� n�� ���ϴ� ����Ʈ ����
/*
 * �������� : x�� -1õ��~1õ�� ���� ����
 * n�� 1000���� �ڿ���
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
