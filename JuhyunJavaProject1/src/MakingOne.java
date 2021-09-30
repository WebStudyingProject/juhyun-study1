import java.util.Scanner;

public class MakingOne {

	public int makingOne(int num) {
		int answer=0;
		for(int i=0;i<500;i++) {
			if(num==1)
			{
				answer=num;
				break;
			}
			else if(num%2==0)
			{
				answer=num%2;
				num=answer;
				System.out.println(num);
			}
			else if(num%2!=0)
			{
				answer=num*3+1;
				num=answer;
				System.out.println(num);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num=scan.nextInt();
		MakingOne makingOne=new MakingOne();
		System.out.println("결과:"+makingOne.makingOne(num));
	}

}
