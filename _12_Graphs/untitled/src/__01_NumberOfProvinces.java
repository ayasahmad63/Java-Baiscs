//import org.w3c.dom.ls.LSOutput;

//import java.util.Arrays;

public class __01_NumberOfProvinces {





/*
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int[] cities=new int[isConnected.length];
            Arrays.fill(cities,-1);
            int ans=0;
            for(int i=0;i<isConnected.length;i++){
                if(cities[i]==-1){
                    ans++;
                    Connected(isConnected,cities,i);
                }
            }
            return ans;
        }
        public void Connected(int[][] isConnected,int[] cities,int i){
            if(i>=isConnected.length) return;

            cities[i]=1;
            for(int j=0;j<isConnected.length;j++ ){
                if(isConnected[i][j]==1){
                    isConnected[i][j]=0;
                    isConnected[j][i]=0;
                    Connected(isConnected,cities,j);
                }
            }
        }
    }



*/











}
