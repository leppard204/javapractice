package 복학연습;

import java.util.Scanner;
public class 첫번쨰 {
public static void main(String[]args) 
{
    /*Scanner stdin=new Scanner(System.in);
    int a,b;
    a=stdin.nextInt();
    b=stdin.nextInt();
    int cnt=a*b;
    int[][] arr=new int[a][b];
    for(int i=0;i<a;++i)
    {
    	for(int j=0;j<b;j++)
    	{
    		arr[i][j]=cnt;
    		--cnt;
    		System.out.print(arr[i][j]+" ");
    	}
    	System.out.println();
    }*/
	
	/*Scanner stdin=new Scanner(System.in);
	int n=stdin.nextInt();
	int arr[][]=new int[n][n];
	for(int i=0;i<n;++i)
	{
		for(int j=0;j<n;++j)
		{
			arr[i][j]=n+n*j-i;
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}*/
	
	/*Scanner stdin=new Scanner(System.in);
	int n=stdin.nextInt();
	int cnt=1;
	int arr[][]=new int[n][n];
	for(int i=0;i<n;i+=2)
	{
		for(int j=0;j<n;++j)
		{
			arr[i][j]=n+n*i-j;
		}
	}
	for(int i=1;i<n;i+=2)
	{
		for(int j=0;j<n;++j)
		{
			arr[i][j]=n*i+1+j;
		}
	}
	for(int i=0;i<n;++i)
	{
		for(int j=0;j<n;++j)
			System.out.print(arr[i][j]+" ");
		System.out.println();
	}*/
	
	/*Scanner stdin=new Scanner(System.in);
	int n=stdin.nextInt();
	int cnt=1;
	int arr[][]=new int[n][n];
	
	for(int i=0;i<n;i+=2)
	{
		for(int j=0;j<n;j++)
		{
			arr[j][i]=n+n*i-j;
		}
	}
	for(int i=1;i<n;i+=2)
	{
		for(int j=0;j<n;j++)
		{
			arr[j][i]=n*i+j+1;
		}
	}
	for(int i=0;i<n;++i)
	{
		for(int j=0;j<n;++j)
			System.out.print(arr[i][j]+" ");
		System.out.println();
	}*/
	
	/*Scanner stdin=new Scanner(System.in);
	int N=stdin.nextInt(),M=stdin.nextInt();
	int[] arr=new int[N+1];
	int[] result=new int[M];
	for(int i=1;i<=N;++i) {
		int a=stdin.nextInt();
		arr[i]+=arr[i-1]+a;
	}
	for(int x=0;x<M;++x)                        범위합
	{
		int i=stdin.nextInt();
		int j=stdin.nextInt();
		result[x]=arr[j]-arr[i-1];
		System.out.println(result[x]);
	}*/
	
	/*Scanner stdin=new Scanner(System.in);
	int a=stdin.nextInt();
	int b=stdin.nextInt();
	int c=stdin.nextInt();
	if(b+c<60)
		b+=c;
	else if(b+c>=60)                   
	{
		a+=(b+c)/60;                       오븐시계
		if(a>23)
			a=a-24;
		b=b+c-((b+c)/60)*60;
		if(b%60==0)
			b=0;
	}
	System.out.println(a+" "+b);*/
	
    
	/*학점 * 과목평점의 합을 학점의 총합으로 나눔
		double hap=0; //학점의 합
		double cnt=0;    //학점 *과목평점
		double a[]=new double[20];  //학점
		String b[]=new String[20];
		String c[]=new String[20];  //과목평점
		Scanner stdin=new Scanner(System.in);
		for(int i=0;i<20;++i)
		{
			b[i]=stdin.next();
			a[i]=stdin.nextDouble();
			c[i]=stdin.next();
			hap+=a[i];
			switch(c[i])
			{
			case "A+":
			{
				a[i]*=4.5;
				break;
			}
			case "A0":
			{
				a[i]*=4.0;
				break;
			}
			case "B+":
			{
				a[i]*=3.5;
				break;
			}
			case "B0":
			{
				a[i]*=3.0;
				break;
			}
			case "C+":
			{
				a[i]*=2.5;
				break;
			}
			case "C0":
			{
				a[i]*=2;
				break;
			}
			case "D+":
			{
				a[i]*=1.5;
				break;
			}
			case "D0":
			{
				a[i]*=1;
				break;
			}
			case "F":
			{
				a[i]*=0;
				break;
			}
			case "P":
			{
				hap-=a[i];
				a[i]=0;
				break;
			}
			}
			cnt+=a[i];
		}
		System.out.println(cnt/hap);*/
	
	
	
	/*Scanner stdin=new Scanner(System.in);
	int n,a=0;
	int x=0,y=0;
	int arr[][]=new int[9][9];
	for(int i=0;i<9;++i)
	{
		for(int j=0;j<9;++j)
		{
			n=stdin.nextInt();
			arr[i][j]=n;
		}
	}
	for(int i=0;i<9;++i)
	{      
		for(int j=0;j<9;++j)             2차원 배열의 최댓값과 그 위치 구하기
		{
			if(arr[i][j]>a)
			{
				a=arr[i][j];
				x=i+1;
				y=j+1;
			}
			else if(arr[i][j]==a)
			{
				a=arr[i][j];
				x=i+1;
				y=j+1;
			}
		}
	}
	System.out.println(arr[x-1][y-1]);
	System.out.println(x+" "+y);*/
	
	
	/*Scanner stdin=new Scanner(System.in);
	int n=stdin.nextInt();
	int k=stdin.nextInt();
	int a[]=new int[n];
	int cnt=0,b=0;
	for(int i=0;i<n;++i)
	{
		a[i]=stdin.nextInt();          동전 개수 최적화
	}
	for(int j=n-1;j>=0;--j)
	{
		if(k-a[j] >= 0){
	        cnt += (k / a[j]);
	        System.out.println(a[j]+"원 동전 "+k/a[j]+"개 필요");
	        k -= a[j] * (k / a[j]);
	        
		 }
	}
	System.out.println(cnt);*/
	
	/*Scanner stdin=new Scanner(System.in);
	int n=stdin.nextInt();
	for(int i=1;i<=n;++i)
	{
		for(int j=2*n-1;j>=1;--j)
		{
			if(j>=n-i+1&&j<=n+i-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");           별찍기
			}
		}
		System.out.println();
	}
	for(int i=n;i>1;--i)
	{
		for(int j=2*n-1;j>=1;--j)
		{
			if(j>n-i+1&&j<n+i-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}*/
}
}