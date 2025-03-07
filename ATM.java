import java.util.*;
class Calcy
{
    int a[]={100123,100234,100345};
    String b[]={"Lokesh Nahar","Ramjee Rai","Dipak Mourya"};
    int c[]={1002,3002,4005};
    int d[]={20000,5000,8000};

    public void st(int p)
    {
        int i,t=2;
        for(i=0;i<3;i++)
        {
            if(p==a[i])
            {
                chkid(i,t);
            }
        }
        System.out.println("This account number does not exist!!!!");
        men1();
    }

    public void menu(int k)
    {
        Scanner sc=new Scanner(System.in);
        int x,l,m;
        do
        {
            System.out.println("\n*************Services*************");
            System.out.println("1. Check Balance.");
            System.out.println("2. Withdraw Cash.");
            System.out.println("3. Deposit Cash.");
            System.out.println("4. Exit.");
            System.out.println("Enter your Choice : ");
            x=sc.nextInt();
            switch(x)
            {
                case 1 : 

                    System.out.println("\nName : " + b[k]);
                    System.out.println("Account Number : " + a[k]);
                    System.out.println("Available Balance : " + d[k]);
                    break;
                
                case 2 : 

                    System.out.println("\nAvailable Balance : " + d[k]);
                    System.out.println("Enter the Amount to be withdrawn : ");
                    l=sc.nextInt();
                    System.out.println("Amount Withdrawn Successfully!!!");
                    update_w(d,l,k);
                    break;

                case 3 : 

                    System.out.println("\nAvailable Balance : " + d[k]);
                    System.out.println("Enter the Amount you want to deposit : ");
                    m=sc.nextInt();
                    System.out.println("Amount Deposited Successfully!!!");
                    update_d(d,m,k);
                    break;

                case 4 :

                    System.exit(0);
                
                default :

                    System.out.println("\nWrong Choice!!!!");
            }
        }while(true);
    }

    public void men1()
    {
        Scanner sc=new Scanner(System.in);
        int r,y;
        do
        {
            System.out.println("\n************Options*************");
            System.out.println("1. Re-Enter Account Number : ");
            System.out.println("2. Exit.");
            System.out.println("Enter your Choice : ");
            y=sc.nextInt();
            switch(y)
            {
                case 1 : 

                    System.out.println("\nEnter your Account Number : ");
                    r=sc.nextInt();
                    st(r);
                    
                case 2 :

                    System.out.println("\nThe Session has been terminated Successfully!!!");
                    System.exit(0);
                
                default :

                    System.out.println("\nWrong Choice!!!!");
            }
        }while(true);
    }

    public void chkid(int i,int t)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Pin number : ");
        int q=sc.nextInt();
        if(q==c[i])
        {
            System.out.println("\n--->Welcome Mr. " + b[i] + "\n--->What will you like to do : ");
            menu(i);
        }
        else
        {
            System.out.println("\nWrong Pin Entered!!!");
            if(t>0)
            {
                --t;
                chkid(i,t);
            }
            else
            {
                System.out.println("\nYour Account has been Blocked!!!\nPlease contact your Branch Manager.");
                System.exit(0);
            }
        }
    }

    public void update_w(int d[],int l,int k)
    {
        d[k]=d[k]-l;
    }

    public void update_d(int d[],int m,int k)
    {
        d[k]=d[k]+m;
    }
}

class ATM 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int p;
        Calcy ob=new Calcy();
        System.out.print("Enter your Account Number : ");
        p=sc.nextInt();
        ob.st(p);
    }
}
