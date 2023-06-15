package com.dougie.api.common;

public class CommonCode {
    public class ResponseCodeAndMessage {
        public static final String SUCCESS = "200";
        public static final String SUCCESS_MSG = "Success";
    }

    public class UrlPath {
        public static final String BASE_PATH = "/api/v1";
        public static final String EXAMPLE_PATH = BASE_PATH + "/example";
        public static final String EXAMPLE_GET_PATH = EXAMPLE_PATH + "/{exampleNo}";
    }
}
