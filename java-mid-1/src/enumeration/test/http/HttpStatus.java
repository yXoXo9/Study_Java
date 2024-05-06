package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK")
    , BAD_REQUEST(400, "Bad Request")
    , NOT_FOUND(404, "Not Found")
    , INTERNAL_SERVER_ERROR(500, "Internal Server Error")
    // , NULL(500, "Internal Server Error")
    ;

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int i) {
        // HttpStatus[] values = HttpStatus.values();

        for (HttpStatus value : values()) {
            // if(value.code == i){
            if(value.getCode() == i){
                return value;
            }
        }

        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return (this.code >= 200 && this.code < 300);
    }
}
