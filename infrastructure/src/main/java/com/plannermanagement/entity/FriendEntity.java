package com.plannermanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import com.plannermanagement.model.CercanyLevelEnum;

import java.util.Date;

@Entity()
@Table(name = "friend")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // Solo se incluyen los campos que se consideren relevantes para la igualdad, en este caso, el friendId.
public class FriendEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include // Se incluye el friendId en la comparación de igualdad.
    public Long friendId;
    public String name;
    public String email;
    public Date birthdate;
    @Enumerated(EnumType.STRING)
    public CercanyLevelEnum level;
}
