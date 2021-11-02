package edu.kea.paintings.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name="artists")
@Entity
public class Artist {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String primaryStyle;

    @Column(length = 100)
    private String nationality;

    @Column
    private Date birthDate;

    @Enumerated(value = EnumType.STRING)
    @Column
    private Gender gender;

    @Column
    private String image;

    @ManyToOne
    @JoinColumn(name = "gallery_id")
    @Nullable
    private Gallery gallery;

    @JsonIgnore
    @ManyToMany(mappedBy = "artists", fetch = FetchType.LAZY)
    private List<Painting> paintings;

}
