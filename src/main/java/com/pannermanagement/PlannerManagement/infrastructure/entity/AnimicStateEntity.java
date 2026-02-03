package com.pannermanagement.PlannerManagement.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity()
@Table(name = "animic_state")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimicStateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long animicStateId;
    @ManyToOne()
    @JoinColumn(name="friend_id")
    public String friendId;
    public Date date;
    public String state;
    public String note;

}
