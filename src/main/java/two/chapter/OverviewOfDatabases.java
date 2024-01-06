package two.chapter;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    connection.prepareStatement(insertSQL);*/
}
