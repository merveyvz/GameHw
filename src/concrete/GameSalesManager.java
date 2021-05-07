package concrete;

import abstracts.GameSalesService;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class GameSalesManager implements GameSalesService {
    private Campaign campaign;

    public GameSalesManager(){

    }

    public GameSalesManager(Campaign campaign){
        this.setCampaign(campaign);
    }




    @Override
    public void sell(Customer customer, Game game) {
        System.out.println(customer.getFirstName() + " " + game.getName() + " oyununu aldı." );
    }


    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
