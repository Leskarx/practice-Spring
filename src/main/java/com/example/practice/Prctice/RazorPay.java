package com.example.practice.Prctice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component

public class RazorPay implements PaymentServices  {
   
    
    public String pay() {
        // TODO Auto-generated method stub
        return "payment from Razorpay";
    }

    
}
