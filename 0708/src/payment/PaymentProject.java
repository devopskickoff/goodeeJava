package payment;
import java.util.Scanner;

//�ѻ�� �з�
class Payment
{
   String name;
   int per_pay;
   int work_time;
   int pay;
   
   //����Ʈ ������ - �ٸ������ڸ� ���鶧 �̰� �ȸ�����ָ� �⺻ ��ü ������ ���Ѵ� 
   public Payment()   // Payment p1 = new Payment();
   {
      name="ȫ�浿";
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
   //������ - public  �����̾�� ��ü ������ �����ϴ� 
   public PaymentManager()
   {
      System.out.println("������ ȣ��");
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
         System.out.print("�̸� : ");
         String name=sc.next();
         System.out.print("�ð���޿� : ");
         int per_pay = sc.nextInt();
         System.out.print("�ٹ��ð� : ");
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



