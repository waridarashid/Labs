public class lab12{
  public static int factorial(int x){
    if(x == 1){
      return 1;
    }
    else{
      return factorial(x-1)*x;
    }
  }
  
  public static int fibonacci(int x){
    if (x == 0){
      return 0;
    }
    else if (x == 1){
      return 1;
    }
    else{
      return fibonacci(x-1) + fibonacci(x-2);
    }
  }
  
  public static int binarySearch(int [] arr, int x, int start, int end){
    int mid = (start+end)/2;
    
    if(arr[mid] > x){
      start = 0;
      end = mid;
      return binarySearch(arr, x, start, end);
    }
    else if (arr[mid] < x){
      start = mid;
      end = arr.length-1;
      return binarySearch(arr, x, start, end);
    }
    else{
      return mid;
    }
  }
  
  public static String binaryConversion(int dec){
    String s = "";
    if (dec == 0){
      s = "0";
    }
    else if (dec == 1){
      s = "1";
    }
    else{
      s = binaryConversion(dec/2) + "" + dec%2;
    }
    return s;
  }
  
  public static int findGCD(int m, int n){
    if (m % n == 0){
      return n;
    }
    else{
      return findGCD(n ,(m % n));
    }
  }

  
  public static int power(int m, int n){
    int product = 1;
    if (n == 0){
      return 1;
    }
    else if (n == 1){
      return m;
    }
    else{
      product = power(m, n-1) * m;
      return product;
    }
  }
  
  public static int powerSimpler(int m, int n){
    int product = 1;
    if (n == 0){
      return 1;
    }
    else if (n == 1){
      return m;
    }
    else if (n % 2 == 0){
      product = powerSimpler(m , n/2) * powerSimpler(m , n/2);
      return product;
    }
    else{
      product = powerSimpler(m , n/2) * powerSimpler(m , n/2) * m;
      return product;  
    }
  }
      
  
    
  
             
  
  public static void main(String[] args){
//    System.out.println(factorial(5));
//    System.out.println(fibonacci(9));
//    int[] arr = {1,2,3,4,5,6,7,8};
//    System.out.println(binarySearch(arr,2,0,6));
//    System.out.println(binaryConversion(6));
//    System.out.println(powerSimpler(2,5));
    System.out.println(findGCD(5,12));
  }
}
    
    