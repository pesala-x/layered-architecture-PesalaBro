package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.model.CustomerOrderDetailsDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO {
    ArrayList<CustomerOrderDetailsDTO> customerOrderDetails() throws SQLException, ClassNotFoundException;
}
