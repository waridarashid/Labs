public class arrayTrimmerTest{
  public static void main (String[] args){
    arrayTrimmer x = new arrayTrimmer();
    int[] num = {-1,-2,1,2,3,4,-5,-6};
    num = x.trim(num);
    
    for (int i=0; i<num.length; i++){
      System.out.println (num[i]);
    }
  }
}
    