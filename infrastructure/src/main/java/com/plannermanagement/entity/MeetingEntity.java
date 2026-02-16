package com.plannermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity()
@Table(name = "meeting")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeetingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long meetId;
    @ManyToOne()
    @JoinColumn(name="friend_id")
    public FriendEntity friendId;
    public Date date;
    public String type;
    public String description;

}
