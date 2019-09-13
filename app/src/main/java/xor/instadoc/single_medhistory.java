package xor.instadoc;

public class single_medhistory {

    private String hospitall, doctor, history, medicines, medicinesInfo, tests, testsInfo, date, time, booking, bookingInfo;

    public single_medhistory(String hospitall, String doctor, String history, String medicines, String medicinesInfo, String tests, String testsInfo, String date, String time, String booking, String bookingInfo) {
        this.hospitall = hospitall;
        this.doctor = doctor;
        this.history = history;
        this.medicines = medicines;
        this.medicinesInfo = medicinesInfo;
        this.tests = tests;
        this.testsInfo = testsInfo;
        this.date = date;
        this.time = time;
        this.booking = booking;
        this.bookingInfo = bookingInfo;
    }

    public String getHospitall() {
        return hospitall;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getHistory() {
        return history;
    }

    public String getMedicines() {
        return medicines;
    }

    public String getMedicinesInfo() {
        return medicinesInfo;
    }

    public String getTests() {
        return tests;
    }

    public String getTestsInfo() {
        return testsInfo;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getBooking() {
        return booking;
    }

    public String getBookingInfo() {
        return bookingInfo;
    }
}
