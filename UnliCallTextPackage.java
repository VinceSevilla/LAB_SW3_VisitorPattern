public class UnliCallTextPackage implements UnliCallsTextOffer{
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnli){
        return telcoName + (hasUnli ? " Offers unlimited calls and texts." : " Does not offers unlimited calls and texts.");
    }
}
