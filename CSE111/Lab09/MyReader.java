import java.util.*;

public class MyReader{
  int readInteger() throws EitaIntegerNoiException{
      Scanner k = new Scanner(System.in);     
      int answer;       
      String s;
      if (s.contains(".")){
        throw new EitaIntegerNoiException();            
      }
      else{
        answer = Integer.parseInt(s); 
      }
      return answer;
  }
}
          

          