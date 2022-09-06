public class main {

    public static void main(String[] args) {
        int[] stoneValue={6,2,3,4,5,5};

        System.out.println(MaxScore(stoneValue,0,stoneValue.length-1));
    }

    public static int MaxScore(int[] stoneValue,int i,int j){
        if(i==j) return stoneValue[i];

        int currSum[]=new int[j-i+1];
        currSum[0]=stoneValue[i];
        for(int k=1;k<=j-i;k++){
            currSum[k]=currSum[k-1]+stoneValue[i+k-1];
        }
        int target=currSum[j-i]/2;
        if(target==currSum[(j-i)/2]){
            return Math.max(MaxScore(stoneValue,i,(j-i)/2),MaxScore(stoneValue,(j-i)/2+1,j));
        }else if(currSum[(j-i)/2]<currSum[j]-currSum[(j-i)/2]){
            return currSum[(j-i)/2]+MaxScore(stoneValue,(j-i)/2+1,j);
        }
        return currSum[j-i]-currSum[(j-i)/2]+MaxScore(stoneValue,i,(j-i)/2);


    }

}
