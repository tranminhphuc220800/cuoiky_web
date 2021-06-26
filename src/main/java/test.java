import java.util.List;

public class test {
    public static void main(String[] args) {
      dao dao=new dao();

        List<usermodel> list =dao.getuser("","dawdaw");


       for (usermodel o: list){
           System.out.println(o.toString());
       }
    }
}
