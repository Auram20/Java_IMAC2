
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 7
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

import calc.OpOrValue;
import java.util.Scanner;



public class Main   
{ 

  public static OpOrValue parse(Scanner scanner) 
  {
    String s = scanner.next();
    OpOrValue expression;
    switch (s) {
      case ("+") : 
        expression = new OpOrValue(OpOrValue.OP_ADD, parse(scanner), parse(scanner));
        return expression;
      case ("-") : 
        expression = new OpOrValue(OpOrValue.OP_SUB, parse(scanner), parse(scanner));
        return expression;
      default :
        expression = new OpOrValue(Integer.parseInt(s));
        System.out.println(s);
        return expression;
    }
  }


	public static void main(String[] args) 
	{
        // OpOrValue expression;
        // try
        // {
        //   expression = new OpOrValue(OpOrValue.OP_ADD,
        //     new OpOrValue(2),
        //     new OpOrValue(3)
        //     );  
        //    System.out.println(expression.eval());
        // }
        // catch(Exception e) 
        // {
        //     e.printStackTrace();
        // }
    
        Scanner scanner = new Scanner(System.in);
		    var e = parse(scanner);
        System.out.println("e:" + e.eval());
        System.out.println(e.eval());
    
    }

}
