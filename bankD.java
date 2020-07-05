 
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Character;
public class bankD {
    static bankaccount[] accts=new bankaccount[1];
    static int count=0; 
    static Scanner userInPut = new Scanner(System.in);
    static int select=-1;
       
       public static void main(String[] args){
          char selection;
          
           
          do{
             if(select!=-1){
             System.out.println("Account Number is: " +accts[select].accountN);
             System.out.println("Account Balance is: " +accts[select].balcance);
             System.out.println("we have : " + count + " accounts");
              }
             selection=menu(); 
             switch (selection) {
                case 'O':
                case 'o':    
                    int accountN;
                    int balcance;
                    boolean x;
                    do{
                        System.out.println("Please Enter your Account Number: ");
                        accountN=userInPut.nextInt();
                        x=deplicate(accountN);
                    }while(x);
                    do{
                       System.out.println("Please Enter your balance(should be more than 100.00): ");
                       balcance=userInPut.nextInt();  
                    }while(balcance<100);  
                    checkSizeOfArry();
                    accts[count]=new bankaccount(accountN,balcance);
                    select=count;
                    count++;
                    break;
                      
                case 'S':
                case 's':
                    select=-1;
                    int userSelect;
                    System.out.println("Please Enter the Account Number that you want to select: ");
                    userSelect=userInPut.nextInt();
                        for(int i=0;i<count;i++){
                            if(userSelect==accts[i].accountN)
                                select=i;
                            }
                   
                            
                    if(select==-1)
                        System.out.println("Account number was not found ! ");
                    break;
                case 'c':
                case 'C':
                    if(select==-1)
                    {   
                       System.out.println("You must select an account first to be deleted!"); 
                    }
                    else
                    {
                      accts[select]=accts[count-1];
                      accts[count-1]=null;
                      count--;
                    }
                select=-1;    
                break;
                
                case 'L':
                case 'l':
                    if(count==0)
                        System.out.println("Bank is Empty!");
                    else{    
                    for(int i=0;i<count;i++)
                    {
                       System.out.println("Account Number is: " +accts[i].accountN);
                       System.out.println("Account Balance is: " +accts[i].balcance);
                       System.out.println();
                    }
                    System.out.println("Total Bank assets : "+totalMoney());
                    
                   }
                break;  
                
                case 'd':
                case 'D':
                    if(select==-1)
                    {   
                       System.out.println("You must select an account first to Deposit !"); 
                    }
                    else
                    {   
                    accts[select].Deposit ();
                    }
                break;
                
                case 'w':
                case 'W':
                    if(select==-1)
                    {   
                       System.out.println("You must select an account first to withdrow!"); 
                    }
                    else
                    {   
                    accts[select].withdrow ();
                    }
                break;
                
                case 'q':
                case 'Q':
                     System.out.println("The program will shutdown! ");
                break;
             }
          }while(selection!='Q' && selection!='q');
       }
       
       public static void checkSizeOfArry() {
            
            if(count==accts.length){
                bankaccount[] temp= Arrays.copyOf(accts, accts.length+1);
                //bankaccount[] temp=new bankaccount[count*2];
                accts = temp;
            }
        
        }

       
       
       public static boolean deplicate(int accountN) {
        boolean deplicate=false;
           if(accts.length!=0)
          {
                for(int i=0;i<count;i++)
                {
                     if(accountN==accts[i].accountN)
                 { 
                         deplicate=true;
                         System.out.println("please select other account number!");  
                 }        
                }  
          }
             
          
           System.out.println("deplicate: "+deplicate);     
        return deplicate;   
       }
       public static char menu(){
           char selection;
           boolean notValid;
          do {
             notValid = false; 
             System.out.println("Please Select one of these options: ");
             System.out.println("O: Open account ");
             System.out.println("D: Deposit ");
             System.out.println("S: Select account ");
             System.out.println("C: Close account ");
             System.out.println("W: Withdraw ");
             System.out.println("L: List all accounts ");
             System.out.println("Q: Quit ");
             selection=userInPut.next().charAt(0);
             if(selection!='o'||selection!='O' || selection!='D' ||selection!='d' || selection!='s' || selection!='S' || selection!='C' ||selection!='c' || selection!='W'||selection!='w'
             ||selection!='l'||selection!='L'||selection!='q'||selection!='Q')
                notValid=true;
             
          }while(!notValid);
          
          return (selection);
          
       }
       
       public static int totalMoney(){
        int totalBankAmt=0;
        for(int i=0;i<count;i++){
            totalBankAmt+=accts[i].balcance;
        }return totalBankAmt;
       
    }
}


 

class bankaccount {
    int accountN;
    int balcance;
    static Scanner userInPut = new Scanner(System.in);
    public bankaccount(int accountN, int balcance) {
        this.accountN=accountN;
        this.balcance=balcance;
    }

    public void Deposit (){
        int amt;
        System.out.println("Enter the amount to deposit: ");
        amt=userInPut.nextInt();
        this.balcance+=amt;
        
    }
    
     public void withdrow (){
        int amt;
        System.out.println("Enter the amount to withdrow: ");
        amt=userInPut.nextInt();
        this.balcance-=amt;
        
    }
    
    
}








