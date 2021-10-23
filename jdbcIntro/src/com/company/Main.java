package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Insert ifadeleri PreparedStatement classı ile yapılıyor.
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "insert into world.city (Name,CountryCode,District,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);
            int result = statement.executeUpdate(); // executeUpdate() işleminde etkilenen kayıt sayısı gelir.
            System.out.println("Kayıt eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }


    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select Code, Name, Continent, Region from world.country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}
