import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String title;
    private String address;
    private int salary;

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Nhập ID nhân viên: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.print("Nhập chức vụ: ");
        title = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập lương của nhân viên: ");
        salary = sc.nextInt();

        // setId(this.id);
        // setName(this.name);
        // setTitle(this.title);
        // setAddress(this.address);
        // setSalary(this.salary);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: "+getId()+"\t Tên NV: "+getName()+"\t Chức vụ: "+getTitle()+"\t Địa chỉ: "+getAddress()+"\t Lương NV: "+getSalary();
    }

    public void display() {
        System.out.println("ID: "+getId()+"\t Tên NV: "+getName()+"\t Chức vụ: "+getTitle()+"\t Địa chỉ: "+getAddress()+"\t Lương NV: "+getSalary());
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee() {
    }

    
}
