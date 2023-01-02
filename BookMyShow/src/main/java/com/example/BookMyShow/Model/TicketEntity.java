package com.example.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String allocateSeat;
    private int amount;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn //(name = "user_id") // F.K.
    @JsonIgnore // don't write in json its automatically incremented
    UserEntity user;
}
