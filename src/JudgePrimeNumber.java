import java.util.*;
public class JudgePrimeNumber {

	public static int OddOrEvenNum(int n)//耞/案计
	{
		if(n%2==0)
		{
			System.out.println(n+"琌案计");
			return 0;
		}
		else
		{
			System.out.println(n+"琌计");
			return 1;
		}
	}
	
	public static int PrimeNum(int n)//耞琌借计
	{
		//璝N>=2案计玥ゲぃ琌借计
		if(OddOrEvenNum(n)==0 && n!=2)
		{
			System.out.println(n+"ぃ琌借计");
			return 0;
		}
		
		//眖3秨﹍耞琌砆n俱埃(埃┮Τ案计)
		int i=3;
		while(i<=Math.sqrt(n))//i惠耞腹N
		{
			if(n%i==0)
			{
				System.out.println(n+"ぃ琌借计");
				return 0;
			}
			i+=2;
		}
		System.out.println(n+"琌借计");
		return 1;
	}
	
	public static void DeficientNum(int n)//耞Ч计/莲计/计
	{
		int sum=1;
		//for癹伴仓┮Τ计
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			//耞计Τㄇ
			if(n%i==0)
			{
				sum+=i;
				//Nぃ琌Чキよ计薄猵
				if(i!=(n/i))
				{
					sum+=(n/i);
				}
			}
		}
		//耞Ч计/莲计/计
		if(sum<n)
			System.out.println(n+"琌莲计");
		else if(sum==n)
			System.out.println(n+"琌Ч计");
		else
			System.out.println(n+"琌计");
	}
	
	public static void PrimeFactorization(int n, int f)//秈︽借计だ秆
	{
		System.out.print(n+" = ");
		//耞琌借计璝N借计玥钡
		if(f==1)
			System.out.print(n);
		else
		{
			//秈︽借计だ秆
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
		//do while癹伴籹匡虫
		do 
		{
			System.out.print("叫拜眤稱璶1.耞计 2.瞒秨: ");
			input=sc.nextInt();
			if(input==1) 
			{
				System.out.print("叫块计2~nぇ丁计: ");
				num=sc.nextInt();
				//逼埃块岿粇
				while(num<=1)
				{
					System.out.print("Αぃ才叫块计2~nぇ丁计: ");
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
