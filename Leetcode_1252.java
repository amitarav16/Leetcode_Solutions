public class Leetcode_1252{
	public static void main(String[] args) {
		int indices[][] = {{0,1},{1,1}};
		int n = 2; 
		int m = 3;
		int ans[][] = new int[n][m];
		for(int i=0;i<indices.length;i++){
        	int row = indices[i][0];
        	int column = indices[i][1];
        	for(int j=0;j<m;j++){
        		ans[row][j] += 1;
        	}
        	for(int x =0;x<n;x++){
        		ans[x][column]+=1;
        	}
        }
        int count = 0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		if(ans[i][j] %2 != 0){
        			count++;
        		}
        	}
        }
        System.out.println(count);
        
        // for(int i=0;i<n;i++){
        // 	for(int j=0;j<m;j++){
        // 		System.out.print(ans[i][j]+" ");
        // 	}
        // 	System.out.println();
        // }

	}
}