package Menu;

import Manager.BaoManager;

import java.util.Scanner;

import static Menu.Job.MenuAdd.add;
import static Menu.Job.MenuFind.Find;
import static Menu.Job.MenuShowAll.showAll;
import static Menu.Job.MenuSua.Edit;
import static Menu.Job.MenuXoa.Delete;
public class MenuMain {
     BaoManager Baomanager = new BaoManager();
    static Scanner InputNumber = new Scanner(System.in);
    public static void selectMenu() {
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
                    add();
                    break;
                case 2:
                    Edit();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    Find();
                    break;
            }
        } while (choice != 0);

    }
}
