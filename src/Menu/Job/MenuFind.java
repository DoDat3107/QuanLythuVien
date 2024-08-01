package Menu.Job;

import Manager.BaoManager;
import Manager.SachManager;
import Manager.TapChiManager;
import module.Bao;
import module.Sach;
import module.Tapchi;

import java.util.Scanner;

public class MenuFind {
     static BaoManager BaoManager = new BaoManager();
     static SachManager SachManager = new SachManager();
    static TapChiManager TapChiManager = new TapChiManager();
    static Scanner InputNumber = new Scanner(System.in);
    static Scanner InputString = new Scanner(System.in);

    public static void Find() {
        int choice;
        do {
            System.out.println("============Menu Xoa ===========");
            System.out.println("1.1: tim theo Sach");
            System.out.println("1.2: tim theo Bao");
            System.out.println("1.3: tim theo tap chi");
            System.out.println("0. Thoát Menu tim kiem");
            System.out.println("Chọn phương thức thực hiện");
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
            }
        } while (choice != 0);

    }

    public static void FindByIdSach() {
        System.out.println("=======Find Id=======");
        System.out.println("Nhập ID sach cần tìm kiếm : ");
        int id = InputNumber.nextInt();
        int index = SachManager.FindById(id);
        if (index == -1) {
            System.out.println("Không tìm Sach hang có ID = " + id);
        } else {
            Sach Sach = SachManager.FindAll().get(index);

            System.out.println("Thông tin Sach:");
            System.out.println(Sach.toString());

        }

    }

    public static void FindByIdBao() {
        System.out.println("=======Find Id=======");
        System.out.println("Nhập ID Bao cần tìm kiếm : ");
        int id = InputNumber.nextInt();
        int index = BaoManager.FindById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy Bao có ID = " + id);
        } else {
            Bao Bao = BaoManager.FindAll().get(index);

            System.out.println("Thông tin Bao:");
            System.out.println(Bao.toString());

        }

    }

    public static void FindByIdTapChi() {
        System.out.println("=======Find Id=======");
        System.out.println("Nhập ID Tap Chi cần tìm kiếm : ");
        int id = InputNumber.nextInt();
        int index = TapChiManager.FindById(id);
        if (index == -1) {
            System.out.println("Không tìm Tap chi hang có ID = " + id);
        } else {
            Tapchi Tapchi = TapChiManager.FindAll().get(index);

            System.out.println("Thông tin Tap chi:");
            System.out.println(Tapchi.toString());

        }

    }


}


