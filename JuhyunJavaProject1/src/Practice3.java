import java.util.Scanner;

// ����� ����
// ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ���
// 2���� ��� arr1, arr2 �Է¹ޱ�
// ��ĵ����� ����� ��ȯ�ϴ� �Լ� solution
public class Practice3 {
	class Solution
	{
		public int[][] solution(int[][] arr1, int[][] arr2)
		{
			int[][] answer= {};
			answer=arr1;
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1[0].length;j++)
				{
					answer[i][j] += arr2[i][j];
				}
			}
			return answer;
		}
	}
}
