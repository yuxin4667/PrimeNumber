import java.util.*;
public class JudgePrimeNumber {

	public static int OddOrEvenNum(int n)//�P�_�_/����
	{
		if(n%2==0)
		{
			System.out.println(n+"�O����");
			return 0;
		}
		else
		{
			System.out.println(n+"�O�_��");
			return 1;
		}
	}
	
	public static int PrimeNum(int n)//�P�_�O�_�����
	{
		//�YN��>=2�����ƫh�����O���
		if(OddOrEvenNum(n)==0 && n!=2)
		{
			System.out.println(n+"���O���");
			return 0;
		}
		
		//�q3�}�l�P�_�O�_�i�Qn�㰣(�w�h���Ҧ�����)
		int i=3;
		while(i<=Math.sqrt(n))//i�u�ݧP�_�ܮڸ�N
		{
			if(n%i==0)
			{
				System.out.println(n+"���O���");
				return 0;
			}
			i+=2;
		}
		System.out.println(n+"�O���");
		return 1;
	}
	
	public static void DeficientNum(int n)//�P�_������/����/�ռ�
	{
		int sum=1;
		//for�j��֥[�Ҧ��]��
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			//�P�_�]�Ʀ�����
			if(n%i==0)
			{
				sum+=i;
				//N���O��������ƪ����p
				if(i!=(n/i))
				{
					sum+=(n/i);
				}
			}
		}
		//�P�_������/����/�ռ�
		if(sum<n)
			System.out.println(n+"�O����");
		else if(sum==n)
			System.out.println(n+"�O������");
		else
			System.out.println(n+"�O�ռ�");
	}
	
	public static void PrimeFactorization(int n, int f)//�i���]�Ƥ���
	{
		System.out.print(n+" = ");
		//���P�_�O�_����ơA�YN����ƫh�����L�X
		if(f==1)
			System.out.print(n);
		else
		{
			//�i���]�Ƥ���
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
		//do while�j��s�@���
		do 
		{
			System.out.print("�аݱz�Q�n1.�P�_�Ʀr 2.���}: ");
			input=sc.nextInt();
			if(input==1) 
			{
				System.out.print("�п�J�ƭ�2~n��������: ");
				num=sc.nextInt();
				//�ư���J���~
				while(num<=1)
				{
					System.out.print("�榡���šA�п�J�ƭ�2~n��������: ");
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
