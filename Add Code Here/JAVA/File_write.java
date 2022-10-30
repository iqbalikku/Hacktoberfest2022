import java.io.PrintWriter;

public class File_write{
public static void main(String[] args) {
  try{
  PrintWriter writr=new PrintWriter("b.txt");
 writr.write("this is new text,,,,,,,fgegegerf,,,");
 writr.flush();
 writr.close();
 System.out.println("suucsefull...");
}
catch (Exception e) {System.out.println(e);
}

}
}
