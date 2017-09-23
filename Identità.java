import java.util.Scanner;

public class Identità{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Ordine della matrice: ");
		int matrixOrder = userInput.nextInt();
		if(matrixOrder<=0){
			System.out.println("suconi");
		}
		else{
			int[][] matrix1 = new int[matrixOrder][matrixOrder];
			for(int i=0; i<matrixOrder; i++){
				matrix1[i][i]=1;
			}
			stampa(matrix1, matrixOrder);
		}
	}
	private static void stampa(int[][] m1, int size){
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(m1[i][j]);
			}
			System.out.println();
		}
	}
}