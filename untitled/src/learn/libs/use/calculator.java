package learn.libs.use;

import java.util.Scanner;
import learn.libs.libs_handler;

public class calculator implements libs_handler{
    public void run(){
        Scanner s = new Scanner(System.in);
        double num1, num2, andword;
        String g;
        andword = 0;
        print.text("type num1: ");
        num1 = s.nextDouble();
        print.text("type num2: ");
        num2 = s.nextDouble();
        print.text("type * / + - %: ");
        g = s.next();
        if (g.equals("*")){
            andword = num1 * num2;
        }
        else{
            if (g.equals("+")){
                andword = num1 + num2;
            }
            else{
                if (g.equals("-")){
                    andword = num1 - num2;
                }
                else{
                    if (g.equals("/")){
                        andword = num1 / num2;
                    }
                    else{
                        if (g.equals("%")){
                            andword = num1 % num2;
                        }
                        else{
                            print.text("not programd");
                        }
                    }
                }
            }
        }
        print.numdouble(andword);
    }
}
