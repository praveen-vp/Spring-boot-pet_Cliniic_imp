package com.vp.springboot.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    LocalDate date;

    @Column(name = "description")
    String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    Pet pet;
}
