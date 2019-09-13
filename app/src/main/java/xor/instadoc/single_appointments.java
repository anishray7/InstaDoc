package xor.instadoc;

public class single_appointments {

    private String date,time,name,field,hospital,address,contact;

    public single_appointments(String date, String time, String name, String field, String hospital, String address, String contact) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.field = field;
        this.hospital = hospital;
        this.address = address;
        this.contact = contact;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public String getHospital() {
        return hospital;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

}
