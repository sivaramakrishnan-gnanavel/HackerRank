import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
abstract class Book {
    String title;
    abstract String setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    public String setTitle(String title){
        return title;
    }
}

public class JavaAbstractClass{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
