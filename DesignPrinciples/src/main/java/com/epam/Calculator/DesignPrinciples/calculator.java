package com.epam.Calculator.DesignPrinciples;
import java.util.*;
import javax.script.ScriptException;
@SuppressWarnings("restriction")
public class calculator 
{
    private static Scanner sc;

	public static void main( String[] args ) throws ScriptException
    {
        sc = new Scanner(System.in);
        System.out.println("Enter your inputs like '2+3+4/3*2' by following Bodmas rule");
        String s=sc.next();
        calculate c=new calculate();
        System.out.println("Result is "+c.cal(s));
    }
}
