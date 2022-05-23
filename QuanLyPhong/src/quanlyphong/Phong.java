package quanlyphong;

/**
 *
 * @author Vũ Nguyên Hướng
 */
public class Phong {

    private String soPhong;
    private String diaChi;
    private String nguoiThue;
    private int tinhTrang;
    private int soNguoi;

    public Phong() {
    }

    public Phong(String soPhong, String diaChi, String nguoiThue, int tinhTrang, int soNguoi) {
        this.soPhong = soPhong;
        this.diaChi = diaChi;
        this.nguoiThue = nguoiThue;
        this.tinhTrang = tinhTrang;
        this.soNguoi = soNguoi;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNguoiThue() {
        return nguoiThue;
    }

    public void setNguoiThue(String nguoiThue) {
        this.nguoiThue = nguoiThue;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

}
