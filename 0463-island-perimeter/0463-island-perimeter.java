class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter= 0;
        for (int i=0; i<grid.length; i++){
            for (int k=0; k<grid[i].length; k++){
                if (grid[i][k]==1){
                    perimeter +=4;
                    if (k!= grid[i].length-1 && grid[i][k+1]==1) perimeter-=1;
                    if (k!=0 && grid[i][k-1]==1) perimeter -=1;
                    if (i!=0 && grid[i-1][k]==1) perimeter -=1;
                    if (i!= grid.length-1 && grid[i+1][k]==1) perimeter -=1;
                }
            }
        }
        return perimeter;
    }
}