package com.gmail.nasimahmed28.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gmail.nasimahmed28.model.UserProfile;

public class UserProfileService 
{	
	public static void  saveUserProfile(UserProfile profile)
	{
		//int executedValue = 0;
		
		try
		{
			Connection conn = DBConnection.getConnection();

			String query = "INSERT INTO Registration (firstName, lastName, address, dob, contactNumber, Gender, maritalStatus, jobAddress) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, profile.getFirstName());
			stmt.setString(2, profile.getLastName());
			stmt.setString(3, profile.getAddress());
			stmt.setString(4, profile.getDOB());
			stmt.setString(5, profile.getContactNum());
			stmt.setString(6, profile.getGender());
			stmt.setString(7, profile.getMaritalStatus());
			stmt.setString(8, profile.getJobddress());
			
                        stmt.executeUpdate();
                        
			//executedValue = stmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//return executedValue;
	}
}
