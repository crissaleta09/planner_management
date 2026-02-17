package com.plannermanagement.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import com.plannermanagement.infrastructure.model.CercanyLevelEnum;

import java.util.Date;

/**
 * This class represents the Friend entity in the database. It is used to store the information of the friends in the database.
 * @Entity: This annotation is used to specify that the class is an entity and is mapped to a database table.
 * @Table: This annotation is used to specify the name of the table in the database.
 * @Getter: This annotation is used to generate the getters for the fields of the class.
 * @Setter: This annotation is used to generate the setters for the fields of the class.
 * @NoArgsConstructor: This annotation is used to generate the no-args constructor for the class.
 * @AllArgsConstructor: This annotation is used to generate the all-args constructor for the class.
 * @EqualsAndHashCode: This annotation is used to generate the equals and hashCode methods for the class. The onlyExplicitlyIncluded = true parameter is used to specify that
 */
@Entity()
@Table(name = "friend")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // sirve para evitar que se incluyan todos los campos en la comparación de igualdad, lo que puede ser problemático si hay campos que no son relevantes para la identidad del objeto o si hay campos que pueden cambiar con el tiempo. Al usar onlyExplicitlyIncluded = true, solo se incluirán en la comparación de igualdad los campos que estén anotados con @EqualsAndHashCode.Include, lo que permite un control más preciso sobre qué campos se consideran para determinar si dos objetos son iguales.
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
