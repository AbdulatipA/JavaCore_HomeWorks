package org.example.CollectionsHomeWorks.List.Task3;

public class Ticket {
    private String cityDeparture;
    private String cityArrival;
    private String fullName;


    public Ticket(String cityDeparture, String cityArrival, String fullName) {
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.fullName = fullName;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }
    public void setCityDeparture(String cityDeparture) {
        this.cityDeparture = cityDeparture;
    }
    public String getCityArrival() {
        return cityArrival;
    }
    public void setCityArrival(String cityArrival) {
        this.cityArrival = cityArrival;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Ticket: " + "отправление = " + cityDeparture + ", прибытие = " + cityArrival + ", ФИО = " + fullName;
    }
}
