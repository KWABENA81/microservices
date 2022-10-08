package com.asksef.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public record CustomerService() {

    //  private final CustomerRepository customerRepository;
//    private final FraudClient fraudClient;
//    private final RabbitMQMessageProducer rabbitMQMessageProducer;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
//        // todo: check if email valid
//        // todo: check if email not taken
//        customerRepository.saveAndFlush(customer);
//
//        FraudCheckResponse fraudCheckResponse =
//                fraudClient.isFraudster(customer.getId());
//
//        if (fraudCheckResponse.isFraudster()) {
//            throw new IllegalStateException("fraudster");
//        }

//        NotificationRequest notificationRequest = new NotificationRequest(
//                customer.getId(),
//                customer.getEmail(),
//                String.format("Hi %s, welcome to Amigoscode...",
//                        customer.getFirstName())
//        );
//        rabbitMQMessageProducer.publish(
//                notificationRequest,
//                "internal.exchange",
//                "internal.notification.routing-key"
//        );

        // }
    }
//public record CustomerService(CustomerRepository customerRepository) {
//    public void registerCustomer(CustomerRegistrationRequest request) {
//        Customer customer = Customer.builder()
//                .firstName(request.firstName())
//                .lastName(request.lastName())
//                .email(request.email()).build();
//
//        customerRepository.save(customer);
//    }
}
