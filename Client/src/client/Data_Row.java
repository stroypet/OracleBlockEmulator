package client;

import java.text.DecimalFormat;

public class Data_Row {
    String sID;
    String firstName;
    String lastName;
    String numCols;
    String length1;
    String length2;
    String length3;
    public Data_Row(String input1, String input2, String input3) {
        sID = input1;
        length1 = Integer.toString(sID.length());
        firstName = input2;
        length2 = Integer.toString(firstName.length());
        lastName = input3;
        length3 = Integer.toString(lastName.length());
        numCols = "003";
    }
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("000");
        String length1Formatted = formatter.format(Integer.parseInt(length1));
        String length2Formatted = formatter.format(Integer.parseInt(length2));
        String length3Formatted = formatter.format(Integer.parseInt(length3));
        String strDataRow = numCols + length1Formatted + sID + length2Formatted + firstName + length3Formatted + lastName;
        return strDataRow;
    }
}
