package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.custom.ItemDAOImpl;
import com.example.layeredarchitecture.dao.impl.CustomerDAO;
import com.example.layeredarchitecture.dao.impl.ItemDAO;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.util.SQLUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo {
    ItemDAO itemDAO=new ItemDAOImpl();
    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(id);
    }

    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    @Override
    public boolean isExists(String id) throws SQLException, ClassNotFoundException {
       return itemDAO.isExists(id);
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return generateNewId();
    }

    @Override
    public ItemDTO search(String newItemCode) throws SQLException, ClassNotFoundException {
        return itemDAO.search(newItemCode);
    }
}
