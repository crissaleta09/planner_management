package com.plannermanagement.domain.model;

import java.util.Date;

public record Meeting(Long meetingId, String friendId, Date date, String time, String location, String note) {
    public Integer getMonthsLastMeeting() {
        Date currentDate = new Date();
        var difference = currentDate.compareTo(date);
        return (int) (difference / (1000L * 60 * 60 * 24 * 30));
    }
}
