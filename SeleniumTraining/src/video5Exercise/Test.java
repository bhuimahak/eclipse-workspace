package video5Exercise;

public class Test {

public static void main(String[] args) {

try{
int o[] = new int[2];
o[4]=23;
}catch(Exception e){
System.out.println(e.getMessage());
e.printStackTrace();
}


}

}