package com.get.depinjection;

public class Injector {
    public static void main(String[] args){
        serviceA service =new serviceA();
        client client = new client();
        client.setService(service);
        client.greet();

    }
}
