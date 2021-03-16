import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách muốn nhập: ");
        int n = sc.nextInt();
        
        ArrayList<Sach> book = new ArrayList<Sach>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Chọn loại sách để nhập: 1-SGK 2-Đồ án 3-Ebook");
            switch (sc.nextInt()) {
            case 1:
                Sachgiaokhoa sgk = new Sachgiaokhoa();
                sgk.input();
                book.add(sgk);
                break;

            case 2:
                DoAn doan = new DoAn();
                doan.input();
                book.add(doan);
                break;
            case 3:
                Ebook ebook = new Ebook();
                ebook.input();
                book.add(ebook);
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ.");
                System.out.println("Chương trình kết thúc");
                System.exit(0);
            }
        }
        System.out.print("Danh sách tài liệu vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(book.get(i).toString());
        }

        File sachGiaoKhoa = new File("C:\\Users\\HP\\Desktop\\Techmaster\\sachgiaokhoa.txt");
        File doan = new File("C:\\Users\\HP\\Desktop\\Techmaster\\DoAn.txt");
        File ebook = new File("C:\\Users\\HP\\Desktop\\Techmaster\\ebook.txt");

        sachGiaoKhoa.createNewFile();
        doan.createNewFile();
        ebook.createNewFile();

        FileWriter myPen1 = new FileWriter(sachGiaoKhoa);
        FileWriter myPen2 = new FileWriter(doan);
        FileWriter myPen3 = new FileWriter(ebook);

        for (int i = 0; i < book.size(); i++) {
            if (book.get(i) instanceof Sachgiaokhoa) {
                myPen1.write(book.get(i).toString() + "\n");
            } else if (book.get(i) instanceof DoAn) {
                myPen2.write(book.get(i).toString() + "\n");
            } else if (book.get(i) instanceof Ebook) {
                myPen3.write(book.get(i).toString() + "\n");
            }
        }
        sc.close();
        myPen1.close();
        myPen2.close();
        myPen3.close();

        Scanner myReader1 = new Scanner(sachGiaoKhoa);
        Scanner myReader2 = new Scanner(doan);
        Scanner myReader3 = new Scanner(ebook);

        System.out.println("Sách giáo khoa: ");
        while (myReader1.hasNext()) {
           System.out.println(myReader1.nextLine()); 
        }

        System.out.println("Sách Đồ Án: ");
        while (myReader2.hasNext()) {
            System.out.println(myReader2.nextLine());
        }
        
        System.out.println("Sách Ebook: ");
        while (myReader3.hasNext()) {
            System.out.println(myReader3.nextLine());
        }
        
        myReader1.close();
        myReader2.close();
        myReader3.close();
        
        // int slSgk = sc.nextInt();
        // Sach sgk[] = new Sach[slSgk];

        // for (int i = 0; i < slSgk; i++) {
        //     sgk[i] = new Sachgiaokhoa();
        //     sgk[i].input();
        //     System.out.println(sgk[i].toString()); 
        // }
        
        // System.out.println("\nNhập số lượng đồ án muốn nhập: ");
        // int slDoAn = sc.nextInt();
        // Sach doan[] = new Sach[slDoAn];

        // for (int i = 0; i < slDoAn; i++) {
        //     doan[i] = new DoAn();
        //     doan[i].input();
        //     System.out.println(doan[i].toString());
        // }

        // System.out.println("\nNhập số lượng tài liệu điện tử muốn nhập: ");
        // int slEbook = sc.nextInt();
        // Sach ebook[] = new Sach[slEbook];

        // for (int i = 0; i < slEbook; i++) {
        //     ebook[i] = new Ebook();
        //     ebook[i].input();
        //     System.out.println(ebook[i].toString());
        // }
        // sc.close();
        
    }

   
}
