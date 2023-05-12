package Task13;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Tables {
    private static final String INSERT_FACULTY = "INSERT into faculty (name) values (?);";
    private static final String INSERT_GROUPS = "INSERT into groups (name, faculty_id) values (?,?);";
    private static final String INSERT_STUDENT = "INSERT into student (name, age, scholarship, group_id) values (?,?,?,?);";
    private static final String SELECT_STUDENT = "SELECT * FROM student " + "where group_id = ? AND age < ? AND scholarship > ?;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://mahmud.db.elephantsql.com/fxowlltu", "fxowlltu", "xzdZw8Vh7SjpUefWWsQd7gwbYMdKsDxg")) {
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS faculty, groups, student CASCADE;");
            statement.execute("CREATE TABLE IF NOT exists faculty (id bigserial primary key, name text);");
            statement.execute("CREATE TABLE IF NOT exists groups (id bigserial, name text, faculty_id bigint, primary key (id)); alter table groups add constraint fk_group_faculty foreign key (faculty_id) references faculty (id);");
            statement.execute("CREATE TABLE IF NOT exists student (id bigserial primary key, name text not null, age int not null, scholarship numeric(10, 2), group_id bigint references groups (id));");
            PreparedStatement faculty = connection.prepareStatement(INSERT_FACULTY);
            faculty.setString(1, "Economics");
            faculty.addBatch();
            faculty.setString(1, "History");
            faculty.addBatch();
            faculty.setString(1, "Biology");
            faculty.addBatch();
            faculty.executeBatch();
            PreparedStatement groups = connection.prepareStatement(INSERT_GROUPS);
            groups.setString(1, "10");
            groups.setInt(2, 1);
            groups.addBatch();
            groups.setString(1, "11");
            groups.setInt(2, 1);
            groups.addBatch();
            groups.setString(1, "20");
            groups.setInt(2, 2);
            groups.addBatch();
            groups.setString(1, "25x");
            groups.setInt(2, 2);
            groups.addBatch();
            groups.setString(1, "15y");
            groups.setInt(2, 3);
            groups.addBatch();
            groups.setString(1, "8x");
            groups.setInt(2, 3);
            groups.addBatch();
            groups.executeBatch();
            PreparedStatement student = connection.prepareStatement(INSERT_STUDENT);
            student.setString(1, "Tom");
            student.setInt(2, 19);
            student.setDouble(3, 90.30);
            student.setInt(4, 3);
            student.setString(1, "John");
            student.setInt(2, 19);
            student.setDouble(3, 100.30);
            student.setInt(4, 3);
            student.addBatch();
            student.setString(1, "Met");
            student.setInt(2, 19);
            student.setDouble(3, 200.50);
            student.setInt(4, 3);
            student.addBatch();
            student.setString(1, "Jack");
            student.setInt(2, 18);
            student.setDouble(3, 130.20);
            student.setInt(4, 2);
            student.addBatch();
            student.setString(1, "Sam");
            student.setInt(2, 18);
            student.setDouble(3, 130.20);
            student.setInt(4, 1);
            student.addBatch();
            student.executeBatch();
            PreparedStatement selectStudent = connection.prepareStatement(SELECT_STUDENT);
            selectStudent.setInt(1, 3);
            selectStudent.setInt(2, 20);
            selectStudent.setDouble(3, 100);
            int i = statement.executeUpdate("UPDATE student set scholarship = 90 where name = 'John';");
            ResultSet rs = selectStudent.executeQuery();
            while (rs.next()) {
                String studentName = rs.getString("name");
                System.out.println(studentName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

