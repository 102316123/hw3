import java.io.*;
import java.util.*;

class Hw3_1
{
	public static void main(String[] args)
	{
		ArrayList<String> myList = new ArrayList<String>();  //���w�OString�����A
        Scanner enter = new Scanner(System.in);
        String s = new String();
		String[] a = new String[100];

		int k = 0,m = 0,n = 0,acount = 0,count = 0;
		boolean yn;  //�Y�ΤW�����Ҥl �]����s�r�� �ҥH�^��true
		while(true)
		{
			System.out.print("1)�гs���J�r�� -1)end:");			
			s = enter.nextLine();
			if(s.equals("-1"))
			{
				System.out.println("�^��r��:");
				Collections.sort(myList);
				for (int i = 0;i < myList.size();i++) 
				{ 
					System.out.println(myList.get(i)); 
				}
				System.out.print("�Ʀr�֥[:");
				for(int i = 0;i < acount;i++)
				{
					count = count + (Integer.parseInt(a[i]));
				}
				System.out.printf("%d",count);
				break;
			}
			else
			{
				String[] tokens = s.split(" |\\,|\\!|\\.|\\?|\\�C|;|:");
				for (String token:tokens) 
				{
					for(int j = 0;j < token.length();j++)
					{
						if(Character.isDigit(token.charAt(j)))
						{
							m++;
						}
						else
						{
							n++;
						}
					}
					if(m == token.length())
					{
						m = 0;
						n = 0;
						a[acount] = new String();
						a[acount] = token;
						acount++;
					}
					else if(n == token.length())
					{
						m = 0;
						n = 0;
						token = token.toLowerCase();
						yn = myList.contains(token);  //��token�r�� �ҥH�^��true
						if(yn == false)
						{
							myList.add(token);
						}
					}
					else
					{
						m = 0;
						n = 0;
					}
					//System.out.println(token);
				}
			}
		}			
	}
}