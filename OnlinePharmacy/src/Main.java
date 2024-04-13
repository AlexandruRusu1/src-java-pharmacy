import domain.CustomerCard;
import operations.CustomerCardService;
import repository.InMemoryRepository;
import repository.SystemRepository;
import ui.CustomerCardConsole;

public class Main {
    public static void main(String[] args) {
        SystemRepository<CustomerCard> customerCardSystemRepository = new InMemoryRepository<>();
        CustomerCardService customerCardService = new CustomerCardService(customerCardSystemRepository);
        CustomerCardConsole customerCardConsole = new CustomerCardConsole(customerCardService);
        customerCardConsole.runMenu();
    }
}