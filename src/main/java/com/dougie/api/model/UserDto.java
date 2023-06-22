package com.dougie.api.model;

import com.dougie.api.entity.User;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
public class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 9054025289018770254L;

    private Long idx;

    @NotNull(message = "usrId 항목은 필수값 입니다.")
    private String usrId;

    @NotNull(message = "usrNm 항목은 필수값 입니다.")
    private String usrNm;

    public static UserDto fromEntity(User usr) {
        return UserDto.builder()
                .idx(usr.getIdx())
                .usrNm(usr.getUsrNm())
                .usrId(usr.getUsrId())
                .build();
    }
}
