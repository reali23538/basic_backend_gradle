package com.basic.backend.user.domain;

import lombok.*;

import java.util.Date;

public class UserDto {

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    @Setter
    public static class UserAddReq {

        private String id;

        private String password;

        private String name;

        private String phone;

        private String email;

    }

    @Builder
    @Getter
    @Setter
    public static class UserAddRes {

        private Long userSeq;

        private String id;

        private String password;

    }

    @Builder
    @Getter
    @Setter
    public static class  UserRes {

        private String id;

        private String name;

        private String phone;

        private String email;

        private Date createDate;

    }

}