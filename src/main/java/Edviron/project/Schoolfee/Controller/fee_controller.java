package Edviron.project.Schoolfee.Controller;
import Edviron.project.Schoolfee.bean.student;
import Edviron.project.Schoolfee.bean.transaction;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
public class fee_controller {
    @GetMapping("S_Student")
    public student S_Student(@RequestParam int Sc_id) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edviron", "root", "Vatarkar@18#");
        String query = "select * from Student_info where Sc_id=" + Sc_id;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            return new student(rs.getInt(1), rs.getString(2),rs.getInt(3), rs.getInt(4),rs.getInt(5), rs.getInt(6),rs.getString(7), rs.getString(8),rs.getInt(9));
        } else {
            return null;
        }
    }
    @GetMapping("due_date")
    public student due_date(@RequestParam String due_date) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edviron", "root", "Vatarkar@18#");
        String query = "select * from Student_info where due_date<=" + due_date;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            return new student(rs.getInt(1), rs.getString(2),rs.getInt(3), rs.getInt(4),rs.getInt(5), rs.getInt(6),rs.getString(7), rs.getString(8),rs.getInt(9));
        } else {
            return null;
        }
    }

    @PostMapping("payment")
    public void payment(@RequestBody transaction transaction) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edviron", "root", "Vatarkar@18#");
            String query = "insert into Transaction values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, transaction.getId());
            stmt.setString(2, transaction.getPaid());
            stmt.setInt(3,transaction.getAmount());
            stmt.setString(4, transaction.getDate());
            stmt.executeUpdate();
            String query1 = "update student_info set installment_amount=0 where id="+ transaction.getId();
            Statement stmt1= con.createStatement();
            ResultSet rs=stmt1.executeQuery(query1);
    }
}

