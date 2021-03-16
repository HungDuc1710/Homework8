import java.util.Scanner;

public class Sachgiaokhoa extends Sach implements InMuon, InKho {

    private int soTrang;
    private String tinhTrang;
    private int soLuongMuon;

    Scanner sc = new Scanner(System.in);
    
     public Sachgiaokhoa(int maSach, String tenSach, String nXB, int namXuatBan, int soLuong, int soTrang,
            String tinhTrang, int soLuongMuon, Scanner sc) {
        super(maSach, tenSach, nXB, namXuatBan, soLuong);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
        this.sc = sc;
    }

    public Sachgiaokhoa() {
    }
    
    @Override
    public int tonKho() {
        
        return getSoLuong() - getSoLuongMuon() ;
    }

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
        System.out.print("Nhập số lượng mượn: ");
        soLuongMuon = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vị trí: ");
        viTri();

        setSoTrang(this.soTrang);
        setTinhTrang(this.tinhTrang);
        setSoLuongMuon(this.soLuongMuon);
        
    }

    @Override
    public String toString() {
        
        return super.toString() + "\tSố trang: "+getSoTrang()+"\t Tình trạng: "+getTinhTrang()+"\t Số lượng mượn: "+getSoLuongMuon()+"\n Vị trí: "+viTri()+"\n Số lượng tồn kho: "+tonKho();
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

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

   
    
}
