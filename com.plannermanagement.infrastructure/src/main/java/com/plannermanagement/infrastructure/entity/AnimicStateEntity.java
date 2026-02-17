package com.plannermanagement.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.plannermanagement.infrastructure.model.AnimicStateEnum;

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

    @Enumerated(EnumType.STRING)
    public AnimicStateEnum state;

    @ManyToOne()
    @JoinColumn(name="friend_id")
    public FriendEntity friendId;

    public Date date;
    public String note;

}
