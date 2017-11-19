package com.ua.LabWork2.LabWork27;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumbe;

    public Device(){

    }

    public Device(String manufacturer, float price, String serialNumbe) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumbe = serialNumbe;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumbe() {
        return serialNumbe;
    }

    public void setSerialNumbe(String serialNumbe) {
        this.serialNumbe = serialNumbe;
    }

    @Override
    public String toString() {
        return  "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumbe='" + serialNumbe + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device.manufacturer) : device.manufacturer != null)
            return false;
        return serialNumbe != null ? serialNumbe.equals(device.serialNumbe) : device.serialNumbe == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumbe != null ? serialNumbe.hashCode() : 0);
        return result;
    }
}
