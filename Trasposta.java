import java.util.Scanner;

public class Trasposta{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Numero di righe: ");
		int i = userInput.nextInt();
		System.out.print("Numero di colonne: ");
		int j = userInput.nextInt();
		int[][] matrix = new int [i][j];
		System.out.println("Inserisci i valori: ");
		for(int k=0; k<i; k++){
			for(int h=0; h<j; h++){
				matrix[k][h] = userInput.nextInt();
			}
		}
		int[][] matriceTrasposta = new int[j][i];
		matriceTrasposta = trasponi(matrix, j, i);
		stampa(matriceTrasposta, j, i);
	}
	private static int[][] trasponi(int[][] matrice, int righe, int colonne){
		int[][] matriceNuova = new int[righe][colonne];
		for(int i=0; i<righe; i++){
			for(int j=0;j<colonne; j++){
				matriceNuova[i][j] = matrice[j][i];
			}
		}
		return matriceNuova;
	}
	private static void stampa(int[][] m1, int righe, int colonne){
		for(int i=0; i<righe; i++){
			for(int j=0; j<colonne; j++){
				System.out.print(m1[i][j]);
			}
			System.out.println();
		}
	}
}