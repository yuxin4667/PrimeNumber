import java.util.*;
public class JudgePrimeNumber {

	public static int OddOrEvenNum(int n)//判斷奇/偶數
	{
		if(n%2==0)
		{
			System.out.println(n+"是偶數");
			return 0;
		}
		else
		{
			System.out.println(n+"是奇數");
			return 1;
		}
	}
	
	public static int PrimeNum(int n)//判斷是否為質數
	{
		//若N為>=2的偶數則必不是質數
		if(OddOrEvenNum(n)==0 && n!=2)
		{
			System.out.println(n+"不是質數");
			return 0;
		}
		
		//從3開始判斷是否可被n整除(已去除所有偶數)
		int i=3;
		while(i<=Math.sqrt(n))//i只需判斷至根號N
		{
			if(n%i==0)
			{
				System.out.println(n+"不是質數");
				return 0;
			}
			i+=2;
		}
		System.out.println(n+"是質數");
		return 1;
	}
	
	public static void DeficientNum(int n)//判斷完美數/虧數/盈數
	{
		int sum=1;
		//for迴圈累加所有因數
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			//判斷因數有哪些
			if(n%i==0)
			{
				sum+=i;
				//N不是完全平方數的情況
				if(i!=(n/i))
				{
					sum+=(n/i);
				}
			}
		}
		//判斷完美數/虧數/盈數
		if(sum<n)
			System.out.println(n+"是虧數");
		else if(sum==n)
			System.out.println(n+"是完美數");
		else
			System.out.println(n+"是盈數");
	}
	
	public static void PrimeFactorization(int n, int f)//進行質因數分解
	{
		System.out.print(n+" = ");
		//先判斷是否為質數，若N為質數則直接印出
		if(f==1)
			System.out.print(n);
		else
		{
			//進行質因數分解
			int i=2;
			while(n>1)
			{
				while(n%i==0)
				{
					System.out.print(i);
					if(n!=i)
						System.out.print("*");
					n=n/i;
				}
				i++;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input, num;
		//do while迴圈製作選單
		do 
		{
			System.out.print("請問您想要1.判斷數字 2.離開: ");
			input=sc.nextInt();
			if(input==1) 
			{
				System.out.print("請輸入數值2~n之間的數: ");
				num=sc.nextInt();
				//排除輸入錯誤
				while(num<=1)
				{
					System.out.print("格式不符，請輸入數值2~n之間的數: ");
					num=sc.nextInt();
				}
				int f=PrimeNum(num);
				DeficientNum(num);
				PrimeFactorization(num, f);
			}
		}while(input!=2);
		
		sc.close();
		return;
	}
}