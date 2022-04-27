import java.util.Scanner;

public class Person{
    protected String ten,gioitinh,quequan;
    protected int ngaysinh;
    Scanner sc=new Scanner(System.in);

    public Person(){
        ten=gioitinh=quequan=" ";
        ngaysinh=0;
    }
    
    public void Nhap(){
        System.out.print("Nhap ten : ");
        ten=sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaysinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioitinh=sc.nextLine();
        System.out.print("Nhap que quan: ");
        quequan=sc.nextLine();
}

public void inthongtin(){
    System.out.println("\n Ten : "+ten);
    System.out.printf("Ngay sinh : %d ",ngaysinh);
    System.out.println("\nGioi tinh : "+gioitinh);
    System.out.println("Que quan: "+quequan);
}

public static void main (String[] args){
    Person n1=new Person();
    n1.Nhap();
    n1.inthongtin();
}

}