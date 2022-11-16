/**
 * The BasePhoneManager program implements an application that simply bringing all
 * our abstract classes and then combining them according to program flow.
 */

import java.util.Scanner;

public class CustomerManager {
        BasePhoneManager basePhoneManager;
        DataBaseLogin dataBaseLogin;
        CreditCard creditCard;

    /**
     * This method is used to show user's option to select PhoneManager classes.
     */
    public void itemSelection(){
            BasePhoneManager[] phoneList={new ApplePhoneManager(),new SamsungPhoneManager(),new HuaweiPhoneManager()};
        int number=0;
        for(BasePhoneManager basePhoneManager:phoneList){
            number++;
            System.out.println(number+"_ Brand: "+basePhoneManager.getFirmInfo()+"\t Model: "+basePhoneManager.getModelInfo()+
                    "\t Price: "+basePhoneManager.getPrice()+"TL");
        }
        System.out.println("----------------------");
        System.out.println("Please select which admiral model you want to have!");
        }

    /**
     *
     *This method is used to gather all abstract classes.
     */
    public void run(){
        System.out.println("----------------------");
        dataBaseLogin=new DBMediaMark();
        dataBaseLogin.login();
        System.out.println("----------------------");
        itemSelection();
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        while(input>3||input<1){
            System.out.println("ERROR!\nPlease select your choice once again!");
            input=scanner.nextInt();
        }
        
        if(input==1){
            System.out.println("----------------------");
            basePhoneManager=new ApplePhoneManager();
            System.out.println(basePhoneManager.getFirmInfo()+" "+basePhoneManager.getModelInfo()+" added to your basket."
                    +"\nTotal basket value: "+basePhoneManager.getPrice()+"TL"+
                    "\nTotal basket value after calculation: "+basePhoneManager.phoneBuy(basePhoneManager.getPrice())+"TL");
            System.out.println("Item has been added to the basket.");
           

        } else if(input==2){
            System.out.println("----------------------");
            basePhoneManager=new SamsungPhoneManager();
            System.out.println(basePhoneManager.getFirmInfo()+" "+basePhoneManager.getModelInfo()+" added to your basket."
            +"\nTotal basket value: "+basePhoneManager.getPrice()+"TL"+
                    "\nTotal basket value after calculation: "+basePhoneManager.phoneBuy(basePhoneManager.getPrice())+"TL");
         
        } else if(input==3){
            System.out.println("----------------------");
            basePhoneManager=new HuaweiPhoneManager();
            System.out.println(basePhoneManager.getFirmInfo()+" "+basePhoneManager.getModelInfo()+" added to your basket."
                    +"\nTotal basket value: "+basePhoneManager.getPrice()+"TL"+
                    "\nTotal basket value after calculation: "+basePhoneManager.phoneBuy(basePhoneManager.getPrice())+"TL");
           
        }
        selectCreditCard();

        /**
         * This method is used to select CreditCard option.
         */
        }
        public void selectCreditCard(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please select you registered Credit Cart:\n1-VisaCard\t2-MasterCard : ");
            int creditC=scanner.nextInt();
            if (creditC==1){
                creditCard=new VisaCard();
                System.out.println("Visa Card Balance: "+ creditCard.getCardBalance()+"\nCard balance is insufficient please try tp purchase with another card!");
                System.out.println("Would you like to try with MasterCard to purchase? If YES please press 1, if not press 0 to quit.");
                int master=scanner.nextInt();
                if (master==1){
                    creditCard=new MasterCard();
                    System.out.println("Master Card Balance: "+ creditCard.getCardBalance()+" Card balance is sufficient. Purchase has been completed!");
                    System.out.println("Thank you for shopping from MediaMark!");
                }else
                    System.out.println("Good Bye! Thanks for visiting MediaMark!");
            } else if (creditC==2){
                creditCard=new MasterCard();
                System.out.println("Master Card Balance: "+ creditCard.getCardBalance()+" Card balance is sufficient. Purchase has been completed!");
                System.out.println("Thank you for shopping from MediaMark!");
            }

        }


}
