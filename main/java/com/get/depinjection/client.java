package com.get.depinjection;

public class client implements ClientInterface{
    private serviceA service;
@Override
    public void setService(serviceA service) {
        this.service = service;
    }
    public client(){}

    public void greet(){
        service.sendEmail();
    }
}
