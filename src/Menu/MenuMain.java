package Menu;

import Manager.BaoManager;
import Manager.SachManager;
import Manager.TapChiManager;
import module.Bao;
import module.Sach;
import module.Tapchi;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuMain {
    BaoManager Baomanager = new BaoManager();
    SachManager SachManager = new SachManager();
    TapChiManager TapChiManager = new TapChiManager();
    Scanner InputNumber = new Scanner(System.in);
    Scanner InputString = new Scanner(System.in);

    public void selectMenu() {
        int choice;
        do {
            System.out.println("============Menu Tài Lieu===========");
            System.out.println("1.1: Thêm tài lieu");
            System.out.println("1.2: Sửa thông tài lieu");
            System.out.println("1.3: Xoá thông tài lieu");
            System.out.println("1.4: Hiển thị tất cả ");
            System.out.println("1.5: Tim kiem theo loai ");
            System.out.println("0. Thoát Menu tài lieu");
            System.out.println("Chọn phương thức thực hiện");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuXoa();
                    break;
                case 4:
                    showMenuShowAll();
                    break;
                case 5:
                    MenuFind();

                    break;
            }
        } while (choice != 0);

    }

    public void showMenuAdd() {
        int choice;
        do {
            System.out.println("========Menu Thêm mới========");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Thêm mới Báo");
            System.out.println("3. Thêm mới tạp trí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    addSach();
                    break;
                case 2:
                    addBao();
                    break;
                case 3:
                    addTapChi();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp!");
                    break;
            }
        } while (choice != 0);
    }

    private void addSach() {
        System.out.println("=====Thêm mới sách=====");
        System.out.print("Nhập Nha xuat bản : ");
        String nhaXuatBanSach = InputString.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String Name = InputString.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soluongSach = InputNumber.nextInt();
        Sach sach = new Sach(nhaXuatBanSach, Name, soluongSach);
        SachManager.add(sach);
        System.out.println("Thêm sách thành công!");
    }

    private void addBao() {
        System.out.println("=====Thêm mới sách=====");
        System.out.print("Nhập Nha xuat bản : ");
        String nhaXuatBanBao = InputString.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soluongBao = InputNumber.nextInt();
        System.out.println("ngày phát hành : ");
        String NgayPhatHanh = InputString.nextLine();
        Bao bao = new Bao(nhaXuatBanBao, soluongBao, NgayPhatHanh);
        Baomanager.add(bao);
        System.out.println("Thêm sách thành công!");
    }

    private void addTapChi() {
        System.out.println("=====Thêm mới sách=====");
        System.out.print("Nhập Nha xuat bản : ");
        String nhaXuatBanTapChi = InputString.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        int soluongTapChi = InputNumber.nextInt();
        System.out.println("Nhap so phat hanh : ");
        int SoPhatHanhTapChi = InputNumber.nextInt();
        System.out.println("nhap ngay phat hanh: ");
        String DateTapChi = InputString.nextLine();

        Tapchi tapchi = new Tapchi(nhaXuatBanTapChi, soluongTapChi, SoPhatHanhTapChi, DateTapChi);
        TapChiManager.add(tapchi);
        System.out.println("Thêm sách thành công!");
    }

    public void showMenuXoa() {
        int choice;
        do {
            System.out.println("========Menu Xoá========");
            System.out.println("1. Xoá sách");
            System.out.println("2. Xoá Báo");
            System.out.println("3. Xoá tạp trí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuRemoveSach();
                    break;
                case 2:
                    showMenuRemoveBao();
                    break;
                case 3:
                    showMenuRemoveTapChi();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp!");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuRemoveSach() {
        System.out.println("===========Menu xoá sinh viên ============");
        System.out.println("Nhập Id muốn xoá: ");
        int idRemove = InputNumber.nextInt();
        SachManager.remove(idRemove);
        System.out.println("Xoá thành công");
    }

    public void showMenuRemoveBao() {
        System.out.println("===========Menu xoá============");
        System.out.println("Nhập Id muốn xoá: ");
        int idRemove = InputNumber.nextInt();
        Baomanager.remove(idRemove);
        System.out.println("Xoá thành công");
    }

    public void showMenuRemoveTapChi() {
        System.out.println("===========Menu xoá============");
        System.out.println("Nhập Id muốn xoá: ");
        int idRemove = InputNumber.nextInt();
        TapChiManager.remove(idRemove);
        System.out.println("Xoá thành công");
    }

    public void showMenuShowAll() {
        int choice;
        do {
            System.out.println("========Menu hiển thị tất cả========");
            System.out.println("1. hiển thị tất cả sách");
            System.out.println("2. hiển thị tất cả Báo");
            System.out.println("3. hiển thị tất cả tạp trí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuListSach();
                    break;
                case 2:
                    showMenuListBao();
                    break;
                case 3:
                    showMenuListTapChi();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp!");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuListSach() {
        System.out.println("===========Menu Students ============");
        ArrayList<Sach> ListStudent = SachManager.FindAll();
        for (int i = 0; i < ListStudent.size(); i++) {
            System.out.println(i + 1 + ". " + ListStudent.get(i));
        }
    }

    public void showMenuListBao() {
        System.out.println("===========Menu Students ============");
        ArrayList<Bao> ListStudent = Baomanager.FindAll();
        for (int i = 0; i < ListStudent.size(); i++) {
            System.out.println(i + 1 + ". " + ListStudent.get(i));
        }
    }

    public void showMenuListTapChi() {
        System.out.println("===========Menu Students ============");
        ArrayList<Tapchi> ListStudent = TapChiManager.FindAll();
        for (int i = 0; i < ListStudent.size(); i++) {
            System.out.println(i + 1 + ". " + ListStudent.get(i));
        }
    }

    public void showMenuEdit() {
        int choice;
        do {
            System.out.println("========Menu Sửa========");
            System.out.println("1. Sửa sách");
            System.out.println("2. Sửa Báo");
            System.out.println("3. Sửa tạp trí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
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
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp!");
                    break;
            }
        } while (choice != 0);
    }

    private void EditSach() {
        System.out.println("=====Thêm mới sách=====");
        System.out.println("Nhap id muốn sửa: ");
        int idSach = InputNumber.nextInt();
        System.out.print("Nhập Nha xuat bản : ");
        String nhaXuatBanSach = InputString.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String Name = InputString.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soluongSach = InputNumber.nextInt();
        Sach sach = new Sach(idSach, nhaXuatBanSach, Name, soluongSach);
        SachManager.update(idSach, sach);
        System.out.println("Thêm sách thành công!");
    }

    private void EditBao() {
        System.out.println("Nhap id muốn sửa: ");
        int idBao = InputNumber.nextInt();
        System.out.println("=====Thêm mới sách=====");
        System.out.print("Nhập Nha xuat bản : ");
        String nhaXuatBanBao = InputString.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soluongBao = InputNumber.nextInt();
        System.out.println("ngày phát hành : ");
        String NgayPhatHanh = InputString.nextLine();
        Bao bao = new Bao(idBao, nhaXuatBanBao, soluongBao, NgayPhatHanh);
        Baomanager.update(idBao, bao);
        System.out.println("Thêm sách thành công!");
    }

    private void EditTapChi() {
        System.out.println("=====Thêm mới sách=====");
        System.out.println("Nhap id muốn sửa: ");
        int idTapChi = InputNumber.nextInt();
        System.out.print("Nhập Nha xuat bản : ");
        String nhaXuatBanTapChi = InputString.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        int soluongTapChi = InputNumber.nextInt();
        System.out.println("Nhap so phat hanh : ");
        int SoPhatHanhTapChi = InputNumber.nextInt();
        System.out.println("nhap ngay phat hanh: ");
        String DateTapChi = InputString.nextLine();
        Tapchi tapchi = new Tapchi(idTapChi, nhaXuatBanTapChi, soluongTapChi, SoPhatHanhTapChi, DateTapChi);
        TapChiManager.update(idTapChi, tapchi);
        System.out.println("Thêm sách thành công!");
    }

    public void MenuFind() {
        int choice;
        do {
            System.out.println("========Menu Tìm kiếm theo========");
            System.out.println("1. Tìm kiếm theo sách");
            System.out.println("2. Tìm kiếm theo Báo");
            System.out.println("3. Tìm kiếm theo tạp trí");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    FindByIdSach();
                    break;
                case 2:
                    FindByIdBao();
                    break;
                case 3:
                    FindByIdTapChi();
                    break;
                case 0:
                    System.out.println("Quay lại trang quản lý!");
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp!");
                    break;
            }
        } while (choice != 0);

    }

    private void FindByIdSach() {
        System.out.println("=======Find Id=======");
        System.out.println("Nhập ID sach cần tìm kiếm : ");
        int id = InputNumber.nextInt();
        int index = SachManager.FindById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy Sách  có ID = " + id);
        } else {
            Sach foundProduct = SachManager.FindAll().get(index);

            System.out.println("Thông tin Sach:");
            System.out.println(foundProduct.toString());
        }


    }

    private void FindByIdBao() {
        System.out.println("=======Find Id=======");
        System.out.println("Nhập ID Bao cần tìm kiếm : ");
        int id = InputNumber.nextInt();
        int index = Baomanager.FindById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy Bao  có ID = " + id);
        } else {
            Bao foundProduct = Baomanager.FindAll().get(index);

            System.out.println("Thông tin Bao :");
            System.out.println(foundProduct.toString());
        }
    }

    private void FindByIdTapChi() {
        System.out.println("=======Find Id=======");
        System.out.println("Nhập ID Tap chi cần tìm kiếm : ");
        int id = InputNumber.nextInt();
        int index = TapChiManager.FindById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy Tap Chi  có ID = " + id);
        } else {
            Tapchi foundProduct = TapChiManager.FindAll().get(index);

            System.out.println("Thông tin Tap Chi:");
            System.out.println(foundProduct.toString());
        }
    }
}
