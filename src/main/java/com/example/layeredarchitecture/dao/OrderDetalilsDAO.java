package com.example.layeredarchitecture.dao;
import com.example.layeredarchitecture.model.OrderDetailDTO;
import java.sql.SQLException;

public interface OrderDetalilsDAO {
    boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
}
