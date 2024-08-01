package module;

public class Bao {
private int idBao;
private String NhaXuatBanBao;
private int SoLuongBao;
private String NgayPhatHanh;
private static int NewIdBao = 1;

    public Bao( String nhaXuatBanBao, int soLuongBao, String ngayPhatHanh) {
        this.idBao = NewIdBao;
        NhaXuatBanBao = nhaXuatBanBao;
        SoLuongBao = soLuongBao;
        NgayPhatHanh = ngayPhatHanh;
        NewIdBao++;
    }

    public Bao(int idBao, String nhaXuatBanBao, int soLuongBao, String ngayPhatHanh) {
        this.idBao = idBao;
        NhaXuatBanBao = nhaXuatBanBao;
        SoLuongBao = soLuongBao;
        NgayPhatHanh = ngayPhatHanh;
    }

    public int getIdBao() {
        return idBao;
    }

    public void setIdBao(int idBao) {
        this.idBao = idBao;
    }

    public String getNhaXuatBanBao() {
        return NhaXuatBanBao;
    }

    public void setNhaXuatBanBao(String nhaXuatBanBao) {
        NhaXuatBanBao = nhaXuatBanBao;
    }

    public int getSoLuongBao() {
        return SoLuongBao;
    }

    public void setSoLuongBao(int soLuongBao) {
        SoLuongBao = soLuongBao;
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;
    }

    public static int getNewIdBao() {
        return NewIdBao;
    }

    public static void setNewIdBao(int newIdBao) {
        NewIdBao = newIdBao;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "idBao=" + idBao +
                ", || Nha Xuat Ban Bao='" + NhaXuatBanBao + '\'' +
                ", || So Luong Bao=" + SoLuongBao +
                ", || Ngay Phat Hanh='" + NgayPhatHanh + '\'' +
                '}';
    }
}
