package kr.co.pcninc.ecoes.api.common;

public class CommonCode {
    public class Code {
        public static final String SUCCESS = "200";
        public static final String SUCCESS_MSG = "SUCCESS";
        public static final String FAIL = "400";
        public static final String FAIL_MSG = "FAIL";
        public static final String DB_ERROR = "500";
        public static final String DB_ERROR_MSG = "DB_ERROR";
    }

    public class UrlPath {
        public static final String BASE_PATH = "/api/v1";
        public static final String TEST_PATH = BASE_PATH + "/test";
    }
}
