package com.example.perm2.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    String ID;
    LocalDateTime enter;
    LocalDateTime leave;
    public Car(String ID,LocalDateTime enter){
        this.ID = ID;
        this.enter = enter;
    }
    public void leave(){
        LocalDateTime leave = LocalDateTime.now();
        this.leave = leave;
    }
    public void setLeave(LocalDateTime leave){
        if (leave.isAfter(enter)){
            this.leave = leave;
        }
    }
    public long getDuration(){
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }

}
