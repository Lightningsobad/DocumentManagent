package data;

/**
 *
 * @author quang
 */
public class Document {

    private String id;
    private int page;
    private int YEAR = 2020;

    public void setYEAR(int YEAR) {
        this.YEAR = YEAR;
    }

    public int getYEAR() {
        return YEAR;
    }
    
    

    public Document(String id, int page) {
        this.id = id;
        this.page = page;
    }

    public String getId() {
        return id;
    }

    

    public Document() {
    }

    public void setPage(int page) {
        this.page = page;
    }

    
    public String kiemTraSoTrang() {
        if(page == 0)
            return "Kiểm tra lại";
        if(page < 0)
            return "Dữ liệu không hợp lệ";
        if(page > 500)
            return "Tài Liệu quá dày";
        return null;    
    }
    
    public static void inTieuDe() {
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|\n", "MÃ TÀI LIỆU", "SỐ TRANG", "NĂM XUẤT BẢN", "KIỂM TRA");
        

}
    public void inDuLieu() {
        System.out.printf("|%-15s|%-15d|%-15d|%-15s|\n", id, page, YEAR, kiemTraSoTrang());
    }
}