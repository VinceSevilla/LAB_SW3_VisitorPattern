class TelcoAllowance implements UsagePromo{
    @Override
    public String showAllowance(String telcoName, int data, double price){
        return telcoName + " " + data + "GB data package costs P" + price + ".";
    }
}
