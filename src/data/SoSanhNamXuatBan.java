
package data;

import java.util.Comparator;

/**
 *
 * @author quang
 */
public class SoSanhNamXuatBan implements Comparator<Document>{

    @Override
    public int compare(Document o1, Document o2) {
        if(o1.getYEAR() > o2.getYEAR())
            return 1;
        else if(o1.getYEAR() < o2.getYEAR())
            return -1;
        else
            return 0;
    }
    
}
