import java.util.*;
class BankAccount{
     String name;
     long account_no;
     long phone_no;
     String address;
     String i_fsc;
     double balance;
     String email;

   Scanner sc=new Scanner(System.in);

     {
          balance=500;// fixed amount in your account
     }
    
     public BankAccount(String name, long account_no, long phone_no, String address, String i_fsc,
               String email){
          this.name = name;
          this.account_no = account_no;
          this.phone_no = phone_no;
          this.address = address;
          this.i_fsc = i_fsc;
           this.email = email;
      }


     void balanceEnquiry(){
           System.out.println("your balance is:"+ balance);
     }
     void deposit(){
          System.out.println(" Enter the amount deposit");
          double dAmt=sc.nextDouble();
          balance=balance+dAmt;
          System.out.println("successful deposit"+balance);
     }
     void withdraw(){
         System.out.println("Enter the amount you want to withdraw");
          double wAmt=sc.nextDouble();
          if(balance-wAmt>500)
          {
               balance=balance-wAmt;
               System.out.println("withdraw success"+wAmt);
               System.out.println("balance is"+balance);
          }
          else{
               System.out.println(" invalided amount ");
           }
          }
}

public class mainClass {
     public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);//Scanner use for gating detail through a keyword
           System.out.println("back account registration details ");
           System.out.println("Enter name ");
           String name=sc.next();
           System.out.println("Enter your account number  ");
           long account_no=sc.nextLong();
           System.out.println("Enter your phone number ");
           long  phone_no=sc.nextLong();
           System.out.println("Enter your address");
           String address=sc.next();
           System.out.println("Enter your email id");
           String email=sc.next();
           System.out.println(" Enter your i.f.s.c code");
           String i_fsc = sc.next();
 
 BankAccount p1=new BankAccount(name, account_no, phone_no, address, i_fsc, email) ;         
           p1.balanceEnquiry();
           p1.deposit();
           p1.balanceEnquiry();
           p1.withdraw();

   
     }

     
}