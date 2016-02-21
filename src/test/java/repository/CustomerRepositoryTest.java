package repository;

import main.Application;
import model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;

import java.util.List;

/**
 * Created by roshane on 2/20/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testNonNullCustomerRepository() throws Exception {
        Assert.assertNotNull(customerRepository);
    }

    @Test
    public void testFindAllCustomers() throws Exception {
        Iterable<Customer> customers = customerRepository.findAll();
        Assert.assertNotNull(customers.iterator().next());
    }

    @Test
    public void testFindCustomerByFirstName() throws Exception {
        List<Customer> customers = customerRepository.findByFirstName("Tarik");
//        Assert.assertEquals("Tarik", customer.getFirstName());
    }
}