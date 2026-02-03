package com.pannermanagement.PlannerManagement.infrastructure.entity;

import com.pannermanagement.PlannerManagement.infrastructure.model.CercanyLevelEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity()
@Table(name = "friend")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class FriendEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long friendId;
    public String name;
    public String email;
    public Date birthdate;
    @Enumerated(EnumType.STRING)
    public CercanyLevelEnum level;
}
