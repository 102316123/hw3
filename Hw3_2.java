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
			System.out.print("1)輸入 2)查詢 -1)end:");
			op = enter.nextInt();
			if(op == 1)
			{
				while(true)
				{
					System.out.println("請輸入學生姓名 -1)end:");
					temp = enter.next();
					if(temp.equals("-1"))
					{
						break;
					}
					else
					{
						System.out.println("請輸入學生成績:");
						score = enter.nextInt();
					
						hashmap.put(temp,score);
					}
				}
			}
			else if(op == 2)
			{
				
				System.out.print("請輸入搜尋的姓名");
				sname = enter.next();
				if(sname.equals("-1"))
				{
					break;
				}
				else
				{
					if(hashmap.get(sname)!= null)
					{
						System.out.println("學生姓名:" + sname);
						System.out.printf("學生成績:%d\n",hashmap.get(sname));
					}
					else
					{
						System.out.println("查無此學生!!!");
					}
				}
			}
			else if(op == -1)
			{
				break;
			}
			else
			{
				System.out.println("無效輸入!!!");
			}
		}
	}
}