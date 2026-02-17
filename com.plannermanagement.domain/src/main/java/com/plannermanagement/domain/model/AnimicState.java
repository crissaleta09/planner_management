package com.plannermanagement.domain.model;

import com.plannermanagement.domain.enums.AnimicStateEnum;

public record AnimicState (Long animicStateId, AnimicStateEnum state, String friendId, String date, String note) {

}
