public class Exptn_throw{

  public static void main(String[] args){
  check(3);
  System.out.println("normal flow....");

  }

  static void check(int i)throws ArithmeticException{ // throws :programarode parayunnu inna inna exption may be varaam enn.
    if(i>18){
      i++;
      System.out.println ( "welcome "+i);
    }
    else{
      try{
      System.out.println("veenda..tooo.."+i);
      i=i+10;
      throw new ArithmeticException("nauty boy");} //throw
      catch(Exception e){System.out.println("catchhhhhh");}
    }
    System.out.println("normal flow after if loop...."+i); //will nott work if thrown.

  }
}
