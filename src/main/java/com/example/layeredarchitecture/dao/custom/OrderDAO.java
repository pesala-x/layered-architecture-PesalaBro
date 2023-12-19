package com.example.layeredarchitecture.dao.custom;


import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO {
     String generateOID() throws SQLException, ClassNotFoundException;
     boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
//     boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;
}
