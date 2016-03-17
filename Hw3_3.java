import java.io.*;
import java.util.*;

class Hw3_3
{
	public static void main(String[] args)throws IOException
	{
		Scanner enter = new Scanner(System.in);
		String s = new String();
		HashMap hashmap = new HashMap();
		String sstring = new String();
		int op = 0,m = 0,one = 1,num = 0,i = 0;
		Object temp;
		String hole = "";
		String rs = "";
		
		FileReader fr = new FileReader("123.txt");//讀檔
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()) 
		{
			if(i == 0)//讀KEY
			{
				rs = br.readLine();
				i = 1;
			}
			else if(i == 1)//讀value
			{
				i = 0;
				hashmap.put(rs,br.readLine());//存 KEY,value
			}
        }
        fr.close();
		
		while(true)
		{
			System.out.print("1)輸入 2)查詢 -1)end:");
			op = Integer.parseInt(enter.nextLine());
			if(op == 1)
			{
				while(true)
				{
					System.out.println("請連續輸入字串 -1)end:");
					
					hole = (enter.nextLine()).toLowerCase();
					if(hole.equals("-1"))
					{	
						break;
					}
					else
					{
						String[] tokens = hole.split(" |\\,|\\!|\\.|\\?|\\。|;|:");
						for(int j = 0;j < tokens.length;j++)
						{
							if(hashmap.get(tokens[j])!= null)
							{
									temp = hashmap.get(tokens[j]);
									num = Integer.valueOf((String)temp)+1;
									hole = Integer.toString(num);
									hashmap.put(tokens[j],hole);
							}
							else
							{
								hashmap.put(tokens[j],"1");
							}
						}
					}
				}
			}
			else if(op == 2)
			{
				System.out.print("請輸入搜尋的字串:");
				sstring = enter.nextLine();
				
				if(hashmap.get(sstring)!= null)
				{
					System.out.println("字串長像:" + sstring);
					System.out.println("字串次數:"+hashmap.get(sstring));
				}
				else
				{
					System.out.println("查無此字串!!!");
				}

			}
			else if(op == -1)
			{
				FileWriter fw = new FileWriter("123.txt");
				
				for (Object key : hashmap.keySet())	// 存檔
				{
					fw.write(key+"\n"+hashmap.get(key)+"\n");
				}
				
				fw.flush();
				fw.close();
				break;
			}
			else
			{
				System.out.println("無效輸入!!!");
			}	
		}
	}
}