public class RaggedArray{

	public static void main(String[] args){		
		/*int[][] numbers ={{1, 2, 3, 4},
							{5, 6, 7, 8}, 
							{9, 10,11,12}};*/
		int[][] numbers = { {1, 2},
							{5, 6, 7},
							{9, 10,11, 12}};
		
		int total;
		for (int j = 0; j < 4; j++){
			total = 0;
			for (int i = 0; i < numbers.length; i++){
				if (j < numbers[i].length) {
					total += numbers[i][j];
				}
			}
			System.out.println("Total of column " + j + " is " + total);
		}
		
	}

}
