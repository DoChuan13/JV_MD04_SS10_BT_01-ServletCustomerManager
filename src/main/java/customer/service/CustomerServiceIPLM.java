package customer.service;

import customer.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceIPLM implements ICustomerService {
    private static final List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "Mai Văn Hoàn", LocalDate.of(1983, 8, 20), "Hà Nội", "Image 01"));
        customerList.add(new Customer(2, "Nguyễn Văn Nam", LocalDate.of(1983, 8, 21), "Bắc Giang", "Image 02"));
        customerList.add(new Customer(3, "Nguyễn Thái Hòa", LocalDate.of(1983, 8, 22), "Nam Định", "Image 03"));
        customerList.add(new Customer(4, "Trần Đăng Khoa", LocalDate.of(1983, 8, 17), "Hà Tây", "Image 04"));
        customerList.add(new Customer(5, "Nguyễn Đình Thi", LocalDate.of(1983, 8, 19), "Hà Nội", "Image 05"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        Customer currentCustomer = findById(customer.getId());
        if (currentCustomer == null) {
            customerList.add(customer);
        } else {
            int index = customerList.indexOf(currentCustomer);
            customerList.set(index, customer);
        }
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        Customer currentCustomer = findById(id);
        if (currentCustomer != null) {
            customerList.remove(currentCustomer);
        }
    }
}
