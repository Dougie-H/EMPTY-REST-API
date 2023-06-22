package com.dougie.api.common;

public class CommonCode {
    public class ResponseCodeAndMessage {

        /**
         * Request Success
         */
        public static final String SUCCESS = "200";
        public static final String SUCCESS_MSG = "요청이 완료 되었습니다.";

        /**
         * Request 성공 & 리소스 처리 완료
         */
        public static final String SUCCESS_201 = "201";
        public static final String SUCCESS_MSG_201 = "요청이 정상 처리 되었습니다.";

        /**
         * Bad Request
         */
        public static final String BAD_REQUEST = "400";
        public static final String BAD_REQUEST_MSG = "정상적인 요청이 아닙니다.";

        /**
         * Unauthorized & Forbidden
         */
        public static final String UNAUTHORIZED_AND_FORBIDDEN = "403";
        public static final String UNAUTHORIZED_AND_FORBIDDEN_MSG = "접근 권한이 없는 요청 입니다.";

        /**
         * Not Found
         */
        public static final String NOT_FOUND = "404";
        public static final String NOT_FOUND_MSG = "요청에 대한 리소스를 찾을 수 없습니다.";

        /**
         * Internal Server Error
         */
        public static final String INTERNAL_SERVER_ERROR = "500";
        public static final String INTERNAL_SERVER_ERROR_MSG = "알 수 없는 오류가 발생 하였습니다. 관리자에게 문의 바랍니다.";
    }

    public class UrlPath {
        public static final String BASE_PATH = "/api/v1";

        public static final String USER_PATH = BASE_PATH + "/user";
        public static final String USER_GET_PATH = USER_PATH + "/{usrNo}";
    }
}
