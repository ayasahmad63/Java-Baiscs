public class _28_MatrixChainMultiplication {


    public static void main(String[] args) {

        int[] arr= { 1, 2, 3, 4, 3 };

        System.out.println(MCM(arr,1,arr.length-1));


    }

    public static int MCM(int[] arr,int i,int j){
        if(i==j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for (int k = i; k < j; k++)
        {
            int count = MCM(arr, i, k)
                    + MCM(arr, k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j];

            if (count < min)
                min = count;
        }
        return min;
    }


}
