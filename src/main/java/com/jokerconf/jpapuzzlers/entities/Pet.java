package com.jokerconf.jpapuzzlers.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Table(name = "pet")
@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = "pet-with-owner",
                attributeNodes = {@NamedAttributeNode("owner")}
        )
})
public class Pet {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @JoinColumn(name = "collar_id")
    @OneToOne
    private Collar collar;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name  + ")";
    }
}