package two.chapter;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Chapter 2. Data Acquisition
 */
public class OverviewOfDatabases {

    /**
     * CREATE TABLE IF NOT EXISTS `URLTABLE`
     * (
     *      `RecordID` INT(11) NOT NULL
     *      AUTO_INCREMENT,
     *      `URL` text NOT NULL,
     *      PRIMARY KEY (`RecordID`(
     *  );
     *
     */

    /*try {
        Class.forName("com.mysql.jdbc.Driver");

        String url =
                "jdbc:mysql://localhost:3306/example";

        connection =
                DriverManager.getConnection(url, "user ID",
                        "password");
    } catch (SQLException | ClassNotFoundException ex) {
        // Handle exceptions
    }*/

    /**
     * String insertSQL = "INSERT INTO
     * `example`.`URLTABLE` "
     *      + "('url') VALUES " + "(?);";
     */

    /*PreparedStatement stmt =
    connection.prepareStatement(insertSQL);

    stmt.setString(1, "https://
    en.wikipedia.org/wiki/Data_science");
                            stmt.execute();
                            stmt.setString(1,
                                "https://en.wikipedia.org/wiki/
                    Bishop_Rock, _Isles_of_Scilly");
                            stmt.execute();


    String selectSQL = "select * from
                               URLTABLE";
      Statement statement =
    connection.createStatement();
      ResultSet resultSet =
    statement.executeQuery(selectSQL);

    out.println("List of URLs");
        while (resultSet.next()) {

    out.println(resultSet.getString(2));
        }


    The output of this example, when executed, is as follows:
    List of URLs
    https://en.wikipedia.org/wiki/
    Data_science
    https://en.wikipedia.org/wiki
    Bishop_Rock,_Isles_of_Scilly

    To empty the contents of the table, use
    the following sequence:

    Statement statement =
    connection.createStatement();
        statement.execute("TRUNCATE
    URLTABLE;");
    */
}
