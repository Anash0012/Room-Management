package com.example.Hotel__Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Room {

    @Id
    private Integer roomNo;

    private Double roomPrice;

    private RoomType roomType;

    private Boolean roomAvailable;
}
