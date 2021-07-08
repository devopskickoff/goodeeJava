package payment;
import java.util.Scanner;

//한사람 분량
class Payment
{
   String name;
   int per_pay;
   int work_time;
   int pay;
   
   //디폴트 생성자 - 다른생성자를 만들때 이걸 안만들어주면 기본 객체 생성을 못한다 
   public Payment()   // Payment p1 = new Payment();
   {
      name="홍길동";
      per_pay = 10000;
      work_time = 40;
      calculate();
   }
   
   public Payment(String n, int pp, int wt) //Payment p2=new Payement("A", 20, 30000)
   {
      name = n;
      per_pay = pp;
      work_time = wt;
      calculate();
   }
   
   void setValue(String n, int pp, int wt)
   {
      name = n;
      per_pay = pp;
      work_time = wt;
      calculate();
   }
   
   void calculate()
   {
      pay = per_pay * work_time;
   }
   
   void output()
   {
      System.out.printf("%s %d %d %d\n", name, per_pay, work_time, pay);
   }
}


class PaymentManager
{
   final int MAX=3;
   Payment list[] = new Payment[MAX];
   //생성자 - public  권한이어야 객체 생성이 가능하다 
   public PaymentManager()
   {
      System.out.println("생성자 호출");
      init();
   }
   
   void init()
   {
      for(int i=0; i<list.length; i++)
      {
         list[i] = new Payment();
      }
   }
   
   void append()
   {
      Scanner sc = new Scanner(System.in);
      for(int i=0; i<MAX; i++)
      {
         System.out.print("이름 : ");
         String name=sc.next();
         System.out.print("시간당급여 : ");
         int per_pay = sc.nextInt();
         System.out.print("근무시간 : ");
         int work_time = sc.nextInt();
         
         list[i].setValue(name, per_pay, work_time);
      }
   }
   
   void output()
   {
      for(int i=0; i<list.length; i++)
      {
         list[i].output();
      }
   }
}

public class PaymentProject {
   public static void main(String[] args) {
      PaymentManager pm = new PaymentManager();
      //pm.init();
//      pm.append();
//      pm.output();
      
      Payment p1=new Payment();
      Payment p2=new Payment("A", 20, 30000);
      
      p1.output();
      p2.output();
   }
}



