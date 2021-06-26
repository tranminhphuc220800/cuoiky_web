import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dao {
    public Connection getconnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cuoiky";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {

            return null;

        }
    }
    public List<notemodel> getnotesbyiduser(String iduser){
        List<notemodel>  resutls = new ArrayList<>();
        String sql ="select *from note where iduser=? ";
        Connection connection =getconnection();
        PreparedStatement statement = null;
        ResultSet resultSet =null;

            try {
                statement =connection.prepareStatement(sql);
                statement.setString(1,iduser);

                resultSet =statement.executeQuery();

                while (resultSet.next()){
                    notemodel notemodel =new notemodel();
                    notemodel.setIduser(resultSet.getString("iduser"));
                    notemodel.setIdnote(resultSet.getInt("idnote"));
                    notemodel.setContent(resultSet.getString("content"));
                    notemodel.setTitle(resultSet.getString("notename"));

                    resutls.add(notemodel);
                }
                return  resutls;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    if(connection!=null){
                    connection.close();}
                    if(statement!=null){
                    statement.close();}
                    if(resultSet!=null){
                    resultSet.close();}
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
     return null;
        }
    public List<usermodel> getuser(String username,String password){
        List<usermodel>  resutls = new ArrayList<>();
        String sql ="select *from user where username=? and password =? ";
        Connection connection =getconnection();
        PreparedStatement statement = null;
        ResultSet resultSet =null;

        try {
            statement =connection.prepareStatement(sql);
            statement.setString(1,username);
            statement.setString(2,password);
            resultSet =statement.executeQuery();

            while (resultSet.next()){
                usermodel usermodel = new usermodel();
                usermodel.setUsername(resultSet.getString("username"));
                usermodel.setPassword(resultSet.getString("password"));
                resutls.add(usermodel);
            }
            return  resutls;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(connection!=null){
                    connection.close();}
                if(statement!=null){
                    statement.close();}
                if(resultSet!=null){
                    resultSet.close();}
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return null;
    }

    public List<notemodel> getnotebyidnote(String idnote){
        List<notemodel>  resutls = new ArrayList<>();
        String sql ="select *from note where idnote = ?";
        Connection connection =getconnection();
        PreparedStatement statement = null;
        ResultSet resultSet =null;

        try {
            statement =connection.prepareStatement(sql);
            statement.setString(1,idnote);

            resultSet =statement.executeQuery();

            while (resultSet.next()){
                notemodel notemodel =new notemodel();
                notemodel.setIduser(resultSet.getString("iduser"));
                notemodel.setIdnote(resultSet.getInt("idnote"));
                notemodel.setContent(resultSet.getString("content"));
                notemodel.setTitle(resultSet.getString("notename"));

                resutls.add(notemodel);
            }
            return  resutls;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(connection!=null){
                    connection.close();}
                if(statement!=null){
                    statement.close();}
                if(resultSet!=null){
                    resultSet.close();}
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return null;
    }

    public void editbyidnote(int idnote, String title ,String content){

        String sql ="UPDATE note\n" +
                "set content= ?,notename=?\n" +
                "where idnote=?;";
        Connection connection =getconnection();
        PreparedStatement statement = null;


        try {
            statement =connection.prepareStatement(sql);
            statement.setString(1,content);
            statement.setString(2,title);
            statement.setInt(3,idnote);

          statement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(connection!=null){
                    connection.close();}
                if(statement!=null){
                    statement.close();}

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }


}

