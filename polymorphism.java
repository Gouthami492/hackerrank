import java.util.*;
 class Phone{
	private String Model;
	
	public Phone(String model)
	{
		this.Model=model;
	}
	
	void features()
	{
		System.out.println("In Phone :  blaaaahhhhhhh");
		System.out.println(Model);
	}	
	public String  getModel()
	{
		return Model;
	}

}


public class Hello{
	
	public static void main(String []args)
	{
		Phone phone=new Phone("God Knows what I'm doing!");
		Phone phon=new Hello().phone(1);
		Phone pho=new Hello().phone(2);
		phon.features();
		pho.features();
		phone.features();
		Phone samsung=new Samsung("Hello",100);
		Phone sam=new Samsung("String");
	//	System.out.println("Hello "+phone.getModel());
		samsung.features();
		
		
		
		
	}
	
	public Phone phone(int num)
	{
		switch(num)
		{
		case 1: return new  Samsung("hey",101);
		case 2: return new Phone("Heyyy");
		}
		
		return null;
	}
}

class Samsung extends Phone
{
	//private String model;
	private int num;
	public Samsung(String str,int n)
	{
		super(str);
		this.num=n;
		
	}
	public Samsung(String str)
	{
		super(str);
	}
	void features()
	{
		System.out.println("Let me check if " +num+ " is displayed with String" );
		//System.out.println(str);
	}
}
 




