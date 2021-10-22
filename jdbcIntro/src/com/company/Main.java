package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null; //Veritabanı bağlantısını Connection classı ile sağlıyoruz.
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement(); // Gönderilecek sorgu bu bağlantıya gidecek.

            //Sorguyu çalıştırır. Sonra sorgu sonucu dönen datayı resultSet'e aktarır.
            resultSet = statement.executeQuery("select code, name, continent, region from world.country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("code"), resultSet.getString("name"),
                        resultSet.getString("continent"), resultSet.getString("region")));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception); //Call showErrorMessage() function
        } finally {
            connection.close(); // Bağlantıyı kapatıyoruz.
        }
    }
}
