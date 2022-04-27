import java.util.Scanner;
import java.util.ArrayList;

public class Thisinh{
    protected String Ten;
    protected float toan,van,anh,tong;
    Scanner sc=new Scanner(System.in);
    public Thisinh(){
        Ten=" ";
        toan=van=anh=tong=0;
    }
    public void Nhap(){
        System.out.print("Nhap ten thi sinh: ");
        Ten=sc.nextLine();
        System.out.print("Nhap diem Toan: ");
        toan=sc.nextFloat();
        System.out.print("Nhap diem Van: ");
        van=sc.nextFloat();
        System.out.print("Nhap diem Ngoai Ngu: ");
        anh=sc.nextFloat();
    }
    public void intt(){
        System.out.printf("Ten thi sinh: %s ",Ten);
        System.out.printf("\nDiem mon Toan: %f ",toan);
        System.out.printf("\nDiem mon Van: %f ",van);
        System.out.printf("\nDiem mon Ngoai Ngu: %f ",anh);
        System.out.println("\nTong diem cua 3 mon : "+(toan+van+anh));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        Thisinh thisinh;
        ArrayList<Thisinh> arrThisinh =new ArrayList<>();
        System.out.print("Nhap so luong thi sinh: ");
        n=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            thisinh = new Thisinh();
            System.out.println("Nhap thong tin thi sinh thu " + (i+1) + ": ");
            thisinh.Nhap();
            arrThisinh.add(thisinh);
        }

        for (int i = 0; i < arrThisinh.size(); i++) {
            System.out.println("\nThong tin thi sinh thu " + (i+1) + ": ");
            arrThisinh.get(i).intt();
        }
    }


}