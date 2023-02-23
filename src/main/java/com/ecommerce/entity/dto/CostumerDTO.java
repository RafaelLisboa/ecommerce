package com.ecommerce.entity.dto;

import com.ecommerce.entity.Customer;
import com.ecommerce.entity.Purchase;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Builder
@Data
public class CostumerDTO {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private List<Purchase> purchases;


    public Customer toEntity() {
        Customer customer = new Customer();
        customer.setId(this.id);
        customer.setName(this.name);
        customer.setEmail(this.email);
        customer.setPhoneNumber(this.phoneNumber);
        customer.setPurchases(this.purchases);

        return customer;
    }


}
