package com.example.hp.recycleradapterwithcardview;

public class Orders {
    private int product_image;
    private String order_no;
    private String description;
    private String date;
    private String time;


    public Orders(){

    }

    public Orders(int product_image, String order_no, String description, String date, String time) {
        this.product_image = product_image;
        this.order_no = order_no;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public int getProduct_image() {
        return product_image;
    }

    public void setProduct_image(int product_image) {
        this.product_image = product_image;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
