import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static String codestring = "code";

    public static int value_Control(String[] values)
    {
        for(int i=0;i<values.length;i++)
        {
            if(values[i].equals(codestring))
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String enterstring = "";

        String[] values = new String[5];
        for(int i=0;i<5;i++)
        {
            out.print((i+1)+".Degeri Giriniz : ");
            enterstring = enter.nextLine();
            values[i] = enterstring;
        }

        out.println("Tanımlı value yu içeren String deger:" + value_Control(values));
    }
}