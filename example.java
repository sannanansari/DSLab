import java.util.*;
import java.io.*;

public class example {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    System.out.println("Enter the test cases");
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    System.out.println("Enter DAMAGE AND string");
    for (int i = 0; i < t; ++i) {
    	int damage = in.nextInt();
        String input = in.next();
        String answer1 = answer(damage,input);
      System.out.println("Case #" + i + ": " + answer1) ;
    }
  }
static String answer(int D,String code){
	String x=new String("SS");
	String y=new String("CC");
	if(code.equals(x)){
		String a="IMPOSSIBLE";
		return a;
	}
	if(code.equals(y)){
		String a= "0";
		return a;
	}
	String ans=danger(D,code);
	return ans;
}

static String danger(int D,String code){
	int Damage=1,shoot=1,swaping=0,z=0;
	String character,swaping1="0",str="0",strIncremented=new String("0");;
	for(int i=0;i<code.length()-1;i++){
	character=Character.toString(code.charAt(i));
	z=i;
}
	if(character == "C"){
		Damage*=2;
	}
	else {
		
		if(shoot+(Damage-1) > D){
			strIncremented+=(char)(str.charAt(0)+1);
			code =check(D,code,shoot,z);
			//String code1 = swap(D,code,i);strIncremented+=(char)(str.charAt(i)+1);
			danger(D,code);
		}
		shoot =shoot + (Damage-1);	
	}
	swaping1= Integer.toString(swaping);	
return strIncremented;
}



static String check(int D,String code,int shoot,int i1){
	shoot /=2;
	StringBuilder sbldr = new StringBuilder(code);
	for(int i=0;i<code.length()-1;i++){
		i1-=1;
		String a = Character.toString(sbldr.charAt(i1));
		String d = Character.toString(sbldr.charAt(i1));
		String b = Character.toString(sbldr.charAt(i-1));
		String c = Character.toString(sbldr.charAt(i-1));
		a=b;
		c=d;
	}
	return sbldr.toString();
}
}