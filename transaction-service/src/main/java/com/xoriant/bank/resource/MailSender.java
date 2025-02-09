package com.xoriant.bank.resource;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
@Controller
public class MailSender {

@Autowired	 //k point,
private RabbitTemplate rabbitTemplate;

@Bean
public Queue f1() {
	return new Queue("WithdrawEmailQ",false);
}

public Queue f2() {
	return new Queue("DepositeEmailQ",false);
}

public Queue f3() {
	return new Queue("FUNDTRNASFERQ",false);
}

public Queue f4() {
	return new Queue("balanceEnquiryQ",false);
}
public void sendWithdrawDetails(double amount,int balance) {
	String msg=amount+" Amount withdraw from your account and remaining balanace is "+balance;
	rabbitTemplate.convertAndSend("WithdrawEmailQ", msg);
}
public void sendDepositeDetails(double amount,int balance) {
	String msg=amount+" Amount Deposite in your account and new balanace is"+balance;
}

public void sendFundTransferDetails(double amount,int balance) {
	String msg=amount+" Amount Transfered from your account and remaining balance is"+balance;
}

public void sendBalanceEnquiryDetails(double amount) {
	String msg=" Your account balance is "+amount;
}
}
