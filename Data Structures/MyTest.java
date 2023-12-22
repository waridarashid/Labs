public class MyTest{
  public static void main(String[] args){
    int[] arr = {30,40,50,10,20};
    int[] newArr = new int[arr.length+3];
    for (int i=0; i < arr.length; i++){
      newArr[i] = arr[i];
    }
    int pos = 2;
    int start = 3;
    int size = 5;
    int from = (start + size -1) % arr.length;


    

      int to = (from + 1) % newArr.length;
      for (int i = 0; i < size-pos; i++) {
          newArr[to] = arr[from];
          

   // move to and from backwards.
   to = from;
   from = from - 1;
   if (from == -1){
       from = arr.length;
   }
      }
      for(int i=0 ; i<newArr.length-1; i++){
        System.out.println(newArr[i]);
      }
  }
}
    
