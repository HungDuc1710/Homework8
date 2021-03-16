import java.util.Scanner;

public class Ebook extends Sach implements InDownload {

    private int dungLuong;

    private int luotTai;
    
    private int giaThanh;

    Scanner sc = new Scanner(System.in);
    
    @Override
    public int tongTien() {

        return getLuotTai() * getGiaThanh();
    }
    
    @Override
    public void input() {
     
        super.input();
        System.out.print("Nhập dung lượng: ");
        dungLuong = sc.nextInt();
        System.out.print("Nhập lượt tải: ");
        luotTai = sc.nextInt();
        System.out.print("Nhập giá thành: ");
        giaThanh = sc.nextInt();

        setDungLuong(this.dungLuong);
        setLuotTai(this.luotTai);
        setGiaThanh(this.giaThanh);
    }

    @Override
    public String toString() {
        
        return super.toString()+"\t Dung lượng: "+getDungLuong()+"\t Lượt tải: "+getLuotTai()+"\t Giá thành: "+getGiaThanh()+"\n Tổng tiền: "+tongTien();
    }

    public int getDungLuong() {
        return dungLuong;
    }


    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }


    public int getLuotTai() {
        return luotTai;
    }


    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }


    public int getGiaThanh() {
        return giaThanh;
    }


    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }
    
}
