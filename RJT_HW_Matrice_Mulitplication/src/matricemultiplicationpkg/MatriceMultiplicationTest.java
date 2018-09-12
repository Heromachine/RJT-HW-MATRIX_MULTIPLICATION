package matricemultiplicationpkg;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatriceMultiplicationTest {

	@Test
	void test() {
		MatriceMultiplicationClass MMC = new MatriceMultiplicationClass(); 
		int matriceInputA [][] = {{1, 4},{3, 2}};
		int matriceInputB [][] = {{2, 7},{1, 5}};		
		int expected [][] = {{6, 27},{8, 31}};
		int result [][] = MMC.MultiMatrixInt2D(matriceInputA, matriceInputB, 2, 2, 2); 
		
		assertEquals(expected, result); 		
	}
}
