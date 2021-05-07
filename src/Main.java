import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.DiscountCampaign;
import concrete.GameSalesManager;
import concrete.GamerCustomerManager;
import entities.Customer;
import entities.Game;

public class Main {

    public static void main(String[] args) throws Exception {
    	BaseCustomerManager customerManager = new GamerCustomerManager(new MernisServiceAdapter());
    	
    	Customer customer = new Customer(123, "Merve", "Yavuz", LocalDate.of(2000,1, 1), "12345678910");
    	
    	customerManager.add(customer);
    	
    	GameSalesManager saleManager = new GameSalesManager();
    	
    	Game game1 = new Game(145, "Run", 100);
    	
    	saleManager.sell(customer, game1);
    	
    	DiscountCampaign campaignManager = new DiscountCampaign();
    	
    	campaignManager.makeDiscount(game1, 15);
    	
    	

    }
}
