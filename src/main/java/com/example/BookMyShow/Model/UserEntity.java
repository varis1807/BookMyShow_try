package com.example.BookMyShow.Model;

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
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // bidirectional;
    TicketEntity ticket;
}

// n = length array int
// 2 1 3
// sum(i*arr[i]) -=
