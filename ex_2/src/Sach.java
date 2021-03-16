import java.util.Scanner;

public class Sach {
    private int maSach;
    private String tenSach;
    private String NXB;
    private int namXuatBan;
    private int soLuong;

    public void input() {
        Scanner sc = new Scanner(System.in);
        //Thêm chức năng chọn loại sách muốn nhập
        
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.print("Nhập tên NXB: ");
        NXB = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        namXuatBan = sc.nextInt();
        System.out.println("Nhập số lượng :");
        soLuong = sc.nextInt();
        
        setMaSach(this.maSach);
        setTenSach(this.tenSach);
        setNXB(this.NXB);
        setNamXuatBan(this.namXuatBan);
        setSoLuong(this.soLuong);

        
    };

    public String toString() {
        return "\nMã sách: " + getMaSach() + " \t Tên sách: " + getTenSach() + "\t Tên NXB: " + getNXB()
                + "\t Năm xuất bản: " + getNamXuatBan() + "\t Số lượng: " + getSoLuong();
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String nXB) {
        NXB = nXB;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String nXB, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.NXB = nXB;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    };
}