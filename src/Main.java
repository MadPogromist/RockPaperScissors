import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inObj = new Scanner(System.in);
        String user_input = inObj.next();
        int Get_Random = Randomise.Get_value();
        String res = WinCalc.Calc(Get_Random,user_input);
        System.out.println(res);

    }
}