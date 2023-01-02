package com.example.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import java.util.Date;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String allotedSeat;
    private int amount;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    UserEntity user;
}
