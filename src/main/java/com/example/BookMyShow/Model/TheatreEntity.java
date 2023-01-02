package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private SeatType seatType;// two values classic or premium
    private String name;
    private String address;
    private String city;

    @OneToMany(cascade = CascadeType.ALL)
    List<ShowEntity> showEntityList;

    @OneToMany(cascade = CascadeType.ALL)
    List<TheatreSeatEntity> theatreSeatEntities;
}
