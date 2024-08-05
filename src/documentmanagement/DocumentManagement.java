package documentmanagement;

import data.Shelf;
import java.util.Scanner;


/**
 *
 * @author quang
 */
public class DocumentManagement {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shelf sh = new Shelf();
        int choice;
        do {
            inMenu();
            System.out.print("Mời nhập vào lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    sh.fakeData();
                    break;
                case 2:
                    sh.nhapDuLieu();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Không hợp lệ, hãy nhập số từ 1...5");
                    break;
            }

        } while (choice != 5);
    }




    

    public static void inMenu() {
        System.out.println("**********************************");
        System.out.println("Chương trình quản lí tài liệu");
        System.out.println("Chọn 1: In dữ liệu mẫu");
        System.out.println("Chọn 2: Nhập và in tài liệu: ");
        System.out.println("Chọn 3: Sửa tài liệu");
        System.out.println("Chọn 4: In tài liệu theo phân loại");
        System.out.println("Chọn 5: Thoát");
    }

}



