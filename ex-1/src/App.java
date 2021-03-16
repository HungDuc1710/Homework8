import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng Nhân viên muốn nhập dữ liệu: ");
        int n = sc.nextInt();
        ArrayList<Employee> info = new ArrayList<Employee>();

        //Thêm và in thông tin nhân viên vào dãy
        for (int i = 0; i < n; i++) {
            Employee em = new Employee();
            System.out.println("Nhập thông tin nhân viên thứ "+(i+1)+": ");
            em.input();
            info.add(em);
        }
        for (Employee em : info) {
            System.out.println("Thông tin nhân viên: ");
            // System.out.println(em.toString()); phương thức nào dùng để in cũng được
            em.display();
        }
       
        //Viết câu lệnh chèn 1 nhân viên vào vị trí position nhập vào từ bàn phím
        System.out.println("Chèn thông tin nhân viên \n--------------------");
        System.out.print("Nhập vị trí muốn chèn: ");
        int viTri = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < 1; i++) {
            Employee em = new Employee();
            System.out.println("Chèn thông tin nhân viên: ");
            em.input();
            info.add((viTri)-1,em);
        }
        for (Employee em : info) {
            System.out.println("Thông tin nhân viên: ");
            em.display();
        }
        
        
        //Viết câu lệnh xóa thông tin nhân viên theo tên và mã nhân viên
        int count = 0;
        System.out.println("--------------------\nXóa thông tin NV theo tên và mã nhân viên: ");
        System.out.print("Nhập tên nhân viên muốn xóa thông tin: ");
        String removeName = sc.nextLine();
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals(removeName)) {
                count++;
            }
         
            if (count > 1) {
                 System.out.print("Nhập mã nhân viên: ");
                int removeId = sc.nextInt();

            if (info.get(i).getId() == removeId) {
                 info.remove(i);
         }

     } else {
         info.remove(i);
            }
        }
        
        
            
        for (Employee em : info) {
            System.out.println("Thông tin sau khi xóa là: ");
            em.display();
        }

        //Viết câu lệnh sửa tên nhân viên
        System.out.println("Nhập vị trí thông tin nhân viên bạn muốn sửa tên: ");
        int nameChange = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên mới: ");
        String newName = sc.nextLine();

        info.get(nameChange-1).setName(newName);
        
        for (Employee em : info) {
            em.display();
        }

        //Tạo file NhanVien.txt và lưu toàn bộ thông tin nhân viên vào file đó
        File myfile = new File("C:\\Users\\HP\\Desktop\\Techmaster\\ex-1\\src\\NhanVien.txt");
        FileWriter fileWriter = new FileWriter(myfile);
        
        fileWriter.write(info.toString());
        fileWriter.close();
        }
    }

        
    

