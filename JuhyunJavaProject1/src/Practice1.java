import java.util.Scanner;

// ���簢�� �����
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���α��̸� �Է��ϼ���:");
		int a=scan.nextInt();
		System.out.print("���α��̸� �Է��ϼ���:");
		int b=scan.nextInt();
		
		System.out.println("���μ��α����� ��:"+(a+b));
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
 * �ƽ�����
 * a,b 1000���� �ڿ��� ���� .. ������������..!!
 */
