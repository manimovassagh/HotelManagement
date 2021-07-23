package com.github.manimovassagh.models.databaseconnection;

import com.github.manimovassagh.models.persons.Guest;

import java.util.ArrayList;
import java.util.List;

public class ReservationData {


    /**
     * make a sample saving in database with JDBC for learning purpose
     *
     * @param guest              shows the guest
     * @param numberOfNightsStay number of nights that guest want to stay in hotel
     * @return array list of name family number of nights stay
     */
    public List<String> generateOutputReservationData(Guest guest, String numberOfNightsStay) {
        List<String> databaseArray = new ArrayList<>();
        databaseArray.add(guest.getName());
        databaseArray.add(guest.getFamily());
        databaseArray.add(numberOfNightsStay);
        return databaseArray;


    }
}
