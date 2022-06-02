public class _01_Memorization {

//     In this We are going to write fibonacci number by using  memorization in dp;


//    https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fibonacci_dp/topic
//
    public static void main(String[] args) {

        int n=5;
//        Traditional Fibonnaci approach
//        System.out.println(Fibonnaci(n));


//        Memorization In Fibonnaci
        System.out.println(MemorizationFibo(n,new int[n+1]));


    }


//    In non-dp approach,the time complexity will be O(2pown) which means exponential time complexity
//    We perform process repetataly in the Fibonnaci
    public  static int Fibonnaci(int n){
        if(n<2)return  n;
        return  Fibonnaci(n-1) + Fibonnaci(n-2);
    }







//    Memorization:-
//       In this approach we use array to store data  for in future use
//       Time Complexity reduces from exponential to linear O(n)
//       We make array of n+1 for n number to find the number

    public static int MemorizationFibo(int n,int[] memo){
        if(n<2)return n;

        if(memo[n]!=0) return memo[n];


        memo[n]= MemorizationFibo(n-1,memo) + MemorizationFibo(n-2,memo);
        return memo[n];


    }





}
