package module;

public class Sach {
    private int idSach;
    private String nhaXuatBanSach;
    private String nameSach;
    private int soluongSach;
    private static int newIdSach = 1;

    public Sach(String nhaXuatBanSach, String nameSach, int soluongSach) {
        this.idSach = newIdSach++;
        this.nhaXuatBanSach = nhaXuatBanSach;
        this.nameSach = nameSach;
        this.soluongSach = soluongSach;
    }

    public Sach(int idSach, String nhaXuatBanSach, String nameSach, int soluongSach) {
        this.idSach = idSach;
        this.nhaXuatBanSach = nhaXuatBanSach;
        this.nameSach = nameSach;
        this.soluongSach = soluongSach;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getNhaXuatBanSach() {
        return nhaXuatBanSach;
    }

    public void setNhaXuatBanSach(String nhaXuatBanSach) {
        this.nhaXuatBanSach = nhaXuatBanSach;
    }

    public String getNameSach() {
        return nameSach;
    }

    public void setNameSach(String nameSach) {
        this.nameSach = nameSach;
    }

    public int getSoluongSach() {
        return soluongSach;
    }

    public void setSoluongSach(int soluongSach) {
        this.soluongSach = soluongSach;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id=" + idSach +
                ", nhaXuatBan='" + nhaXuatBanSach + '\'' +
                ", tenSach='" + nameSach + '\'' +
                ", soLuong=" + soluongSach +
                '}';
    }
}
