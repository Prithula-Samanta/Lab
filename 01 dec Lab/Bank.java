class Customer{    
int amount=500000;    
    
synchronized void withdraw(int amount){    
System.out.println("going to withdraw...");    
    
if(this.amount<amount){  
System.out.println("Less balance; waiting for deposit...");    
try{wait();}catch(Exception e){}    
}    
System.out.println("withdraw amount is :"+amount);
this.amount-=amount;    
System.out.println("After withdraw the account balance is :"+this.amount);

System.out.println("withdraw completed...");    
}    
    
synchronized void deposit(int amount){    
System.out.println("going to deposit..."); 
System.out.println("deposit amount is :"+amount);

this.amount+=amount;    
System.out.println("After deposit the account balance is :"+this.amount);
System.out.println("deposit completed... ");    
notify();    
}    
}    
    
class Bank{    
public static void main(String args[]){    
final Customer c=new Customer();    
new Thread(){    
public void run(){
    c.withdraw(35000);
    
}    
}.start();    
new Thread(){    
public void run(){c.deposit(30000);
    
}    
}.start();    
    
}}    
