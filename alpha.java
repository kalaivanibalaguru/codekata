import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alpha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char c;
		Scanner s=new scanner(System.in);
    system.out.println("Enter a character: ");
    ch=s.next().charAt(0);
		
    if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
    {
    system.out.println("it is an alphabet.");
    }
    else
    { 
    system.out.println("it is not an alphabet.");
    }
	}
}