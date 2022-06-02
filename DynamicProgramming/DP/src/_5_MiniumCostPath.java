public class _5_MiniumCostPath {


    public static void main(String[] args) {

      int m=7;
      int n=7;

      int[][] arr={
              {2,8,4,1,6,4,2},
              {6,0,9,5,3,8,5},
              {1,4,3,4,0,6,5},
              {6,4,7,2,4,6,1},
              {1,0,3,7,1,2,7},
              {1,5,3,2,3,0,9},
              {2,2,5,1,9,8,2}
      };

      int[][] ans=new int[arr.length][arr[0].length];
       ans[m-1][n-1]=arr[m-1][n-1];

      for(int i= n-2;i>=0;i--){
          ans[i][m-1]=arr[i][m-1]+ans[i+1][m-1];
      }

      for(int i=m-2;i>=0;i--){
            ans[n-1][i]=arr[n-1][i]+ans[n-1][i+1];
      }






      for(int i=m-2;i>=0;i--){
          for(int j=n-2;j>=0;j--){
              int min=Math.min(ans[i+1][j],ans[i][j+1]);
              ans[i][j]=arr[i][j]+min;
          }
      }


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(" "+ans[i][j]);
            }
            System.out.println("");
        }

    }














}
