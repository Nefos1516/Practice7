package ru.mirea.netelev.httpurlconnection;

public class Info {
    private final String ip;
    private final String city;
    private final String country;

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
