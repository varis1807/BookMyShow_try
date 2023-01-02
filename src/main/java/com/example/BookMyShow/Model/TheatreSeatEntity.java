package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TheatreSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNumber;
    private SeatType seatType;
    private int rate;

    @ManyToOne
    TheatreEntity theatreEntity;
}
