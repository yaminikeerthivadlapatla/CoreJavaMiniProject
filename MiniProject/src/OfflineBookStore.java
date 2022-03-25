import java.util.*;
public class OfflineBookStore {
	String author;
	String title;
	String bookno;
	int price;
	Scanner s = new Scanner(System.in);
	public void Books() 
	{
		System.out.print("Enter Bookno: ");
		bookno = s.next();
		System.out.print("Enter Author: ");
		author = s.next();
		System.out.print("Enter Title: ");
		title = s.next();
		System.out.print("Enter Price: ");
		price = s.nextInt();
	}
	public void showdetails()
	{
		System.out.println(bookno + "," + author + "," + title + "," + price );
	}
	boolean search(String auth) 
	{
		if (author.equals(auth)) 
		{
			showdetails();
			return (true);
		}
		return (false);
	}
	boolean search1(String tle) 
	{
		if (title.equals(tle)) 
		{
			showdetails();
			return (true);
		}
		return (false);
	}
	 boolean search2(String bkn )
	 { 
		 if (bookno.equals(bkn)) 
		 {
			 showdetails();
			 return(true);
			 }
		 return (false);
		 }
	 public static void main(String arg[]) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("No.of Authors: ");
		int n = s1.nextInt();
		OfflineBookStore C[] = new OfflineBookStore[n];
		for (int i = 0; i < C.length; i++) 
		{
			C[i] = new OfflineBookStore();
			C[i].Books();
		}
		int ch;
		do {
			System.out.println("Main Menu\n1. Display All\n 2. Search By author\n 3.search by title \n 4.search bookno \n 5.Exit ");
			System.out.print("Ur Choice :");
			ch = s1.nextInt();
			switch (ch) 
			{
			case 1:
				for (int i = 0; i < C.length; i++)
				{
					C[i].showdetails();
				}
				break;
			case 2:
				System.out.print("Enter Author name you want to Search...: ");
				String author = s1.next();
				boolean found = true;
				for (int i = 0; i < C.length; i++) 
				{
					found = C[i].search(author);
					if (found) 
					{
						break;
					}
				}
				if (!found) 
				{
					System.out.println(" Failed Searching...Entered Author Name Not Exist..");
				}
				break;
			case 3:
				System.out.print("Enter title you want to Search...: ");
                String title= s1.next();
                found = true;
                for (int i = 0; i < C.length; i++) 
                {
                    found = C[i].search1(title);
                    if (found) 
                    {
                        break;
                    }
                }
                if (!found) 
                {
                    System.out.println("Failed Searching...Entered Title Name Not Exist..");
                }
                break;
			 case 4:
				 System.out.print("Enter bookno : ");
				 String bookno = s1.next();
				 found = false;
				 for (int i = 0; i < C.length; i++)
				 { 
					 found = C[i].search2(bookno);
					 if (found)
					 {
						 break;
					 }
				 }
				 if (!found)
				 {
					 System.out.println("Failed Searching....Entered Boookno not Exist..");
				 }
				 break;

			case 5:
				System.out.println("Thank You...Visit Again...");
				break;
			}
		} while (ch!=5);
	}
}