package operations;

import domain.CustomerCard;
import repository.SystemRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class CustomerCardService {
    private SystemRepository<CustomerCard> customerCardSystemRepository;

    public CustomerCardService(SystemRepository<CustomerCard> customerCardSystemRepository) {
        this.customerCardSystemRepository = customerCardSystemRepository;
    }

    public void addCustomerCards(int id, String firstName, String lastName, String CNP, LocalDate bornDate, LocalDate dateOfRegistration) {
        CustomerCard customerCard = new CustomerCard(id, firstName, lastName, CNP, bornDate, dateOfRegistration);
        customerCardSystemRepository.save(customerCard);
    }

    public List<CustomerCard> getAllCustomerCards() {
        return customerCardSystemRepository.findAll();
    }
}
