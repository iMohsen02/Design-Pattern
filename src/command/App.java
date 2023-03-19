package command;

import command.pattern.Bottom;
import command.services.AddCustomerCommand;
import command.services.CustomerService;

public class App {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        AddCustomerCommand customerCommand = new AddCustomerCommand(customerService);
        Bottom buttom = new Bottom(customerCommand);
        buttom.click();
    }
}
