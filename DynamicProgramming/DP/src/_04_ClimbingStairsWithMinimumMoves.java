public class _4_ClimbingStairsWithMinimumMoves {

//    int vs Integer :- In int value is defined is zero && in Integer


    public static void main(String[] args) {

        int n=10;
        int arr[]={3,2,4,2,0,2,3,1,2,2};

        Integer[] tab=new Integer[n+1];

        tab[n]=0;

        for(int i=n-1;i>=0;i--){
            if(arr[i]>0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j < arr[i] && i + j < n; j++) {

                    if (tab[i + j] != null) {
                        min= Math.min(tab[i + j], min);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    tab[i]=min+1;
                }
            }

        }

        System.out.println(tab[0]);


    }



}
