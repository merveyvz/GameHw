package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager{
private CustomerCheckService customerCheckService;
	
	public GamerCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		
		
	}
	
	
	@Override
		public void add(Customer customer) throws Exception {
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.add(customer);
			}else {
				throw new Exception("Not a valid person");
			}
			
		}
	
	@Override
		public void delete(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.delete(customer);
		}else {
			throw new Exception("Not a valid person");
			}
		
		}
	
		@Override
			public void update(Customer customer) throws Exception {
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.update(customer);
				}else {
					throw new Exception("Not a valid person");
				}
			}
	
	
	
	
}
