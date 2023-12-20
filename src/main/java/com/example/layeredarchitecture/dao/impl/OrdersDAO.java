package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.util.CrudUtil;

import java.sql.SQLException;

public interface OrdersDAO extends CrudUtil<OrderDTO> {
    String generateNewId() throws SQLException, ClassNotFoundException;

    boolean isExists(String orderId) throws SQLException, ClassNotFoundException;
}
