import java.util.HashMap;

public class GetCommonElement {

    public static void main(String[] args) {

        int[] arr1={1,1,1,2,4,5,6,7};
        int[] arr2={1,1,1,2,2,2,3,4,5,5,5,5,5};


        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!hash.containsKey(arr1[i])) {
                hash.put(arr1[i],0);
            }
        }

        for(int j=0;j<arr2.length;j++){
            if(hash.containsKey(arr2[j])){
                System.out.print(" "+arr2[j]);
                hash.remove(arr2[j]);
            }
        }
    }
}
