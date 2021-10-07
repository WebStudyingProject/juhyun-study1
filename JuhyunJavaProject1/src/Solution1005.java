// 자연수 뒤집어서 배열
// [1 2 3 4 5] => [5 4 3 2 1]
public class Solution1005 {
	class solution{
		public int[] solution(long n) {
		      String a = "" + n;
		        int[] answer = new int[a.length()];
		        int cnt=0;

		        while(n>0) {
		            answer[cnt]=(int)(n%10);
		            n/=10;
		            System.out.println(n);
		            cnt++;
		        }
		      return answer;
		  }
	}
	class solution2{
		public int[] solution2(long n) {
		      String s = String.valueOf(n);
		      StringBuilder sb = new StringBuilder(s);
		      sb = sb.reverse();
		      String[] ss = sb.toString().split("");

		      int[] answer = new int[ss.length];
		      for (int i=0; i<ss.length; i++) {
		          answer[i] = Integer.parseInt(ss[i]);
		      }
		      return answer;
		  }
	}
	class solution3{
		public int[] solution3(long n) {
		      int length = Long.toString(n).length();
		        int[] answer = new int[length];

		        for (int i = 0; i < length; i++) {
		            answer[i] = (int) (n % 10);
		            n /= 10;
		        }

		        return answer;
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
