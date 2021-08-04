package com.fzg.service;

import org.springframework.stereotype.Component;

@Component
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "《如何成为百万富翁》";
    }
}
