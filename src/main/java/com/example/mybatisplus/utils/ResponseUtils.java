package com.example.mybatisplus.utils;

/**
 * @author xiaolang
 * @version 1.0.0
 */
public class ResponseUtils {

    public static <T> Response<T> getSuccessJson(T data){
        return new Response<T>("0000",data,"success");
    }
    public static <T> String getErrorJson(String code,String message){
        return JsonUtils.toJson(new Response<T>(code,message));
    }
    public static Response toObject(String result){
        Response response = JsonUtils.toObject(result, Response.class);
        return response;
    }
    public static void main(String[] args) {
        System.out.println(ResponseUtils.getSuccessJson("ddd"));
    }
    public static class Response<T>
    {
        private String code;
        private T data;
        private String message;

        public Response() {

        }

        public Response(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public Response(String code, T data, String message) {
            this.code = code;
            this.data = data;
            this.message = message;
        }

        public Response(T data) {
            this.data = data;

        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
