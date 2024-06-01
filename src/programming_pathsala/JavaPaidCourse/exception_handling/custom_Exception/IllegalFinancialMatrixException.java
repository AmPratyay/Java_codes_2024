package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

public class IllegalFinancialMatrixException extends Exception {

    String message;

    public IllegalFinancialMatrixException(String message) {
        super(message);
        this.message = message;
    }

    public IllegalFinancialMatrixException() {

    }

    public IllegalFinancialMatrixException(Throwable e) {
        super(e);
    }

    public IllegalFinancialMatrixException(String errorMsg, Throwable e) {
        super(errorMsg, e);
    }
}
