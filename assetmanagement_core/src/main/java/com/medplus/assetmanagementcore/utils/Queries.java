package com.medplus.assetmanagementcore.utils;

public class Queries {
	public static String addNewAsset="insert into asset values(?,?,?,?,?,?)";
	public static String updateAssetName="update asset set assetname=? where assetId=?";
	public static String updateAssetCost="update asset set cost=? where assetId=?";
	public static String updateAssetStatus="update asset set status=? where assetId=?";
	public static String updateEmployee="update emp1 set firstName=?,lastName=?,gender=?,mobileNumber=?,dateOfJoin=?,dateOfBirth=?,address=?,salary=?,updatedBy=?,updatedDate=? where employeeId=?";
	public static String getAllEmployees="select * from emp2";
	public static String GET_EMPLOYEE="select * from emp1 where employeeId=?";
	public static String addRole="insert into tbl_role values(?,?,?,?)";
	public static String addRoleToEmp="insert into tbl_role_mapping values(?,?,?,?)";
	public static String getAllRoles="select * from tbl_role";
	public static String getRoleId="select RoleId from tbl_role where RoleName =?";
}
