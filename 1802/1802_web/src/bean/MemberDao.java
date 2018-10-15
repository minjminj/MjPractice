package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	Connection conn;
	
	public MemberDao() {
		conn = new DBConnection().getConn();

	}
	public List<MemberVo> select(String findStr){
		List<MemberVo> list = new ArrayList<>();
		String sql = "select * from student where "
					+" id like ? "
					+" or name like ? "
					+" or phone like ? "
					+" or address like ? "
					+" or address like ? ";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+findStr+"%");
			ps.setString(2, "%"+findStr+"%");
			ps.setString(3, "%"+findStr+"%");
			ps.setString(4, "%"+findStr+"%");
			ps.setString(5, "%"+findStr+"%");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberVo v =new MemberVo();
				v.setId(rs.getString("id"));	//" "안에 있는건 컬럼명
				v.setName(rs.getString("name"));
				v.setPhone(rs.getString("phone"));
				v.setPw(rs.getString("pwd"));
				v.setPost(rs.getString("post"));
				v.setAddress(rs.getString("address"));
				v.setEmail(rs.getString("email"));
				v.setRdate(rs.getDate("rdate").toString());
				
				list.add(v);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
			list = null;
		}finally {
			
		return list;
		
		}
	}
	public boolean insert(MemberVo vo) {
		boolean b = true;
		String sql = "insert into student values(?,?,?,?,?,?,?,sysdate)";	//DB순서에 맞게 해야함 
		try{
			PreparedStatement ps = conn.prepareStatement(sql);	//DB순서에 맞게 해야함 
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPhone());
			ps.setString(4, vo.getPw());
			ps.setString(5, vo.getPost());
			ps.setString(6, vo.getAddress());
			ps.setString(7, vo.getEmail());
			
			int cnt = ps.executeUpdate(); //insert,update,delete
			
			if(cnt <= 0)
				
			b = false;
			
		}catch (Exception ex) {
			ex.printStackTrace();
			b = false;
		}finally {
			return b;
		}
	}
	public boolean update(MemberVo vo) {
		boolean b = true;
		
		return b;
	}
	public boolean delete(MemberVo vo) {
		boolean b = true;
		
		return b;
	}
	public MemberVo view(MemberVo vo) {	//학생 id에 해당하는 1건
		MemberVo rVo = null;
		
		return rVo;
	}
}






