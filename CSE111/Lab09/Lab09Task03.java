import java.util.Scanner;

class Lab09Task03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[];
        
        try{
          int x,n=sc.nextInt();
          a = new int[n];
          a[5]=99;
          x=n/0;
        }
        catch(ArithmeticException ar){
          System.out.println(ar);
        }
        catch(ArrayIndexOutOfBoundsException ie){
          System.out.println(ie);
        }
        catch(Exception e){
          System.out.println(e);
        }
        finally{
          System.out.println("done");
        }
    }
}
