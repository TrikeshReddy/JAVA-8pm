
public class twoDArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4},{5,8}};
		int[][] arr1 ={{1,2},{3,4},{5,8}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+arr1[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
