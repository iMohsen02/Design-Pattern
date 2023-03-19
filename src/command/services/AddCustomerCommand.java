package command.services;

import command.pattern.Command;

public class AddCustomerCommand implements Command {

    CustomerService service;

    public AddCustomerCommand(CustomerService customerService) {
        this.service = customerService;
    }
    @Override
    public void execute() {
        this.service.addCustomer();
    }
}
