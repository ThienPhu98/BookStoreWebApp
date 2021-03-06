package com.cg.service.cart;

import com.cg.model.Cart;
import com.cg.model.Customer;
import com.cg.service.IGeneralService;

public interface CartService extends IGeneralService<Cart>{

    Cart findCartsByCustomer(Customer customer) ;
}
