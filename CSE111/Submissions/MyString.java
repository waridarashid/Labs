public class MyString{
  private char[] ch;
  
  public MyString(){
  }
  
  public MyString(String str){
    ch = str.toCharArray();
  }
  
  public MyString(char[] charSeq){
    ch = new String(charSeq).toCharArray();
  }
  

  public String toString() {
    return new String(ch);
  }
    
      
  public int length(){
    return ch.length;
  }
  
  public char charAt(int i){
    if(i < 0 || i>=ch.length){
      System.out.println ("Invalid index");
      return ' ';
    }
    else{
      return ch[i];
    }
  }
  
  public boolean startsWith(MyString prefix){
    boolean bool = true;
    if(prefix.length() > ch.length){
      bool = false;
    }
    else{
      for (int i=0; i<prefix.length(); i++){
        if (prefix.charAt(i)!=ch[i]){
          bool = false;
          break;
        }
      }
    }
    return bool;
  }
  
  public boolean endsWith(MyString prefix){
    boolean bool = true;
    if (prefix.length() > ch.length){
      bool = false;
    }
    else{
      for (int i=0; i<prefix.length();i++){
        if (prefix.charAt(i) != ch[(ch.length-prefix.length())+i]){
          bool = false;
          break;
        }
      }
    }
    return bool;
  }
  
  public boolean endsWith(String prefix){
    return endsWith(new MyString(prefix));
  }
  
  public MyString replaceFirst(char oldChar, char newChar){
    char[] newArr = new char[ch.length];
    boolean replaced = false;
    
    for(int i=0; i<ch.length; ++i) {
      if(ch[i] == oldChar && !replaced) {
        newArr[i] = newChar;
        replaced = true;
      } 
      else {
        newArr[i] = ch[i];
      }
    }    
    return new MyString(newArr);
  }
  
  public MyString replaceAll(char oldChar, char newChar){
    char[] newArr = new char[ch.length];
    
    for (int i=0; i<newArr.length; i++){
      if (ch[i]==oldChar){
        newArr[i] = newChar;
      }
      else {
        newArr[i] = ch[i];
      }
    }
    return new MyString(newArr);
  }

  public MyString replaceLast(char oldChar, char newChar){
    char[] newArr = new char[ch.length];
    boolean replaced = false;
    
    for (int i=newArr.length-1; i>=0; i--){
      if (ch[i]==oldChar && !replaced){
        newArr[i] = newChar;
        replaced = true;
      }
      else {
        newArr[i] = ch[i];
      }
    }
    return new MyString(newArr);
  }
  
  public MyString toUpperCase(){
    char[] upper = new char[ch.length];
    boolean lower = false;
    
    for(int i=0; i<ch.length; i++){
      if (ch[i] >= 'A' && ch[i]<='Z'){
        upper[i] = ch[i];
      }
      else {
        upper[i] = (char)(ch[i] - ('a'-'A'));
        lower = true;
      }
    }
    if (!lower){
      upper = ch;
    }
    return new MyString(upper);
  }
  
  public MyString toLowerCase(){
    char[] lower = new char[ch.length];
    boolean upper = false;
    
    for(int i=0; i<ch.length; i++){
      if (ch[i] >= 'a' && ch[i]<='z'){
        lower[i] = ch[i];
      }
      else {
        lower[i] = (char)(ch[i] + ('a'-'A'));
        upper = true;
      }
    }
    if (!upper){
      lower = ch;
    }
    return new MyString(lower);
  }
  
  public boolean equals(MyString rightStr){
    boolean equal = true;
    if (rightStr.ch.length != ch.length){
      equal = false;
    }
    else{
      for (int i=0; i<ch.length; i++){
        if (ch[i] != rightStr.ch[i]){
          equal = false;
          break;
        }
      }
    }
    return equal;
  }
  
  public boolean equalsIgnoreCase(MyString rightStr){
    MyString parameter = rightStr.toLowerCase();
    MyString mainStr = this.toLowerCase();
    boolean equal = true;
    
    if(parameter.length() != mainStr.length()){
      equal = false;
    }
    else{
      for(int i=0; i<mainStr.length(); i++){
        if (mainStr.ch[i] != parameter.ch[i]){
          equal = false;
          break;
        }
      }
    }
    return equal;
  }
  
  public int indexOf(char chr){
    int index = -1;
    int i;
    
    for (i=0; i<ch.length; i++){
      if (ch[i] == chr){
        index = i;
        break;
      }
    }
    return index;
  }
  
  public int lastIndexOf(char chr){
    int index = -1;
    
    for (int i=ch.length-1; i>=0; i--){
      if (ch[i] == chr){
        index = i;
        break;
      }
    }
    return index;
  }
  
  public int indexOf(char chr, int start){
    int index = -1;
    int i;
    if (start < ch.length && start>=0){
      for (i=start; i<ch.length; i++){
        if (ch[i] == chr){
          index = i;
          break;
        }
      }
    }
    return index;
  }
  
  public int lastIndexOf(char chr, int start){
    int index = -1;
    if (start < ch.length && start>=0){
      for (int i=ch.length-1; i>=start; i--){
        if (ch[i] == chr){
          index = i;
          break;
        }
      }
    }
    return index;
  }
  
  public int indexOf(MyString str){
    int index = -1;
    
    for (int i=0; i<ch.length; i++){
      if (ch[i] == str.ch[0]){
        index = i;
        for (int j=1; j<str.ch.length-1; j++) {
          if (ch[i+j] != str.ch[j]){
            index = -1;
            break;
          }
        }
      }
      if (index != -1){
        break;
      }
    }
    return index;
  }
  
  public int lastIndexOf(MyString str){
    int index = -1;
    
    for (int i=ch.length-1; i>=0; i--){
      if (ch[i] == str.ch[str.ch.length-1]){
        int j,k;
        for (j=str.ch.length-2, k=i--; j>=0; j--,k--) {
          if (ch[i] != str.ch[j]){
            index = -1;
            break;
          }
        }
        if (j<0){
          index = k;
        }
      }
      if (index != -1){
        break;
      }
    }
    return index;
  }
  
  public MyString substring (int start){
    if (start>0 && start < ch.length){
      char[] sub = new char[ch.length-start];
      
      for (int i=0; i<sub.length; i++){
        sub[i] = ch[start+i];
      }
      return new MyString(sub);
    }
    else{
    String s = "invalid index";
    return new MyString(s);
    }
  }
  
  public MyString substring (int start, int end){
    if (start>0 && end>start && end < ch.length){
      char[] sub = new char[end-start+1];
      
      for (int i=0; i<sub.length; i++){
        sub[i] = ch[start+i];
      }
      return new MyString(sub);
    }
    else{
    String s = "invalid index";
    return new MyString(s);
    }
  }
    
    public MyString concat(MyString str){
      if (str != null){
        char[] concatenated = new char[str.ch.length+ch.length];
        
        for (int i=0; i<concatenated.length; i++){
          if (i<ch.length){
            concatenated[i] = ch[i];
          }
          else{
            concatenated[i] = str.ch[i-ch.length];
          }
        }
        return new MyString(concatenated);
      }
      else{
        return this;
      }
    }
    
    public MyString concat(char[] charSeq){
      char[] concatenated = new char[charSeq.length+ch.length];
      
      for(int i=0; i<concatenated.length; i++){
        if (i<ch.length){
          concatenated[i] = ch[i];
        }
        else{
          concatenated[i] = charSeq[i-ch.length];
        }
      }
      return new MyString(concatenated);
    }
    
    public int compareTo(MyString str){
      int limit = Math.min(str.ch.length, ch.length);
      
      for (int i=0; i<limit; i++){
        if (str.ch[i] != ch[i]){
          return ch[i] - str.ch[i];
        }
      }
      return ch.length-str.ch.length;
    }
          
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  }



  
  

        
    
  

      

    
  
      
    

      




          
      
    

        
        
      

   
  
  

   
  




  


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    