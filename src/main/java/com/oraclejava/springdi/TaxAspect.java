package com.oraclejava.springdi;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TaxAspect {
    private int price;

    @Before(
            value = "execution(* com.oraclejava.springdi.TaxService.calculate(..)) && args(price)",
            argNames = "price"
    )

    public void beforeTax(int price) {
        this.price = price;

        int tax = (int) (price * 0.1);

        System.out.println("===== 세금 계산 =====");
        System.out.println("상품 가격: " + price + "원");
        System.out.println("세금: " + tax + "원");
        System.out.println("====================");
    }
}
