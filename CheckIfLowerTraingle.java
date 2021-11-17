import java.util.*;
public class CheckIfLowerTraingle{
	 public static void main(String[] args){
	 	Scanner sc = new Scanner(System.in);
	 	int n = sc.nextInt();
	 	int[][] matrix = new int[n][n];
	 	for(int i=0;i<n;i++){
	 		for(int j=0;j<n;j++){
	 			matrix[i][j] = sc.nextInt();
	 		}
	 	}
	 	boolean notLower = false;
	 	for(int i=0;i<n;i++){
	 		for(int j=0;j<n;j++){
	 			if(i-j < 0 && matrix[i][j] != 0){
	 				notLower = true;
	 			}
	 			if(i-j >= 0 && matrix[i][j] == 0){
	 				notLower = true;
	 			}
	 		}
	 	}
	 	if(notLower){
	 		System.out.println("no");
	 	}
	 	else{
	 		System.out.println("yes");
	 	}
	 }
}
