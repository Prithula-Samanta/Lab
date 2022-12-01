//class Test24{
//    static char x,y;
//
//    public static void main(String[] args) {
//        int sum = x+y;
//        System.out.println(x+y);
//    }
//}
//
//class Test32 implements Runnable{
//    public void start(){
//        System.out.println("Executing Start method");
//    }
//}


//import java.io.FileInputStream;
//
//class FileIntoByteArray{
//    public static void main(String[] args) {
//        try {
//            FileInputStream fin = new FileInputStream("D:\\test1.txt");
//            byte arr[]=new byte[1024];
//            int i=0;
//            while ((i=fin.read())>0){
//                System.out.println((char)i);
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}

//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//
//class ReadFirstThreeLine{
//    public static void main(String[] args) {
//        String i="";
//
//        try {
//           BufferedReader b=new BufferedReader("D:\\test1.txt");
//            while (((i = b.readLine()) != null) && b.getLineNumber() <= 3){
//            }
//            b.close();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}


//class InterThreadDemo
//{
//    public static void main(String arg[])
//    {
//        final Customer c = new Customer();
//        new Thread()
//        {
//            public void run()
//            {
//                c.withdraw(15000);
//            }
//        }.start();
//        new Thread()
//        {
//            public void run()
//            {
//                c.deposit(10000);
//            }
//        }.start();
//        new Thread()
//        {
//            public void run()
//            {
//                c.deposit(10000);
//            }
//        }.start();
//    }
//}
//
//class Customer
//{
//    int amount = 10000;
//
//    synchronized void withdraw(int amount)
//    {
//        System.out.println("Available Balance " + this.amount);
//        System.out.println("Going to withdraw." + amount);
//
//        if (this.amount < amount)
//        {
//            System.out.println("Insufficient Balance waiting for deposit.");
//            try
//            {
//                wait();
//            } catch (Exception e)
//            {
//                System.out.println("Interruption Occured");
//            }
//        }
//        this.amount -= amount;
//        System.out.println("Detected amaount: " + amount);
//        System.out.println("Balance amount : " + this.amount);
//    }
//
//    synchronized void deposit(int amount)
//    {
//        System.out.println("Going to deposit " + amount);
//        this.amount += amount;
//        System.out.println("Available Balance " + this.amount);
//        System.out.println("Transaction completed.\n");
//        notify();
//    }
//}

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
///// write byte from string
// class FileOutputStreamExample {
//    public static void main(String[] args) {
//int n=0;
//switch (1) {
//    case 1:
//    try {
//        FileOutputStream f = new FileOutputStream("D:\\test1.txt");
//        String str = "Welcome to Anudip Foundation";
//        byte b[] = str.getBytes(); // converting string into byte array
//        f.write(b);
//        f.close();
//        System.out.println("Welcome to Anudip Foundation");
//    } catch (Exception e) {
//        System.out.println(e);
//    }
//    break;
//    case 2:
//        try {
//            // Write Byte to string
//            FileInputStream f = new FileInputStream("D:\\test1.txt"); //destination
//            int i=0;
//            while((i=f.read())!=-1) {
//                System.out.print((char)i);
//
//            }
//            f.close();
//        }
//        catch(Exception e) {
//            System.out.println(e);
//        }
//        break;
//    default:
//        System.out.println("Wrong Input");
//}
//    }
//}



//
//class A{
//    int balance=5000;
//    boolean valueSet=false;
//    public synchronized void put(int Add) {
//        while (valueSet) {
//            try {
//                wait();
//            }
//            catch(Exception e) {
//
//            }
//        }
//        balance=balance+Add;
//        System.out.println("After deposit the account balance "+balance);
//        valueSet=true;
//        notify();
//
//    }
//    public synchronized void get(int get) {
//        while (!valueSet) {
//            try {
//                wait();
//            }
//            catch(Exception e) {
//
//            }
//        }
//        if(balance>0) {
//            balance = balance - get;
//            System.out.println("After withdraw the account balance " + balance);
//            valueSet = true;
//            notify();
//        }
//        else {
//            System.out.println(" Sorry insufficient balance we can't withdraw the money");
//            Thread.interrupted();
//            notify();
//        }
//    }
//}
//class Producer implements Runnable{
//    A a;
//    Producer(A a){
//        this.a=a;
//        Thread t1 = new Thread(this,"Produceer");
//        t1.start();
//    }
//    @Override
//    public void run() {
//        // TODO Auto-generated method stub
//        int i=0;
//        while(true) {
//            a.put(3000);
//            try {
//                Thread.sleep(1000);
//            }
//            catch(Exception e) {
//
//            }
//        }
//    }
//}
//
//class Cousumer implements Runnable{
//    A a;
//    Cousumer(A a){
//        this.a=a;
//        Thread t1 = new Thread(this,"Cousumer");
//        t1.start();
//    }
//    @Override
//    public void run() {
//        // TODO Auto-generated method stub
//        int i=0;
//        while(true) {
//            a.get(1000);
//            try {
//                Thread.sleep(1000);
//            }
//            catch(Exception e) {
//
//            }
//        }
//    }
//}
// class MainInnerThreadComminucation {
//    public static void main(String[] args) {
//        A a = new A();
//        new Producer(a);
//        new Cousumer(a);
//    }
//}







