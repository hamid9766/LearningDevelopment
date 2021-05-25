package Projects;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();
            String q = "Select * from table1";

            //We are simply printing the query as a statement so we can use statement class
            //Result Set Class is going to provide the set of statement i.e queries in a set
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(q);

            //resultSet.next will return true if there are more rows and loop will continue
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                System.out.println( id + " " + name + " " + city);
            }
            System.out.println("Printed ..");
            con.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
