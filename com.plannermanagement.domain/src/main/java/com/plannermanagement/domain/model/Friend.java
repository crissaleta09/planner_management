package com.plannermanagement.domain.model;

import enums.AnimicStateEnum;
import com.plannermanagement.domain.enums.CercanyLevelEnum;

import java.util.Date;

public record Friend(
        String id,
        String name,
        CercanyLevelEnum cercanyLevel,
        AnimicStateEnum animicState,
        Date birthDate) {
    public boolean isCloseFriend() {
        return cercanyLevel == CercanyLevelEnum.MEJOR_AMIGO;
    }

}
