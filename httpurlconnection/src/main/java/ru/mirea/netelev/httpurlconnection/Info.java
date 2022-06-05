package ru.mirea.netelev.httpurlconnection;

public class Info {
    private String ip;
    private String city;
    private String country;

    public Info(String ip, String city, String country) {
        this.ip = ip;
        this.city = city;
        this.country = country;
    }

    public String getIp() {
        return ip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
