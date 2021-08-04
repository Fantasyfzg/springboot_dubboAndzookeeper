package com.fzg.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;


@Service //springframework.stereotype.Service
public interface UserService {

    //想拿到票,要去注册中心拿
    @Reference
    TicketService ticketService = null;
    public default void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到了一张票=>" + ticket);
    }

}
