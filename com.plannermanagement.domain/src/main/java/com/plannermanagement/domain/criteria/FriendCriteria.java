package com.plannermanagement.domain.criteria;

import com.plannermanagement.domain.enums.AnimicStateEnum;
import com.plannermanagement.domain.enums.CercanyLevelEnum;
import lombok.Builder;
import lombok.Data;

/**
 * This class is used to filter the friends by name, state, level and birthdate.
 * @Data: This annotation is used to generate the getters, setters, toString, equals and hashCode methods.
 * @Builder: This annotation is used to generate the builder pattern for the class.
 */
@Data
@Builder
public class FriendCriteria {
    private String name;
    private AnimicStateEnum state;
    private CercanyLevelEnum level;
    private Integer birthDateMonth;
}
