package org.kyungmin0729.models.chat;

import org.kyungmin0729.commons.CommonException;
import org.springframework.http.HttpStatus;

public class RoomNotFoundException extends CommonException {
    public RoomNotFoundException() {
        super(errors.getString("NotFound.room"), HttpStatus.NOT_FOUND);
    }
}