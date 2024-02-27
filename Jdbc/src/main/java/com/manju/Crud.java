package com.manju;

import java.sql.*;
import java.io.*;
import java.util.*;
import java.text.*;
public class Crud {
    public String insertRecord() throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();
        //System.out.println("Id:"+id);
        System.out.println("Enter name:");
        String name = sc1.nextLine();

        String insertQuery = "INSERT INTO public.\"Student\"(\n" +
                "\tid, name)\n" +
                "\tVALUES ("+id+",'"+name+"');";
        System.out.printf("Insertquery:"+insertQuery);
        return insertQuery;

    }


}

