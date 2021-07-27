package com.github.manimovassagh.test;

import com.bethecoder.ascii_table.ASCIITable;
import com.github.manimovassagh.models.buldings.RoomType;
import com.github.manimovassagh.models.buldings.SingleDouble;

class JavaConsoleTableExample {

    public static void main(String[] args) {

        //String [] tableHeadersOriginal = { "Employee Name", "Salary", "Designation","Department"};
       String [] tableHeaders = { "Room Number", "Single/Double", "Normal/VIP","Price","Reservation Status"};

        String[][] tableData = {
                { "1", SingleDouble.DOUBLEROOM.toString(), RoomType.VIP.toString(), "90","Reserved"},
                { "1", SingleDouble.DOUBLEROOM.toString(), RoomType.VIP.toString(), "90","Reserved"},
                { "1", SingleDouble.DOUBLEROOM.toString(), RoomType.NORMAL.toString(), "100","Not Reserved"},
                { "1", SingleDouble.DOUBLEROOM.toString(), RoomType.VIP.toString(), "120","Not Reserved"},
                { "1", SingleDouble.DOUBLEROOM.toString(), RoomType.VIP.toString(), "90","Reserved"},
                { "1", SingleDouble.DOUBLEROOM.toString(), RoomType.VIP.toString(), "90","Reserved"}

        };

        ASCIITable.getInstance().printTable(tableHeaders, tableData);
    }
}