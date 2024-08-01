package module;

public class Tapchi {
    private int idTapChi;
    private String NhaXuatBanTapChi;
    private int SoLuongTapChi;
    private int SoPhatHanhTapChi;
    private  String DateTapChi;
    private static int NewIdTapChi;

    public Tapchi( String nhaXuatBanTapChi, int soLuongTapChi, int soPhatHanhTapChi, String dateTapChi) {
        this.idTapChi = NewIdTapChi;
        NhaXuatBanTapChi = nhaXuatBanTapChi;
        SoLuongTapChi = soLuongTapChi;
        SoPhatHanhTapChi = soPhatHanhTapChi;
        DateTapChi = dateTapChi;
        NewIdTapChi++;
    }

    public Tapchi(int idTapChi, String nhaXuatBanTapChi, int soLuongTapChi, int soPhatHanhTapChi, String dateTapChi) {
        this.idTapChi = idTapChi;
        NhaXuatBanTapChi = nhaXuatBanTapChi;
        SoLuongTapChi = soLuongTapChi;
        SoPhatHanhTapChi = soPhatHanhTapChi;
        DateTapChi = dateTapChi;
    }

    public int getIdTapChi() {
        return idTapChi;
    }

    public void setIdTapChi(int idTapChi) {
        this.idTapChi = idTapChi;
    }

    public String getNhaXuatBanTapChi() {
        return NhaXuatBanTapChi;
    }

    public void setNhaXuatBanTapChi(String nhaXuatBanTapChi) {
        NhaXuatBanTapChi = nhaXuatBanTapChi;
    }

    public int getSoLuongTapChi() {
        return SoLuongTapChi;
    }

    public void setSoLuongTapChi(int soLuongTapChi) {
        SoLuongTapChi = soLuongTapChi;
    }

    public int getSoPhatHanhTapChi() {
        return SoPhatHanhTapChi;
    }

    public void setSoPhatHanhTapChi(int soPhatHanhTapChi) {
        SoPhatHanhTapChi = soPhatHanhTapChi;
    }

    public String getDateTapChi() {
        return DateTapChi;
    }

    public void setDateTapChi(String dateTapChi) {
        DateTapChi = dateTapChi;
    }

    public static int getNewIdTapChi() {
        return NewIdTapChi;
    }

    public static void setNewIdTapChi(int newIdTapChi) {
        NewIdTapChi = newIdTapChi;
    }

    @Override
    public String toString() {
        return "Tap chi{" +
                "id Tap Chi=" + idTapChi +
                ", || Nha Xuat Ban Tap Chi='" + NhaXuatBanTapChi + '\'' +
                ", || So Luong Tap Chi=" + SoLuongTapChi +
                ", || So Phat Hanh Tap Chi=" + SoPhatHanhTapChi +
                ", || Date Tap Chi='" + DateTapChi + '\'' +
                '}';
    }
}
