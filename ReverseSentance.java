package StringExample;

public class ReverseSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = "My name is Jyothsna Devi".split(" "); 
        String result = ""; 
        for (int i=s.length-1;i>=0;i--){
       	 result += s[i] + " ";
       	 } 
        System.out.println(result);

	}

}
