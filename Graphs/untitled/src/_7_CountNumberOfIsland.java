public class _7_CountNumberOfIsland {

    public static void main(String[] args) {

        char[][] grid={
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}

        };

        int ans=0;
        boolean[][]  visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j] == false && grid[i][j] == '1') {
                    ans++;
                    NumberOfIsland(grid, visited, i, j);
                }
            }
        }
        System.out.println(ans);

    }


        public static void NumberOfIsland(char[][] grid, boolean[][] visited, int m, int n){

            if(m<0 || m>grid.length-1 || n<0 || n>grid[0].length-1 || grid[m][n]=='0'  || visited[m][n]==true){
                return;
            }

            visited[m][n]=true;

            NumberOfIsland(grid,visited,m+1,n);
            NumberOfIsland(grid,visited,m-1,n);
            NumberOfIsland(grid,visited,m,n+1);
            NumberOfIsland(grid,visited,m,n-1);

        }





}
