import java.util.Scanner;

public class DoAn extends Sach implements InKho {
    private int soTrang;
    private String tinhTrang;
    private int namBaoVe;
    
    public DoAn(int maSach, String tenSach, String nXB, int namXuatBan, int soLuong, int soTrang, String tinhTrang,
            int namBaoVe) {
        super(maSach, tenSach, nXB, namXuatBan, soLuong);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
    }

    public DoAn() {
    }
    
    Scanner sc = new Scanner(System.in);

    @Override
    public String viTri() {
        String viTri = sc.nextLine();
        return viTri;
    }
    @Override
    public void input() {
        
        super.input();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tình trạng: ");
        tinhTrang = sc.nextLine();
        System.out.print("Nhập năm bảo vệ: ");
        namBaoVe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vị trí: ");
        viTri();

        setSoTrang(this.soTrang);
        setTinhTrang(this.tinhTrang);
        setNamBaoVe(this.namBaoVe);
    }
    @Override
    public String toString() {
        
        return super.toString()+ "\tSố trang: "+getSoTrang()+"\t Tình trạng: "+getTinhTrang()+"\n Năm bảo vệ: "+getNamBaoVe()+"\n Vị trí: "+viTri();
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getNamBaoVe() {
        return namBaoVe;
    }

    public void setNamBaoVe(int namBaoVe) {
        this.namBaoVe = namBaoVe;
    }


    

    
}
