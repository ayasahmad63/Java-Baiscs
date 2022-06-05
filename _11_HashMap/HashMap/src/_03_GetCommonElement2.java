import java.util.HashMap;

public class _03_GetCommonElement2 {

    public static void main(String[] args) {

        int[] arr1={1,1,1,2,2,2,3,3,3,5,5,5};
        int[] arr2={1,1,2,3,3,3,3,3,4,4,5,5};

        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            if(hash.containsKey(arr1[i])){
                int oldfac= hash.get(arr1[i]);
                hash.put(arr1[i],oldfac+1);
            }else{
                hash.put(arr1[i],1);
            }
        }

        for(Integer key:arr2){
            if(hash.containsKey(key) && hash.get(key)>0){
                System.out.print(key+" ");
                int oldfac=hash.get(key);
                hash.put(key,oldfac-1);
            }
        }


    }



}
