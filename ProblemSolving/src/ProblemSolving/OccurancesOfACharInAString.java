package probelmSolving;

public class OccurancesOfACharInAString {
	
	public static int count(String s,char c,int index,int tot){
        if(index == s.length())
               return tot;
        else if(c==s.charAt(index)){
               tot++;
        }
        return  count(s,c,++index,tot);
               
 }
 
 public static void main(String args[])
 {
        String s="Java is Java Again and Again";
        char givenChar='a';
        
        int countOfChar=count(s,givenChar,0,1);
        System.out.println("a occurs "+countOfChar+" times");
 }


}
