package com.company;

class Store {
    private String product, location;
    private int openingYear;

    public Store() {
        product = "";
        location = "";
        openingYear = 2021;
    }

    public Store(String product, String location) {
        this.product = product;
        this.location = location;
        openingYear = 2021;
    }

    public Store(String product, String location, int openingYear) {
        this.product = product;
        this.location = location;
        this.openingYear = openingYear;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }

    @Override
    public String toString() {
        return "Store{" +
                "product='" + product + '\'' +
                ", location='" + location + '\'' +
                ", openingYear=" + openingYear +
                '}';
    }

    public boolean isNewStore() {
        return openingYear >= 2021;
    }


}