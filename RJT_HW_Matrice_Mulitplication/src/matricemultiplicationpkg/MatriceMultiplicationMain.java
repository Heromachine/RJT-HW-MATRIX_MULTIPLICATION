package matricemultiplicationpkg;
import java.util.Random;
//Changes

public class MatriceMultiplicationMain 
{
	public static void main(String[] args) 
	{
		int X[][] = new int[2][2];
		int Y[][] = new int[2][2];
		
		Random rNum = new Random(); 

		
		System.out.print("Random Array 1 : [");		
		for (int i = 0; i < 2; i++ )
		{
			for (int j = 0; j< 2; j++)
			{
				X [i][j] = rNum.nextInt(100);
				System.out.print(X[i][j] + ", ");
			}		
			
		}
		System.out.print( "]\n");	
		
		
		System.out.print("\nRandom Array 2 : [");
		for (int i = 0; i < 2; i++ )
		{
			for (int j = 0; j< 2; j++)
			{
				Y [i][j] = rNum.nextInt(100);
				System.out.print(Y[i][j] + ", ");
			}		
			
		}
		System.out.print( "]\n");	
		
		int Z[][] = new int[2][2];
		
		
		MatriceMultiplicationClass MMC = new MatriceMultiplicationClass(); 
		
		
	     Z = MMC.MultiMatrixInt2D(X, Y, 2, 2, 2);
		
		System.out.print( "\nArray 1 * Array2 = [");	
		
		for (int i = 0; i < 2; i++ )
		{
			for (int j = 0; j< 2; j++)
			{
			
				System.out.print(Z[i][j] + ", ");
			}		
			
		}
		System.out.print( "]");	
		
	}	
	

	

}
