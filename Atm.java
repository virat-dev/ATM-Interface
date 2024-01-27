import java.util.*;
public class Atm {
    public static void main(String[] args) {
        ATMop obj=new ATMop();
    }
    
}


class Data{
    float balance;
}
class ATMop{
    //float balance;
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Data> map=new HashMap<>();


    ATMop(){
        
        System.out.println("******************************************************************");
        System.out.println("Welcome to our ATM");
        op();
    }


public void op(){
    System.out.println("******************************************************************");
    System.out.println("Enter Your PinCode");
    int pinCode=sc.nextInt();


    if(map.containsKey(pinCode)){
        Data obj=map.get(pinCode);
        menu(obj);
    }
    else{
        System.out.println("******************************************************************");
        System.out.println("Please create your Account first");
        System.out.println("set your pin");
        int pin=sc.nextInt();
        Data obj=new Data();
        map.put(pin ,obj);
        menu(obj);
    }

}




public void menu(Data obj){
    Scanner sc=new Scanner(System.in);
    System.out.println("******************************************************************");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdral Money");
    System.out.println("4. Check For Another Account");
    System.out.println("5. exit");
    System.out.println("******************************************************************");
    
    int x=sc.nextInt();

    if(x==1){
        checkBalance(obj);
    }
    else if(x==2){
        deposit(obj);
    }
    else if(x==3){
        Withdrawal(obj);
        
    }
    else if(x==4){
        op();
    }
    else if(x==5){
        System.out.println("Thankyou for Using me");
        System.out.println("******************************************************************");
        
    }
    else{
        System.out.println("******************************************************************");
        System.out.println("Please Enter valid Number");
        menu(obj);
    }

}
public void checkBalance(Data obj){
    System.out.println("Your balance :- "+obj.balance);
    menu(obj);
    System.out.println("******************************************************************");
}
public void deposit(Data obj) {
    System.out.println("******************************************************************");
    System.out.println("Enter Your Amount for deposit");
    float amt=sc.nextFloat();

    obj.balance+=amt;

    System.out.println("Amount Deposited Successfully");
    
    menu(obj);
    
} 
public void Withdrawal(Data obj){
    System.out.println("******************************************************************");
    System.out.println("Enter Amount for withdrawal");
    float amt=sc.nextFloat();
    if(amt<=obj.balance){
        obj.balance=obj.balance-amt;
        System.out.println("Amount Withdrawal Successfully");
    }
    else{
        System.out.println("Insufficient Balance");
        
        
    }
    menu(obj);
}
}

