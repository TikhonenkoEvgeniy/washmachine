package com.example.washmachine.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "appliances")
@Inheritance(strategy = InheritanceType.JOINED)
public class Appliance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "is_on")
    private boolean on;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Appliance appliance = (Appliance) o;
        return getId() != null && Objects.equals(getId(), appliance.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
