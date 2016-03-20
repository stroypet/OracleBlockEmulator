package client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data_Block {
    
    String HEADER = "header";
    String rowCount = "000";
    String FSP = "000";
    List<Integer> offsets = new ArrayList<Integer>();
    List<Data_Row> datalist = new ArrayList<Data_Row>();
    
    public Data_Block() {
    }
    
    public String selectRow(String sID) {
        String strSelect = HEADER + rowCount + FSP + offsets.toString() + datalist.toString();
        return strSelect;
    }
    
    public void insertRow(Data_Row row) {
        //int offset = HEADER.length() + rowCount.length() + FSP.length() + offsets.Length() + 
        offsets.add(000);
        datalist.add(row);
        //update FPS, rowCount, offsets
    }
    
    public void updateRow(String sID) {
        //update FPS, rowCount stays, offsets?
    }
    
    public void deleteRow(String sID) {
        //update FPS, rowCount, remove entry from list, set offset space to 000
    }
    public String toString() {
        String strData = HEADER + rowCount + FSP + offsets.toString() + datalist.toString();
        return strData;
    }
}
