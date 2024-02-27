package com.manju;

//import java.lang.reflect.Executable;
//import java.sql.*;
//import java.io.*;
//import java.util.*;
//import java.text.*;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//
//    public static <SimpleDateFormat> void main(String[] args) throws SQLException {
//        String sql = "select * from public.\"Student\";";
//        String url = "jdbc:postgresql://localhost/postgres";
//        String uname = "postgres";
//        String pwd = "postgres";
//
//
//        try {
//            Connection conn = DriverManager.getConnection(url, uname, pwd);
//            Statement st = conn.createStatement();
//
//            int choice;
//            Scanner sc = new Scanner(System.in);
//            Scanner sc1 = new Scanner(System.in);
//
//            System.out.println("Enter choice(1 to read , 2 to insert and 3 to delete a record and 4 to Update");
//            choice = sc.nextInt();
//
//            Crud c = new Crud();
//
//            if(choice == 1){
//                ResultSet rs = st.executeQuery(sql);
//                while (rs.next()) {
//                    System.out.print("Column 1 returned ");
//                    System.out.println(rs.getInt("id")+" "+rs.getString("name"));
//                }
//                rs.close();
//            }
//
//            else if(choice ==2){
//                try{
//                    String temp = c.insertRecord();
//                    //System.out.printf("temp:"+temp);
//                    st.executeUpdate(temp);
//                    System.out.println("Student record inserted successfully");
//                }
//                catch(Exception e){
//                    System.out.println("Student record not inserted");
//                }
//            }
//
//            else if(choice==3){
//                try {
//                    System.out.println("Enter the student's name:");
//                    int id = sc.nextInt();
//                    String sql1 = "DELETE FROM public.\"Student\"\n" +
//                            "\tWHERE id="+id+";";
//                    System.out.println("sql1:"+sql1);
//                    st.executeUpdate(sql1);
//                    System.out.println("Deleted Student record");
//                }
//                catch(Exception e){
//                    System.out.println("Not deleted");
//                }
//            }
//
//            else if(choice==4){
//                System.out.println("Enter the id:");
//                int id = sc.nextInt();
//                System.out.println("Enter 1 to update id and 2 to update name:");
//                int ch1 = sc.nextInt();
//                if(ch1==1){
//                    try {
//                        System.out.println("Enter the value:");
//                        int upid = sc.nextInt();
//                        String sql1 = "UPDATE public.\"Student\"\n" +
//                                "\tSET id="+upid+"\n" +
//                                "\tWHERE id="+id+";";
//                        System.out.println("sql1:"+sql1);
//                        st.executeUpdate(sql1);
//                        System.out.println("Updated Student record");
//                    }
//                    catch(Exception e){
//                        System.out.println("Not deleted");
//                    }
//                }
//                else if(ch1==2){
//                    try {
//                        System.out.println("Enter the name:");
//                        String upname = sc1.nextLine();
//                        String sql1 = "UPDATE public.\"Student\"\n" +
//                                "\tSET name='"+upname+"'\n" +
//                                "\tWHERE id="+id+";";
//                        System.out.println("sql1:"+sql1);
//                        st.executeUpdate(sql1);
//                        System.out.println("Updated Student record");
//                    }
//                    catch(Exception e){
//                        System.out.println("Not deleted");
//                    }
//                }
//            }
//
//            st.close();
//
//
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static Logger logger1 = LogManager.getLogger(Main.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		logger1.info("Info");
		logger1.debug("debug");
		logger1.error("Error!");
		logger1.trace("Trace");
	}

}