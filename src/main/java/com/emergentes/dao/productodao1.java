
package com.emergentes.dao;

import com.emergentes.modelo.paginaprincipal;
import com.emergentes.utiles.conexion_bd;
import java.sql.PreparedStatement;
import java.util.List;


public class productodao1  extends conexion_bd implements ProductoDao {

        @Override
    public void insert(paginaprincipal producto2) throws Exception {
      String sql = "insert into producto1(descripcion,cantidad, precio, categoria) values (?,?,?,?)";
        this.conectar();
       PreparedStatement ps = this.conn.prepareStatement(sql);
      

    @Override
    public void update(paginaprincipal producto2) throws Exception {
       
    }

    @Override
    public void delete(int id) throws Exception {
      
    }

    @Override
    public List<paginaprincipal> getAll() throws Exception {
     
    }

    @Override
    public paginaprincipal getById(int id) throws Exception {
       
    }

    
}
