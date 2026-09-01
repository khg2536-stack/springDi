package com.oraclejava.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@SpringBootApplication
public class TaxApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(TaxApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        System.out.print("상품 가격을 입력하세요: ");
        int price = scanner.nextInt();

        TaxService taxService = ctx.getBean("taxService", TaxService.class);

        taxService.calculate(price);

        scanner.close();
        ctx.close();
    }

}

@Service
class TaxService {
    public void calculate(int price) {
    }
}