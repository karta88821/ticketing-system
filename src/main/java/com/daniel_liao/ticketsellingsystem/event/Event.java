package com.daniel_liao.ticketsellingsystem.event;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.daniel_liao.ticketsellingsystem.ticket.Seat;
import com.daniel_liao.ticketsellingsystem.ticket.Ticket;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Event implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Date date;

    @OneToMany(mappedBy = "event")
    private List<Seat> seats;

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;
}