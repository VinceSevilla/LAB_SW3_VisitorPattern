class Telco implements TelcoSubscription {
    private int data;
    private String telcoName;
    private double promoPrice;
    private boolean unliCallText;


    public Telco(String telcoName, int data, double promoPrice, boolean unliCallText){
        this.telcoName = telcoName;
        this.data = data;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName(){
        return telcoName;
    }

    @Override
    public int getData(){
        return data;
    }

    @Override
    public double getPromoPrice(){
        return promoPrice;
    }


    @Override
    public boolean getUnliCallText(){
        return unliCallText;
    }


    @Override
    public String accept(UsagePromo promo){
        return promo.showAllowance(telcoName, data, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer offer){
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}
