public class _09_CoinChangePermutation {
    public static void main(String[] args) {

        int[] arr={2,3,5,6};
        int tar=10;

        int[] ans=new int[tar+1];
        ans[0]=1;


        for(int i=1;i<ans.length;i++){
            for(int j=0;j<arr.length;j++){
                int a=arr[j]-i;
                if(a<0){
                    continue;
                }else {
                    ans[j]+=ans[a];
                }


            }
        }


        for(int i=0;i<ans.length;i++){
            System.out.print(" "+ans[i]);
        }



    }




}
