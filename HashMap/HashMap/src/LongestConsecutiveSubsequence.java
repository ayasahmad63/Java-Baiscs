import java.util.HashMap;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr={10,5,9,1,11,8,6,15,3,12,2};

        HashMap<Integer,Boolean> hash=new HashMap<>();
        for(Integer key:arr){
            hash.put(key,true);
        }
        for(Integer key:arr){
            if(hash.containsKey(key-1)){
                hash.put(key,false);
            }
        }

      int maxlen=0;
      int maxvalue=0;

      for(Integer key:arr){

          if(hash.get(key)){
              int len=1;
              while(hash.containsKey(key+len)){
                  len++;
              }
              if(len>maxlen){
                  maxlen=len;
                  maxvalue=key;
              }
          }
      }
//        System.out.println(maxlen);
      for(int i=0;i<maxlen;i++){
          System.out.print(" "+(maxvalue+i));
      }
    }


}
