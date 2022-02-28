package switchcampaign;

public class PayPal2 {

	
/** 

Given a string, recursively remove adjacent duplicate characters from the string. The output string should not have any adjacent duplicates

*/


  static String clearAdjacentChars(String s) {
    if(s.length()<2){
      return s;
    }
    int index=-1, count =0;


    for(int i=0;i<s.length();i++){
      // System.out.println(s.charAt(i));
      if(s.charAt(i) == s.charAt(i+1)){
        if(count ==0){
          index = i;
        }
        count++;
        continue;
      }else{
        if(count>0){
          s = rec(index,i,s);
          s = clearAdjacentChars(s);
        }
        count =0;
      }
      
    }
    
    return s;  
  }
  static String rec(int index1,int index2,String s){
    String s1 = s.substring(0, index1);
    String s2 = s.substring(index2+1, s.length());
          s = s1+s2;
          return s;
  }
  public static void main(String[] args) {
    String str1 = "aaazxxzy";
    String str1out = "y";

    String str2 = "yyyy";
    String str2out = "";

    String str3 = "aaca";
    String str3out = "ca";


    System.out.println(clearAdjacentChars(str1).equals(str1out));
    System.out.println(clearAdjacentChars(str2).equals(str2out));
    System.out.println(clearAdjacentChars(str3).equals(str3out));

  }
}