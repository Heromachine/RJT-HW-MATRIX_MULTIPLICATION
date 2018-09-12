package matricemultiplicationpkg;

public class MatriceMultiplicationClass {
	
	public static int[][] MultiMatrixInt2D(int [][] x, int [][] y, int MRA, int MRB, int MCB)
	{		
		int sum = 0;
		int m[][] = new int [2][2];
		
		for (int i = 0; i < MRA; i++)
		{			
			
			for (int j = 0; j < MCB; j++)
			{		
				for (int k = 0; k < MRB; k++)
				{				    
					sum = sum + x[i][k] * y[k][j];					 
				}
				 m[i][j] = sum; 
				 sum = 0;
			 }		
		}	
		return m;
	}
}
