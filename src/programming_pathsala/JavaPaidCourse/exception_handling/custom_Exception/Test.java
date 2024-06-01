package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

public class Test {

    public static void main(String[] args) throws IllegalFinancialMatrixException {
        publish(10, 10, 10);
    }

    public static void publish(int revenue, int expenses, int savings) throws IllegalFinancialMatrixException {

        // 1st this part
        if (revenue - expenses != savings) {
            throw new IllegalFinancialMatrixException(
                    "Found revenue :" + revenue +
                            "   expenses :" + expenses +
                            "   and Savings :" + savings +
                            "   and hence not add up");
        }

       /* try{
            thirdParty();
        }catch (Exception e){
            //throw new IllegalFinancialMatrixException(e);
            // OR
            throw new IllegalFinancialMatrixException("Third party error ", e);
        }*/
    }

    public static void thirdParty() throws ThirdPartyException {
        // some code
        throw new ThirdPartyException();
    }
}
