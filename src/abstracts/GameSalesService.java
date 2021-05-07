package abstracts;

import entities.Customer;
import entities.Game;

public interface GameSalesService {
    void sell(Customer customer, Game game);
}
