package Task10;

import java.util.Comparator;

public class BoxBiggerSizeComparator implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        if (o1.getSize()>o2.getSize()) {
            return -1;
        } else if (o1.getSize()< o2.getSize()){
            return 1;
        }
        return 0;
    }
}
