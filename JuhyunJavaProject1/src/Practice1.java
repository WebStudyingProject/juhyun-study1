import java.util.Scanner;

// 직사각형 별찍기
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("가로길이를 입력하세요:");
		int a=scan.nextInt();
		System.out.print("세로길이를 입력하세요:");
		int b=scan.nextInt();
		
		System.out.println("가로세로길이의 합:"+(a+b));
		for(int j=0;j<b;j++)
		{
			System.out.print("*");
			for(int i=1;i<a;i++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
/*
 * 아쉬운점
 * a,b 1000이하 자연수 조건 .. 만들지못했음..!!
 */
