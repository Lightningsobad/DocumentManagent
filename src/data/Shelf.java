package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author quang
 */
public class Shelf {

    private List<Document> arr1 = new ArrayList();
    private List<Document> arr2 = new ArrayList();
    private Scanner sc = new Scanner(System.in);
            

    public void fakeData() {
        Document dc1 = new Document("HAUI001", 5000);
        Document dc2 = new Document("HAUI002", 50);
        Document dc3 = new Document("HAUI003", 15);
        arr1.add(dc1);
        arr1.add(dc2);
        arr1.add(dc3);
        System.out.println("Dữ liệu mẫu: ");
        Document.inTieuDe();
        for (Document x : arr1) {
            x.inDuLieu();
        }
        arr1.clear();
        arr2.add(dc1);
        arr2.add(dc2);
        arr2.add(dc3);
    }
    
    public void nhapDuLieu() {
        String id;
        int page;
        System.out.print("Nhập số tài liệu bạn muốn thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tài liệu thứ #" + (arr2.size() + 1));
            System.out.print("Nhập mã sách: ");
            id = sc.nextLine();
            if(id.equalsIgnoreCase(""))
                break;
            System.out.print("Nhập số trang sách: ");
            page = Integer.parseInt(sc.nextLine());
            arr2.add(new Document(id, page));
        }
        System.out.println("Danh sách tài liệu sau khi thêm");
        Document.inTieuDe();
        for (Document x : arr2) {
            x.inDuLieu();
        }   
    }
    
    public void timKiemTaiLieu() {
        System.out.println("Nhập vào năm xuất bản muốn tìm: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr2.size(); i++) {
            if(arr2.get(i).getYEAR() == n) {
                System.out.println("Sách bạn muốn tìm: ");
                arr2.get(i).inDuLieu();
                arr2.get(i).setYEAR(2014);
            }
                
        }
    }
    
    
}