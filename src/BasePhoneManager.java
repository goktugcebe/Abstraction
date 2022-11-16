/**
 * The BasePhoneManager program implements an application that
 *   simply create an abstract class and method for PhoneManager classes.
 */

public abstract class BasePhoneManager {
    private String firmInfo;
    private String modelInfo;

    private double price;

    /**
     * This method for adjusting in price of the phone.
     * @param price
     * @return
     */

    abstract double phoneBuy(double price);

    /**
     *
     * @param firmInfo
     * @param modelInfo
     * @param price
     */

    public BasePhoneManager(String firmInfo, String modelInfo,int price) {
        this.firmInfo = firmInfo;
        this.modelInfo = modelInfo;
        this.price=price;
    }

    public String getFirmInfo() {
        return firmInfo;
    }

    public void setFirmInfo(String firmInfo) {
        this.firmInfo = firmInfo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelInfo() {
        return modelInfo;
    }

    public void setModelInfo(String modelInfo) {
        this.modelInfo = modelInfo;
    }
}
