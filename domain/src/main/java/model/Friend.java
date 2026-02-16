package model;

import enums.AnimicStateEnum;
import enums.CercanyLevelEnum;

public record Friend(
        String id,
        String name,
        CercanyLevelEnum cercanyLevel,
        AnimicStateEnum animicState) {
    public boolean isCloseFriend() {
        return cercanyLevel == CercanyLevelEnum.MEJOR_AMIGO;
    }

}
