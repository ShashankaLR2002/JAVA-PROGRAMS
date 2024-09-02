package com.shsh.superchaining;

public class OnlineMarket extends Market {
    private int shops;
    private String type;

    public OnlineMarket(String name, String location, int shops, String type) {
        super(name, location);
        this.shops = shops;
        this.type = type;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Shops: " + shops);
        System.out.println("Type: " + type);
    }
}
