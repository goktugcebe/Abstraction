/**
 * The SamsungPhoneManager program is extend by  BasePhoneManager application that
 *     have methods in detailed. Here we will override the methods.
 */

public class SamsungPhoneManager extends BasePhoneManager {

    public SamsungPhoneManager() {
        super("SAMSUNG","Galaxy S22 Ultra 5G",31999);
    }

    /**
     * Here we have specific calculation for this class with overriding.
     * @param price
     * @return
     */
    @Override
    double phoneBuy(double price){
        return price-250;
    }

}
