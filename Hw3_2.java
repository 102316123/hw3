import java.io.*;
import java.util.*;

class Hw3_2
{
	public static void main(String[] args)
	{
		Scanner enter = new Scanner(System.in);
		String temp = "";
		HashMap hashmap = new HashMap();
		String name = new String();
		String sname = new String();
		int score = 0,op = 0;
		while(true)
		{
			System.out.print("1)��J 2)�d�� -1)end:");
			op = enter.nextInt();
			if(op == 1)
			{
				while(true)
				{
					System.out.println("�п�J�ǥͩm�W -1)end:");
					temp = enter.next();
					if(temp.equals("-1"))
					{
						break;
					}
					else
					{
						System.out.println("�п�J�ǥͦ��Z:");
						score = enter.nextInt();
					
						hashmap.put(temp,score);
					}
				}
			}
			else if(op == 2)
			{
				
				System.out.print("�п�J�j�M���m�W");
				sname = enter.next();
				if(sname.equals("-1"))
				{
					break;
				}
				else
				{
					if(hashmap.get(sname)!= null)
					{
						System.out.println("�ǥͩm�W:" + sname);
						System.out.printf("�ǥͦ��Z:%d\n",hashmap.get(sname));
					}
					else
					{
						System.out.println("�d�L���ǥ�!!!");
					}
				}
			}
			else if(op == -1)
			{
				break;
			}
			else
			{
				System.out.println("�L�Ŀ�J!!!");
			}
		}
	}
}