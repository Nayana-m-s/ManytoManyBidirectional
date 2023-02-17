package manytomanybi.dto;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
@Cacheable
public class Course {
	@Id
	private int cid;
	private String cname;
	private String duartion;
	@ManyToMany(mappedBy = "list")
	private List<Student> student;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuartion() {
		return duartion;
	}
	public void setDuartion(String duartion) {
		this.duartion = duartion;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duartion=" + duartion + ", student=" + student + "]";
	}
	

}
