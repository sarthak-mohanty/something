package com.project.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.entity.Project;
import com.project.ifaces.DAO;
import com.project.utils.ConnectionUtility;

public class ProjectDaoImpl implements DAO<Project> {

	private Connection derbyConnection;

	public ProjectDaoImpl() {
		super();
		this.derbyConnection = ConnectionUtility.getDerbyConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Project t) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into project values(?,?,?,?,?)";
		int rowUpdate=0;
		PreparedStatement pstmt = null;
		try {
			pstmt=this.derbyConnection.prepareStatement(sql);			
			pstmt.setInt(1, t.getProjectId());
			pstmt.setString(2, t.getProjectName());
			pstmt.setString(3, t.getProjectDescription());
			pstmt.setDate(4, (Date) t.getStartDate());
			pstmt.setString(5, t.getProjectStatus());
			
	          rowUpdate = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return rowUpdate==1?true:false;
	}

	@Override
	public boolean update(Project t) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Project> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> findList(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
