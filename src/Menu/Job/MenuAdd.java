package Menu.Job;

import Manager.BaoManager;
import Manager.SachManager;
import Manager.TapChiManager;
import module.Bao;
import module.Sach;
import module.Tapchi;

import java.util.Scanner;

public class MenuAdd {
  static BaoManager baoManager = new BaoManager();
     static SachManager sachManager = new SachManager();
     static TapChiManager tapChiManager = new TapChiManager();
    static Scanner input = new Scanner(System.in);

    public static void add() {
        int choice;
        do {
            System.out.println("============ Menu Add ===========");
            System.out.println("1: Thêm Sách");
            System.out.println("2: Thêm Báo");
            System.out.println("3: Thêm Tạp Chí");
            System.out.println("0: Thoát Menu Thêm");
            System.out.print("Chọn phương thức thực hiện: ");
            choice = input.nextInt();
            input.nextLine();

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
                    System.out.println("Thoát Menu Thêm.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static void addSach() {
        System.out.print("Nhập tên nhà xuất bản sách: ");
        String nhaXuatBanSach = input.nextLine();
        System.out.print("Nhập tên sách: ");
        String nameSach = input.nextLine();
        System.out.print("Nhập số lượng sách: ");
        int soLuongSach = input.nextInt();
        input.nextLine();
        Sach newSach = new Sach(nhaXuatBanSach, nameSach, soLuongSach);
        sachManager.add(newSach);
        System.out.println("Thêm mới sách thành công.");
    }

    public static void addBao() {
        System.out.print("Nhập tên nhà xuất bản báo: ");
        String nhaXuatBanBao = input.nextLine();
        System.out.print("Nhập số lượng báo: ");
        int soLuongBao = input.nextInt();
        input.nextLine();
        System.out.print("Nhập ngày phát hành báo: ");
        String ngayPhatHanhBao = input.nextLine();

        Bao newBao = new Bao(nhaXuatBanBao, soLuongBao, ngayPhatHanhBao);
        baoManager.add(newBao);
        System.out.println("Thêm mới báo thành công.");
    }

    public static void addTapChi() {
        System.out.print("Nhập tên nhà xuất bản tạp chí: ");
        String nhaXuatBanTapChi = input.nextLine();
        System.out.print("Nhập số lượng tạp chí: ");
        int soLuongTapChi = input.nextInt();
        System.out.print("Nhập số phát hành tạp chí: ");
        int soPhatHanhTapChi = input.nextInt();
        input.nextLine(); 
        System.out.print("Nhập ngày phát hành tạp chí: ");
        String ngayPhatHanhTapChi = input.nextLine();

        Tapchi newTapChi = new Tapchi(nhaXuatBanTapChi, soLuongTapChi, soPhatHanhTapChi, ngayPhatHanhTapChi);
        tapChiManager.add(newTapChi);
        System.out.println("Thêm mới tạp chí thành công.");
    }
}
