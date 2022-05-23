package quanlysach;

public class Sach {

    private String ten;
    private String tacGia;
    private int theLoai;
    private int namIn;

    public Sach() {
    }

    public Sach(String ten, String tacGia, int theLoai, int namIn) {
        this.ten = ten;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namIn = namIn;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(int theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamIn() {
        return namIn;
    }

    public void setNamIn(int namIn) {
        this.namIn = namIn;
    }

}
