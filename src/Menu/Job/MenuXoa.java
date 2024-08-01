package Menu.Job;

import Manager.BaoManager;
import Manager.SachManager;
import Manager.TapChiManager;

import java.util.Scanner;

public class MenuXoa {
    static BaoManager BaoManager = new BaoManager();
     static  SachManager SachManager = new SachManager();
     static  TapChiManager TapChiManager = new TapChiManager();
    static Scanner InputNumber = new Scanner(System.in);
    static Scanner InputString = new Scanner(System.in);
    public static void Delete() {
        int choice;
        do {
            System.out.println("============Menu Xoa ===========");
            System.out.println("1.1: xoa Sach");
            System.out.println("1.2: xoa Bao");
            System.out.println("1.3: xoa tap chi");
            System.out.println("0. Thoát Menu xoa");
            System.out.println("Chọn phương thức thực hiện");
            choice = InputNumber.nextInt();
            switch (choice) {
                case 1:
                    DeleteSach();
                    break;
                case 2:
                    DeleteBao();
                    break;
                case 3:
                    DeleteTapChi();
                    break;
            }
        } while (choice != 0);

    }
    public static void DeleteSach() {
        System.out.println("===========Menu xoá ============");
        System.out.println("Nhập Id Sách muốn xoá: ");
        int idRemove = InputNumber.nextInt();
        SachManager.remove(idRemove);
        System.out.println("Xoá thành công");

}
    public static void DeleteBao() {
        System.out.println("===========Menu xoá ============");
        System.out.println("Nhập Id Sách muốn xoá: ");
        int idRemove = InputNumber.nextInt();
        BaoManager.remove(idRemove);
        System.out.println("Xoá thành công");

    }
    public static void DeleteTapChi() {
        System.out.println("===========Menu xoá ============");
        System.out.println("Nhập Id Sách muốn xoá: ");
        int idRemove = InputNumber.nextInt();
        TapChiManager.remove(idRemove);
        System.out.println("Xoá thành công");

    }
}
