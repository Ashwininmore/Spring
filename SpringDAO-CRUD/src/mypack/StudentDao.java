package mypack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
	private JdbcTemplate jtemp;
	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp=jtemp;
	}
	public int saverec(Student s1) {
		String query="insert into student values"+"("+s1.getRollno()+",'"+s1.getStdname()+"',"+s1.getMarks()+")";
		return jtemp.update(query);
	}
	public int deleteRec(Student e) {
		String query="delete from student where rollno="+e.getRollno();
		return jtemp.update(query);
	}
	public int updateRec(Student e) {
		String query="update student set stdname='"+e.getStdname()+"',marks="+e.getMarks()+" where rollno="+e.getRollno();
		return jtemp.update(query);
	}
	public void showAllRecords() {
		List<Student> l=new ArrayList<Student>();
		jtemp.query("select * from student", new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int count) throws SQLException {
				Student e= new Student();
				e.setRollno(rs.getInt(1));
				e.setStdname(rs.getString(2));
				e.setMarks(rs.getInt(3));
				l.add(e);
				return e;
			}
			
		});
		for(Student s1:l) {
			System.out.println(s1);
		}
	}
}
