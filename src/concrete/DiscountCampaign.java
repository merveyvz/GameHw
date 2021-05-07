package concrete;

import abstracts.BaseCampaignManager;
import entities.Game;

public class DiscountCampaign extends BaseCampaignManager {
    private double discountAmount;

    public void makeDiscount(Game game, double discountAmount){
        game.setUnitPrice(game.getUnitPrice() - (game.getUnitPrice() * discountAmount/100));
        System.out.println("Yeni fiyat: " +  game.getUnitPrice());
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}
