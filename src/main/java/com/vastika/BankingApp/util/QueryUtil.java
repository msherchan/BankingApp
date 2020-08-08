package com.vastika.BankingApp.util;

public class QueryUtil {
	
	//naming convention:
	//JAVA: camel case --> e.x. getConnection. always starts with lowercase and the 1st word is all lowercase. Then first letter of every following word is uppercase.
	//DB: snake case --> e.x. mobile_no. all are in lowercase separated by '_'.
	
	public static final String INSERT_SQL = "insert into account_info_tbl(id, account_name, address, mobile_no, unique_id)values(?,?,?,?,?)";
	public static final String UPDATE_SQL = "update account_info_tbl set id = ?, account_name = ?, address = ?, mobile_no = ?, unique_id =? where id = ?";
	public static final String LIST_SQL = "select * from account_info_tbl";
	public static final String DELETE_SQL = "delete account_info_tbl where id = ?";
	public static final String GET_BY_ID_SQL = "select * from account_info_tbl where id = ?";

}
