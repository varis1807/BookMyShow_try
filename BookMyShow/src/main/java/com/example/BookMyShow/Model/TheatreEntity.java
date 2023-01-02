package com.example.BookMyShow.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TheatreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private SeatType seatType;
    private String name;
    private String address;
    private String city;

    @OneToMany(cascade = CascadeType.ALL) //one side relationship
    List<ShowEntity> showEntityList;

    @OneToMany
    List<TheatreSeatEntity> theatreSeatEntities;
}
