package com.emergentes.dao;

import com.emergentes.modelo.paginaprincipal;
import java.util.List;

public interface ProductoDao {
    public void insert(paginaprincipal producto2) throws Exception;
    public void update(paginaprincipal producto2) throws Exception;
    public void delete(int id ) throws Exception;
    public List<paginaprincipal> getAll() throws Exception;
    public paginaprincipal getById(int id) throws Exception;
    
}

