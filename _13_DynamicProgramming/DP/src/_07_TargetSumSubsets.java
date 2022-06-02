public class _07_TargetSumSubsets {

    public static void main(String[] args) {

        int arr[]={4,2,7,1,3};
        int targ=10;


        boolean[][] ans=new boolean[arr.length+1][targ+1];


        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<targ+1;j++){

                if(i==0 && j==0 ){
                    ans[i][j]=true;
                }else if(j==0){
                    ans[i][j]=true;
                }else if(i==0){
                    ans[i][j]=false;
                }else {

                    if(ans[i-1][j]==true){
                            ans[i][j]=true;
                    }else{
                             if(j==arr[i-1]){
                                 ans[i][j]=true;
                             }
                             else if(j>arr[i-1]){
                                 int t=j-arr[i-1];
                                 if(ans[i-1][t]==true){
                                     ans[i][j]=true;
                                 }
                             }else {
                                 ans[i][j]=false;
                             }
                    }


                }










            }
        }

        System.out.println(ans[arr.length][targ]);
//
//        for(int i=0;i<arr.length+1;i++){
//            for(int j=0;j<targ+1;j++){
//                System.out.print(ans[i][j]+ " ");
//            }
//            System.out.println("");
//        }



    }


}
