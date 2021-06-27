
import java.util.*;


public class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		//Boolean flag=true;
		boolean flag=false;
		while (sc.hasNext()) {
             
			String input=sc.next();
           
            Deque<Character> stack=new ArrayDeque<Character>();
            for(int i=0;i<input.length();i++)
           {
               char a=input.charAt(i);
               if(a=='(' || a=='{' || a=='[')
               {
                   stack.push(a);
                   continue;
               }
               if(stack.isEmpty())
               {
                flag=false;
                break;
               }
                char x;
                switch(a)
                {
                    case ')': x=stack.pop();
                              if(x=='{' || x=='[')
                               flag=false;
                              else
                              flag=true;
                               break;
                    case ']': x=stack.pop();
                               if(x=='(' || x=='{')
                               flag=false;
                               else
                            flag=true;
                               break;
                    case '}': x=stack.pop();
                               if(x=='(' || x=='[')
                               flag=false;
                               else
                               flag=true;
                               break;
                }              
           }                      
            if(flag==true)
 	           System.out.println("true");
 	           else
 	           System.out.println("false");                      
		}		
	}
}




