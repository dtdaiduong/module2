package com.duong.inheritanc.demoBaiGiang;

public class Geometric {
    /* các trường dữ liệu */
    protected String color = "white";
    private String filled = null;
    private String password = null;

    /* các khởi tạo tử */
    public Geometric() {
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean passwordMatch(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /* các thuộc tính */
    public final String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}
