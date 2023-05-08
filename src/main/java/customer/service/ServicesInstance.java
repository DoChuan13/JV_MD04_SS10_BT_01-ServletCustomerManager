package customer.service;

public class ServicesInstance {
    /**
     * Declare static Object
     */
    private static ServicesInstance instance = null;

    /**
     * Detail Properties and Methods
     */
    private final ICustomerService customerService = new CustomerServiceIPLM();

    public ServicesInstance() {
    }

    /**
     * Method Create Object by Singleton (Object reference to only one Memory Address)
     */
    public static ServicesInstance getInstance() {
        if (instance == null) instance = new ServicesInstance();
        return instance;
    }

    public ICustomerService getCustomerService() {
        return customerService;
    }
}
