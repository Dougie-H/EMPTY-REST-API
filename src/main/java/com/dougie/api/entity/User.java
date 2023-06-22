package com.dougie.api.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "tb_user")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 8147228348717832401L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private String usrId;
    private String usrNm;
    private String usrPw;
    private String delYn;

    @Builder
    public User(String usrId, String usrPw) {
        this.usrId = usrId;
        this.usrPw = usrPw;
    }
}
