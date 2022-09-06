import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class __02_01Matrix {



//    Method 1:- Check for Every index  of matrix(Time Limit Exceeded)

//    Time Complexity:- O(n*m)^2
//    Space Complexity:-O(n*m)

/*
    class Solution {
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        public int[][] updateMatrix(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;

            int[][] ans=new int[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(ans[i],-1);
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    ans[i][j]=Nearest(mat,0,i,j,ans);
                }
            }
            return ans;
        }
        public int Nearest(int[][] mat,int count,int i,int j,int ans[][]){
            if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j]== -1) return Integer.MAX_VALUE;


            if(mat[i][j]==0) return count;
            if(ans[i][j]!=-1) return ans[i][j]+1;
            mat[i][j]=-1;
            int num=Integer.MAX_VALUE;
            for(int k=0;k<4;k++){
                num=Math.min(num,Nearest(mat,count+1,i+dx[k],j+dy[k],ans));
            }
            mat[i][j]=1;
            return num;
        }
    }

*/









//     Method 2:- BFS using queue
//    Video Solution:- https://www.youtube.com/watch?v=wtRT9G42g4g
//       Put every index 0 at dis 0 and  compare it with every index

//    Space Optimization:-O(n*m) // For Queue
//    Time Complemization:-O(n*m)

/*
    class Solution {
        public int[][] updateMatrix(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;


            Queue<int[]> que=new LinkedList<>();

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==1){
                        mat[i][j]=-1;
                    }else{
                        que.offer(new int[]{i,j,0});
                    }
                }
            }
            BFS(que,mat);


            return mat;
        }
        public void BFS(Queue<int[]> que, int[][] ans){
            int[] dx={-1,0,1,0};
            int[] dy={0,-1,0,1};
            while(que.size()>0){
                int[] arr=que.poll();

                for(int i=0;i<4;i++){
                    int m=arr[0]+dx[i];
                    int n=arr[1]+dy[i];
                    if(m<0 || n<0 || m>=ans.length || n>=ans[0].length || ans[m][n]!=-1) continue;
                    ans[m][n]=arr[2]+1;
                    que.offer(new int[]{m,n,arr[2]+1});


                }

            }
        }
    }

*/







//    Method 3:- Using Dynamic Programming
//       Space Complexity:- O(1)
//        Time Complixety:-(O(n*m))
//youtube :-https://www.youtube.com/watch?v=RySXom_lslY


/*

    class Solution {
        public int[][] updateMatrix(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;
            int[][] ans=new int[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(ans[i],Integer.MAX_VALUE-100);
            }


//         for top and left
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==0){
                        ans[i][j]=0;
                    }else{
                        if(i>0){
                            ans[i][j]=Math.min(ans[i][j],ans[i-1][j]+1);
                        }
                        if(j>0){
                            ans[i][j]=Math.min(ans[i][j],ans[i][j-1]+1);
                        }
                    }
                }
            }




//   For Down and right


            for(int i=m-1;i>=0;i--){
                for(int j=n-1;j>=0;j--){

                    if(i<m-1){
                        ans[i][j]=Math.min(ans[i][j],ans[i+1][j]+1);
                    }
                    if(j<n-1){
                        ans[i][j]=Math.min(ans[i][j],ans[i][j+1]+1);
                    }

                }
            }





            return ans;
        }
    }


*/






}
