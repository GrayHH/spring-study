package com.hui.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东租房子，但是呢，会有附属操作
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
