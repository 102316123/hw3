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
		
		FileReader fr = new FileReader("123.txt");//Ū��
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()) 
		{
			if(i == 0)//ŪKEY
			{
				rs = br.readLine();
				i = 1;
			}
			else if(i == 1)//Ūvalue
			{
				i = 0;
				hashmap.put(rs,br.readLine());//�s KEY,value
			}
        }
        fr.close();
		
		while(true)
		{
			System.out.print("1)��J 2)�d�� -1)end:");
			op = Integer.parseInt(enter.nextLine());
			if(op == 1)
			{
				while(true)
				{
					System.out.println("�гs���J�r�� -1)end:");
					
					hole = (enter.nextLine()).toLowerCase();
					if(hole.equals("-1"))
					{	
						break;
					}
					else
					{
						String[] tokens = hole.split(" |\\,|\\!|\\.|\\?|\\�C|;|:");
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
				System.out.print("�п�J�j�M���r��:");
				sstring = enter.nextLine();
				
				if(hashmap.get(sstring)!= null)
				{
					System.out.println("�r�����:" + sstring);
					System.out.println("�r�ꦸ��:"+hashmap.get(sstring));
				}
				else
				{
					System.out.println("�d�L���r��!!!");
				}

			}
			else if(op == -1)
			{
				FileWriter fw = new FileWriter("123.txt");
				
				for (Object key : hashmap.keySet())	// �s��
				{
					fw.write(key+"\n"+hashmap.get(key)+"\n");
				}
				
				fw.flush();
				fw.close();
				break;
			}
			else
			{
				System.out.println("�L�Ŀ�J!!!");
			}	
		}
	}
}