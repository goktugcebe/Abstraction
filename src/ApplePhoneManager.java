/**
 * The ApplePhoneManager program is extend by  BasePhoneManager application that
 *     have methods in detailed. Here we will override the methods.
 */

public class ApplePhoneManager extends BasePhoneManager{

    public ApplePhoneManager() {
        super("APPLE","IPhone 14 Pro",53628);
    }

    /**
     * Here we have specific calculation for this class with overriding.
     * @param price
     * @return
     */
    @Override
    double phoneBuy(double price){
        return (price*120)/100;
    }
}
