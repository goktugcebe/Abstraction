/**
 * The HuaweiPhoneManager program is extend by  BasePhoneManager application that
 *   have methods in detailed. Here we will override the methods.
 */

public class HuaweiPhoneManager extends BasePhoneManager{

    public HuaweiPhoneManager() {
        super("HUWAI","Mate 50 Pro",37999);
    }

    /**
     * Here we have specific calculation for this class with overriding.
     * @param price
     * @return
     */
    @Override
    double phoneBuy(double price){
        return (price*75)/100;
    }
}
