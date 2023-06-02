package com.example.washmachine.entities;

import com.example.washmachine.enums.WashMode;
import com.example.washmachine.enums.WashState;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.Duration;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "washing_machines")
public class WashMachine extends Appliance {

    @Column(name = "wash_spin")
    private int spin = 0;

    @Column(name = "temperature")
    private int temp = 0;

    @Column(name = "state")
    private WashState state = WashState.STOPPED;

    @Column(name = "wash_mode")
    private WashMode mode = null;

    @Column(name = "start_date")
    private Date startDate = null;

    @Column(name = "wash_duration")
    private Duration duration = Duration.ZERO;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WashMachine that = (WashMachine) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
