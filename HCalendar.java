import java.util.Scanner;
public class HCalendar{
   public static void main(String[]args){
      CalendarBean date=new CalendarBean();
      Scanner sc=new Scanner(System.in);
      System.out.print("��������ݣ�");
      int year=sc.nextInt();
      System.out.print("�������·ݣ�");
      int month=sc.nextInt();
      date.setDate(year,month);
      System.out.print("��ѡ�������(0)��ʼ�����һ(1)��ʼ��");
      int j=2;
      while(j!=1&&j!=0){
         j=sc.nextInt();
         if(j==0){
            String calendar[]=date.getCalendar();
            char a[]="��һ����������".toCharArray();
            for(char i:a)System.out.printf("%3c",i);
            for(int i=0;i<calendar.length;i++){
               if(i%7==0)System.out.printf("\n");
               System.out.printf("%4s",calendar[i]);
            }
         }else if(j==1){
            String calendar[]=date.getCalendar2();
            char a[]="һ������������".toCharArray();
            for(char i:a)System.out.printf("%3c",i);
            System.out.printf("\n");
            for(int i=0;i<calendar.length;i++){
               System.out.printf("%4s",calendar[i]);
               if((i+1)%7==0)System.out.printf("\n");
            }
         }else System.out.print("���������룺\n��ѡ�������(0)��ʼ�����һ(1)��ʼ��");
      }
   }
}