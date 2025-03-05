interface TelcoSubscription {
    int getData();
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
    String accept(UsagePromo promo);
    String accept(UnliCallsTextOffer offer);
}
