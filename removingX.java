package Udemy;
public class removingX {

	public String withoutX(String str) {
		  int strLen = str.length();
		  
		  if (strLen>=1){
		    String fr = str.substring(0,1);
		    String ls = str.substring(strLen - 1);
		    
		    if(fr.equals("x")){
		      return str.substring(1,strLen);
		    }
		    if(ls.equals("x")){
		      return str.substring(0,strLen-1);
		    }
		    if (fr.equals("x") && ls.equals("x")){
		      return str.substring(1,strLen-1);
		    }
		  }
		  
		  return str;
		  
		}
	public static void main(String args[]){
		String str = "xHix";
		removingX rm = new removingX();
		rm.withoutX(str);
	}
}
