package Menu.Job;

import Manager.BaoManager;
import Manager.SachManager;
import Manager.TapChiManager;
import module.Bao;
import module.Sach;
import module.Tapchi;

import java.util.Scanner;

public class MenuSua {
    static BaoManager BaoManager = new BaoManager();
     static SachManager SachManager = new SachManager();
     static TapChiManager TapChiManager = new TapChiManager();
    static Scanner InputNumber = new Scanner(System.in);
    static Scanner InputString = new Scanner(System.in);

    public static void Edit() {
        int choice;
        do {
            System.out.println("============Menu Edit ===========");
            System.out.println("1.1: Edit Sach");
            System.out.println("1.2: Edit Bao");
            System.out.println("1.3: Edit tap chi");
            System.out.println("0. Thoát Menu Edit");
            System.out.println("Chọn phương thức thực hiện");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    EditSach();
                    break;
                case 2:
                    EditBao();
                    break;
                case 3:
                    EditTapChi();
                    break;
            }
        } while (choice != 0);
    }

    public static void EditSach() {
        System.out.println("===========Menu Edit ============");
        System.out.println("Nhập Id muốn sửa: ");
        int idEdit = InputNumber.nextInt();
        System.out.println("Nhập Nha xuat ban muốn sửa: ");
        String NhaXuatBanSach = InputString.nextLine();
        System.out.println("Nhập tên sach muốn sửa: ");
        String nameSach = InputString.nextLine();
        System.out.println("nhap so luong sach muon sua : ");
        int soLuongSach = InputNumber.nextInt();
        Sach newSach = new Sach(idEdit, NhaXuatBanSach, nameSach, soLuongSach);
        SachManager.update(idEdit, newSach);
        System.out.println("Sửa thành công");
    }

    public static void EditBao() {
        System.out.println("===========Menu Edit ============");
        System.out.println("Nhập Id muốn sửa: ");
        int idEdit = InputNumber.nextInt();
        System.out.println("Nhập tên nha xuat ban bao: ");
        String NhaXuatBanBao = InputString.nextLine();
        System.out.println("Nhap so luong bao : ");
        int SoluongBao = InputNumber.nextInt();
        System.out.println("ngay phat hanh bao : ");
        String NgayPhatHanhBao = InputString.nextLine();

        Bao newBao = new Bao(idEdit, NhaXuatBanBao, SoluongBao, NgayPhatHanhBao);
        BaoManager.update(idEdit, newBao);
        System.out.println("Thêm mới thành công");
    }

    public static void EditTapChi() {
        System.out.println("===========Menu Edit ============");
        System.out.println("Nhập Id muốn sửa: ");
        int idEdit = InputNumber.nextInt();
        System.out.println("Nhập tên nha xuat ban tap chi: ");
        String NhaXuatBanTapchi = InputString.nextLine();
        System.out.println("Nhap so luong sach : ");
        int SoluongTapchi = InputNumber.nextInt();
        System.out.println("Nhap so xuat bản : ");
        int SoXuatBan = InputNumber.nextInt();
        System.out.println("Ngày san xuat : ");
        String NgayPhatHanhBao = InputString.nextLine();
        Tapchi newTapChi = new Tapchi(idEdit, NhaXuatBanTapchi, SoluongTapchi, SoXuatBan, NgayPhatHanhBao);
        TapChiManager.update(idEdit, newTapChi);
        System.out.println("Thêm mới thành công");
    }
}

