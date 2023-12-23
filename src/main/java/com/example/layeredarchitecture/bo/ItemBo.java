package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.util.SQLUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;
    boolean delete(String id) throws SQLException, ClassNotFoundException;
    boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean isExists(String id) throws SQLException, ClassNotFoundException;
    String generateNewId() throws SQLException, ClassNotFoundException;
    public ItemDTO search(String newItemCode) throws SQLException, ClassNotFoundException;

}
