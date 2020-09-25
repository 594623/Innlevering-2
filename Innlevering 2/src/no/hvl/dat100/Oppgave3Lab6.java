package no.hvl.dat100;

public class Oppgave3Lab6 {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{0, 0, 1, 1, 1, 1, 0, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0}
		};
		
		System.out.println("Oppgave a)");
		printOutv1(matrix);
		
		System.out.println("\nOppgave b)");
		System.out.println(toString(matrix));
		
		System.out.println("\nOppgave c)");
		System.out.println(toString(scale(2, matrix)));
		
		System.out.println("\nOppgave d)");
		System.out.println(equals(matrix, matrix) + " | Returns true");
		System.out.println(equals(matrix, scale(2, matrix)) + " | Returns false");
		
		System.out.println("\nOppgave e)");
		System.out.println(toString(mirror(matrix)));
		
		System.out.println("\nOppgave f)");
		System.out.println(toString(multiply(matrix, mirror(matrix))));
	}
	
	public static void printOutv1(int[][] matrix) {
		for (int[] i : matrix) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	
	public static String toString(int[][] matrix) {
		String s = "";
		
		for (int[] i : matrix) {
			for (int j : i) {
				s += j + " ";
			}
			s += "\n";
		}
		
		return s;
	}
	
	public static int[][] scale(int n, int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				newMatrix[i][j] = matrix[i][j] * n;
			}
		}
		
		return newMatrix;
	}
	
	public static boolean equals(int[][] mat1, int[][] mat2) {
		if (mat1.length != mat2.length) return false;
		if (mat1[0].length != mat2[0].length) return false;
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) return false;
			}
		}
		
		return true;
	}
	
	public static int[][] mirror(int[][] matrix) {
		
		if (matrix.length != matrix[0].length) {
			System.out.println("ERROR: Not a squared matrix.");
			return matrix;
		};
		
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}
		
		return newMatrix;
	}
	
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] product = new int[a.length][a.length];
        int temp = 0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < b.length; k++) {
                    temp += a[i][k] * b[k][j];
                }
                product[i][j] = temp;
                temp = 0;
            }
        }
        
        return product;
    }
}
