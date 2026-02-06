package com.pannermanagement.PlannerManagement.infrastructure.entity;

import com.pannermanagement.PlannerManagement.infrastructure.model.AnimicStateEnum;
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
    public AnimicStateEnum state;
    @ManyToOne()
    @JoinColumn(name="friend_id")
    public String friendId;
    public Date date;
    public String note;

}
