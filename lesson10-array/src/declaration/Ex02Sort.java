package declaration;

public class Ex02Sort {
	public static void main(String[] args) {
		int[][] a2D= { {1,2} , {3,4} , {5,6}};
		for (int row= 0 ; row < a2D.length ; row ++ )
		{
			for (int col = 0 ; col < a2D[row].length ; col ++)
				System.out.print(a2D[row][col] + "  "  );
			System.out.println();
		}
		for(int i = 0 ; i < 4 ; i++)
			System.out.println(i);
		
	}
}
