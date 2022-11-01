package JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperTest  {
public String name;
    public String number;
    public String location;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "RowMapperTest{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
