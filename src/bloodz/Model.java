/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author ShirasagiHimegimi
 */
public class Model {
    private static final String dv = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1:3307/bloodz";
    private static final String user = "root";
    private static final String pw = "";
    
    public static final String[] arrResult(String query){
        String[] result = null;
        try {
            Class.forName(dv);
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs;
            
            rs = stmt.executeQuery(query);
            int col=0;

            col = rs.getMetaData().getColumnCount();
            rs = stmt.executeQuery(query);
            result = new String[col];
            
            while (rs.next()) {
                for (int j = 1; j <= col; j++) {
                    result[j-1] = rs.getString(j);
                }
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();

        } 
        return result;
    }
    
    
    public static final String stringResult(String query){
        String result = "";
        try {
            Class.forName(dv);
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.last()){
                result = rs.getString(1);
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();

        }
        
        return result;
    }
    
     public static final String[][] arr2Result(String query){
        String[][] result = null;
        try {
            Class.forName(dv);
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs;
            
            rs = stmt.executeQuery(query);
            int row=0,col=0, i=0;
            if(rs!=null){
                rs.last();
                row=rs.getRow();
            }
            col = rs.getMetaData().getColumnCount();
            rs = stmt.executeQuery(query);
            result = new String[row][col];
            
            while (rs.next()) {
                for (int j = 1; j <= col; j++) {
                    result[i][j-1] = rs.getString(j);
                }
                i++;
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        return result;
    }
    public static final ArrayList arrLi2Result(String query){
        ArrayList<ArrayList> result = new ArrayList<>();
        try {
            Class.forName(dv);
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs;
            
            rs = stmt.executeQuery(query);
            int row=0,col=0, i=0;
            if(rs!=null){
                rs.last();
                row=rs.getRow();
            }
            col = rs.getMetaData().getColumnCount();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                result.add(new ArrayList<String>());
                for (int j = 1; j <= col; j++) {
                    result.get(i).add(rs.getString(j));
                }
                i++;
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        
        return result;
    }
    public static final boolean updOrIns(String query){
        boolean x=false;
        try {
            Class.forName(dv);
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate(query);
            con.close();
            x=true;
        } catch (ClassNotFoundException | SQLException e) {
            if(e instanceof SQLIntegrityConstraintViolationException) {
                 e.printStackTrace();
            }else{
                 e.printStackTrace();
            }
            x=false;
        }
        return x;
    }
    public static final boolean delete(String table,String key,String id){
        boolean x=false;
        try {
            Class.forName(dv);
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.execute("DELETE FROM "+table+" WHERE "+key+" = '"+id+"'");
            con.close();
            x=true;
        } catch (ClassNotFoundException | SQLException e) {
            if(e instanceof SQLIntegrityConstraintViolationException) {
                 e.printStackTrace();
            }else{
                 e.printStackTrace();
            }
            x=false;
        }
        return x;
    }
    
    public static final boolean auth(String u,String p){
        return !Model.stringResult("SELECT id_user from user where username = '"+u+"' and password = '"+p+"'").isEmpty();
    }
}
