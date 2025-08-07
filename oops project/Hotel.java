import java.util.ArrayList;
import java.util.Scanner;

class Hotel {
    String hotelName;
    String hotelOwner;
    int serventCount;
    String product1;
    String product2;
    int profit;
    int loss;

    Hotel(String hotelName, String hotelOwner, int serventCount,
          String product1, String product2, int profit, int loss) {
        this.hotelName = hotelName;
        this.hotelOwner = hotelOwner;
        this.serventCount = serventCount;
        this.product1 = product1;
        this.product2 = product2;
        this.profit = profit;
        this.loss = loss;
    }

    @Override
    public String toString() {
        return "\n[hotelName=" + hotelName + ", hotelOwner=" + hotelOwner
                + ", serventCount=" + serventCount + ", product1=" + product1
                + ", product2=" + product2 + ", profit=" + profit + ", loss=" + loss + "]";
    }
}

