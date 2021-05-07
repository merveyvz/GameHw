package abstracts;

import entities.Customer;

public interface CustomerService {
    void add(Customer customer) throws Exception;
    void update(Customer customer) throws Exception;
    void delete(Customer customer) throws Exception;
}
