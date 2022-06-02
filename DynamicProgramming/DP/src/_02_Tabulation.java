public class _2_Tabulation {
//
//    Ques) Climbing stairs
//         1)You are given a number n, representing the number of stairs in a staircase.
//         2)You are on the 0th step and are required to climb to the top.
//         3)In one move, you are allowed to climb 1, 2, or 3 stairs.
//         4)You are required to print the number of different paths via which you can climb to the top



//  https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb_stairs/topic


    public static void main(String[] args) {


        int n=10;
//        Traditional Approch
//        System.out.println(CountSteps(n));

//       Memorization Approach

//        System.out.println(MemorizationCountStep(n,new int[n+1]));



//         Tabulated
        System.out.println(TabulatedCountStep(n));

    }


//    Approach 1) Simple Recursion
//      Time Complexity:- Exponential

    public static  int CountSteps(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }


        int n1step=CountSteps(n-1);
        int n2step=CountSteps(n-2);
        int n3step=CountSteps(n-3);

        int count=n1step+n2step+n3step;
        return count;
    }










//     Approach 2:- Memorization
//

    public static int MemorizationCountStep(int n,int[] memo){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }

        if(memo[n]>0){
            return memo[n];
        }

        int n1=MemorizationCountStep(n-1,memo);
        int n2=MemorizationCountStep(n-2,memo);
        int n3=MemorizationCountStep(n-3,memo);

        int count=n1+n2+n3;

        memo[n]=count;

        return count;


    }









//    Approach 3:- Tabulation Appraoch
//      In this Approach we make a table or matrix of size n+1 and then we use to fill the array by following steps
//           i)Direction < > :- It means that in what direction we use start filling te array for example:- LTR, RTL
//          ii)Travel and Fill :- We use to travel and fill up the array


     public static int TabulatedCountStep(int n){
        int[] tabulated=new int[n+1];
        tabulated[0]=1;

        for(int i=1;i<n+1;i++){
            if(i==1){
                tabulated[1]=tabulated[0];
            }else if(i==2){
                tabulated[2]=tabulated[1]+tabulated[0];
            }else {
                tabulated[i]=tabulated[i-1]+tabulated[i-2]+tabulated[i-3];
            }
        }

        return  tabulated[n];
     }

}
