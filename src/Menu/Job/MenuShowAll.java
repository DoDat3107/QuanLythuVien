package Menu.Job;

import Manager.BaoManager;
import Manager.SachManager;
import Manager.TapChiManager;
import module.Bao;
import module.Sach;
import module.Tapchi;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuShowAll {
     static BaoManager baoManager = new BaoManager();
     static SachManager sachManager = new SachManager();
    static TapChiManager tapChiManager = new TapChiManager();
     static Scanner input = new Scanner(System.in);

    public static void showAll() {
        int choice;
        do {
            System.out.println("============ Menu Show ===========");
            System.out.println("1: Hiển thị tất cả Sách");
            System.out.println("2: Hiển thị tất cả Báo");
            System.out.println("3: Hiển thị tất cả Tạp Chí");
            System.out.println("0: Thoát Menu Hiển Thị");
            System.out.print("Chọn phương thức thực hiện: ");
            choice = input.nextInt();
            input.nextLine(); // Xử lý ký tự xuống dòng còn lại sau nextInt()

            switch (choice) {
                case 1:
                    showListSach();
                    break;
                case 2:
                    showListBao();
                    break;
                case 3:
                    showListTapChi();
                    break;
                case 0:
                    System.out.println("Thoát Menu Hiển Thị.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    private static void showListSach() {
        System.out.println("=========== Menu Sách ============");
        ArrayList<Sach> listSach = sachManager.FindAll();
        for (int i = 0; i < listSach.size(); i++) {
            System.out.println((i + 1) + ". " + listSach.get(i));
        }
    }

    private static void showListBao() {
        System.out.println("=========== Menu Báo ============");
        ArrayList<Bao> listBao = baoManager.FindAll();
        for (int i = 0; i < listBao.size(); i++) {
            System.out.println((i + 1) + ". " + listBao.get(i));
        }
    }

    private static void showListTapChi() {
        System.out.println("=========== Menu Tạp Chí ============");
        ArrayList<Tapchi> listTapChi = tapChiManager.FindAll();
        for (int i = 0; i < listTapChi.size(); i++) {
            System.out.println((i + 1) + ". " + listTapChi.get(i));
        }
    }
}
