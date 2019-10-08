public class ArrayOperations2D {
	
	public static int getTotal(int[][] arr){
		int total = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				total += arr[i][j];
			}
		}
		return total;
	}
	
	public static double getAverage(int[][] arr){
		int total = 0;
		int elem = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				total += arr[i][j];
				elem++;
			}
		}
		return (double)total / elem;
	}
	
	public static int getRowTotal(int[][] arr, int n){
		int total = 0;
		for (int i = 0; i < arr[n].length; i++){
			total += arr[n][i];
		}
		return total;
	}
	
	public static int getColumnTotal(int[][] arr, int n){
		int total = 0;
		for (int i = 0; i < arr.length; i++){
			total += arr[i][n];
		}
		return total;
	}
	
	public static int getHighestInRow(int[][] arr, int n){
		int max = 0;
		for (int i = 0; i < arr[n].length; i++){
			if(arr[n][i] > max){
				max = arr[n][i];
			}
		}
		return max;
	}
	
	public static int getLowestInRow(int[][] arr, int n){
		int min = getHighestInRow(arr, n);
		for (int i = 0; i < arr[n].length; i++){
			if(arr[n][i] < min){
				min = arr[n][i];
			}
		}
		return min;
	}
}