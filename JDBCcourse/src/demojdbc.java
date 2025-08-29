import java.sql.*;

public class demojdbc {
    public static void main(String[] args) throws Exception{
        // import package
        //  load and register
        //  create connection
        // create statement
        // exicute statement
        // process the result
        // close
        String urll = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "akshay2005";

//      String sql ="select * from student"; // read
//        String sql = "delete from student where studentid = 8"; // delete
//        String sql = "insert into student values(7, 'Alpino', 60)"; // creat
//        String sql = "update student set name = 'Max' where studentid = 7"; // update
//
//


        // This Query Is Not Good:
        // ❌ 1. SQL Injection Risk
        // ❌ 2. Hard to Read and Maintain
        int sd = 101;
        String sname = "Alpino";
        int marks = 60;
//        String sql = "insert into student values("+sd+",'"+sname+"',"+marks+")";

        String sql = "insert into student values(?,?,?)";





        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(urll,uname,pass);
        System.out.println("Conection done");
//      Statement st = con.createStatement();


        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sd);
        st.setString(2,sname);
        st.setInt(3,marks);

         st.execute();

//          ResultSet rs = st.executeQuery(sql);
//          System.out.println(rs.next()); // ture or false data is exist or not
//        rs.next(); //   check to do we have next row available or not
//         String name = rs.getString("name");
//        System.out.println("Student name is : "+ name);

//        while(rs.next()){
//            System.out.print(rs.getInt(1)+ " - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.println(rs.getInt(3));
//        }



         con.close();
        System.out.println("Connection close");
    }
}


