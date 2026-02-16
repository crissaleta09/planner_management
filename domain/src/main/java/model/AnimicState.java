package model;

import enums.AnimicStateEnum;

public record AnimicState (Long animicStateId, AnimicStateEnum state, String friendId, String date, String note) {

}
