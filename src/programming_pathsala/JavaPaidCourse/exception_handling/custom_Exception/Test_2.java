package programming_pathsala.JavaPaidCourse.exception_handling.custom_Exception;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Test_2 {

    public static void main(String[] args) throws IllegalFinancialMatrixException {
        try {
            thirdParty(34);
        } catch (ThirdPartyException e) {// handling child type first
            throw new IllegalFinancialMatrixException(e);
        } catch (FileNotFoundException|EOFException e) {
            System.out.println("Handeling gracefully ");
        } catch (Exception e) { // handling parent type later , otherwise compile time error
            e.printStackTrace();
        }
    }

    public static void thirdParty(int i) throws ThirdPartyException, FileNotFoundException, EOFException {
        // some code
        if (i == 1)
            throw new ThirdPartyException();
        else if(i>30)
            throw new EOFException();
        throw new FileNotFoundException();

    }
}
