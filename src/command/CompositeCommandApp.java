package command;

import command.services.AddCustomerCommand;
import command.services.CompositeCommand;
import command.services.CustomerService;

public class CompositeCommandApp {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        AddCustomerCommand customerCommand = new AddCustomerCommand(customerService);
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(customerCommand);
        compositeCommand.addCommand(customerCommand);

        compositeCommand.execute();
    }
}
