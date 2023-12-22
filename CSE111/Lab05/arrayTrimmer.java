import java.util.Arrays;

public class arrayTrimmer{
  public int[] trim(int[] num){
    int i,j;
    for(i=0, j=0; i<num.length; i++){
      if (num[i]>=0){
        num[j] = num[i];
        j++;
      }
    }
    num = Arrays.copyOf(num, j);
    return num;
  }
}