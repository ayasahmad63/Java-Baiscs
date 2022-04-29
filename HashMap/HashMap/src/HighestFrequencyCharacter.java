import java.util.HashMap;

public class HighestFrequencyCharacter {

    public static void main(String[] args) {
        String str="ahsfaliudaliylagahaa";
        HashMap<Character, Integer> hash=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hash.containsKey(ch)){
                int oldfac=hash.get(ch);
                hash.put(ch,oldfac+1);
            }else{
                hash.put(ch,1);
            }
        }

        int maxfreq=hash.get(str.charAt(0));
        char ch=str.charAt(0);
        for(Character key: hash.keySet()){
            if(hash.get(key)>maxfreq){
                maxfreq=hash.get(key);
                ch=key;
            }
        }

        System.out.println(maxfreq);
        System.out.println(ch);
    }

}
