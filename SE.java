package com.mycompany.se;

import java.time.*;

public class SE {

    public static class User {
        private int id;
        private String name, email, password, phone, carPlate, type;

        public User(int id, String name, String email, String password, String phone, String carPlate, String type) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
            this.phone = phone;
            this.carPlate = carPlate;
            this.type = type;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }
        public String getCarPlate() { return carPlate; }
        public void setCarPlate(String carPlate) { this.carPlate = carPlate; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public void show() {
            System.out.println("User[" + id + "] " + name + " (" + email + ") - " + type);
        }
    }

    public static class ParkingSpot {
        private int id;
        private String location, features;
        private boolean available;

        public ParkingSpot(int id, String location, boolean available, String features) {
            this.id = id;
            this.location = location;
            this.available = available;
            this.features = features;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }
        public boolean isAvailable() { return available; }
        public void setAvailable(boolean available) { this.available = available; }
        public String getFeatures() { return features; }
        public void setFeatures(String features) { this.features = features; }

        public void show() {
            System.out.println("Spot[" + id + "] at " + location + " - Available: " + available);
        }
    }

    public static class Reservation {
        private int id, userId, spotId;
        private LocalDate date;
        private LocalTime start, end;
        private String status, qr;

        public Reservation(int id, int userId, int spotId, LocalDate date,
                            LocalTime start, LocalTime end, String status, String qr) {
            this.id = id;
            this.userId = userId;
            this.spotId = spotId;
            this.date = date;
            this.start = start;
            this.end = end;
            this.status = status;
            this.qr = qr;
        }
    }

    public static class Notification {
        private int id, userId;
        private String msg, type;
        private LocalDateTime sent;

        public Notification(int id, int userId, String msg, LocalDateTime sent, String type) {
            this.id = id;
            this.userId = userId;
            this.msg = msg;
            this.sent = sent;
            this.type = type;
        }
    }

    public static class Feedback {
        private int id, userId;
        private String msg;
        private LocalDateTime time;
        private boolean anonymous;

        public Feedback(int id, int userId, String msg, LocalDateTime time, boolean anonymous) {
            this.id = id;
            this.userId = userId;
            this.msg = msg;
            this.time = time;
            this.anonymous = anonymous;
        }
    }

    public static class AdminLog {
        private int id, adminId;
        private String action;
        private LocalDateTime time;

        public AdminLog(int id, int adminId, String action, LocalDateTime time) {
            this.id = id;
            this.adminId = adminId;
            this.action = action;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        User u = new User(1, "haifa", "haifa@mail.com", "202000", "054779", "AAA1234", "Customer");
        ParkingSpot p = new ParkingSpot(10, "A", true, "None");
        u.show();
        p.show();
    }
}