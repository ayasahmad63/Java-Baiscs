public class _3_ClimbStairsWithVariable {


//   Question:-
//   1)You are given n representing the number of stairs.
//   2)You are on the 0th step and are required to climb to the top.
//   3)You are given n numbers, where i-th element's value represents - till how far from the step you could jump to in a single move.
//   4)You are required to print the number of different paths via which you can climb to the top.


// In this we use tabulation


//    https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb_stairs_with_variable_jumps/topic


    public static void main(String[] args) {

        int n=10;
        int arr[]={3,3 ,0 ,2,1,2,4,2,0,0};

        int[] tabul=new int[n+1];
         tabul[n]=1;

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=arr[i]&& i+j<tabul.length;j++){
                tabul[i]+=tabul[i+j];
            }
        }

        System.out.println(tabul[0]);



    }










}
