package com.digital.crud.saladereuniao.saladereuniao.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="meatingroom")
public class Room {

    @Id
    private long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;
}
