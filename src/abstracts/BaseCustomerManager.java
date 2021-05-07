package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void add(Customer customer) throws Exception {
        System.out.println("Oyuncu eklendi: " + customer.getFirstName());
    }

    @Override
    public void update(Customer customer) throws Exception {
        System.out.println("Oyuncunun bilgileri güncellendi: " + customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) throws Exception {
        System.out.println("Oyuncu silindi: " + customer.getFirstName());
    }

	
}
