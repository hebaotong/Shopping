package com.shopping.dao;

import com.shopping.entity.ShoppingRecord;

import java.util.List;

public interface ShoppingRecordDao {
    public ShoppingRecord getShoppingRecord(int userId, int productId,String time);

    public void addShoppingRecord(ShoppingRecord shoppingRecord);

    public boolean deleteShoppingRecord(int userId,int productId);

    public boolean updateShoppingRecord(ShoppingRecord shoppingRecord);

    public List<ShoppingRecord> getShoppingRecords(int userId);

    public List<ShoppingRecord> getAllShoppingRecords();

    public List<ShoppingRecord> getShoppingRecordsByOrderStatus(int orderStatus);

    public boolean getUserProductRecord(int userId,int productId);
}
