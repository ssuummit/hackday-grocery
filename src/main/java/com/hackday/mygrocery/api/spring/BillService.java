package com.hackday.mygrocery.api.spring;

import java.util.List;


public interface BillService {

    Bill findById(long id);

    void saveBill(Bill bill);

    void updateBill(Bill bill);

    // void deleteBillById(String orderId);

    List<Bill> findALl();

    void deleteAllBill();

    public boolean isBillExist(Bill bill);

}
