public class _08_CoinChangeCombination {


    public static void main(String[] args) {

        int[] arr={1,2,3};
        int tar=5;

        int[] ans=new int[tar+1];

        ans[0]=1;

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<tar+1;j++){
                int a=j-arr[i];
                ans[j]+=ans[a];
            }
        }






        for(int i=0;i<tar+1;i++){
            System.out.print(" "+ans[i]);
        }

    }



}
