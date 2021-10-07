import java.util.Scanner;

// 행렬의 덧셈
// 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과
// 2개의 행렬 arr1, arr2 입력받기
// 행렬덧셈의 결과를 반환하는 함수 solution
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
