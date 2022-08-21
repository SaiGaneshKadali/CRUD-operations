package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="Eid")
	public int eid;
	@Column(name="Ename")
	public String ename;
	@Column(name="Esal")
	public String esal;
	@Column(name="Bonus")
	public int bonus;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String Ename) {
		this.ename = Ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
   
}