package tp10;

import java.time.Duration;

public class Gagnants {

	private Integer Year;
	private String Nat;
	private String Name;
	private String Team;
	private Integer Km;
	private Duration Time;
	private Integer YellowDays;

	public Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}

	public String getNat() {
		return Nat;
	}

	public void setNat(String nat) {
		Nat = nat;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public Integer getKm() {
		return Km;
	}

	public void setKm(Integer km) {
		Km = km;
	}

	public Duration getTime() {
		return Time;
	}

	public void setTime(Duration time) {
		Time = time;
	}

	public Integer getYellowDays() {
		return YellowDays;
	}

	public void setYellowDays(Integer yellowDays) {
		YellowDays = yellowDays;
	}

	public double getVitesseMoyenne() {
		return (getKm() / (getTime().getSeconds() / 3600));
	}

	public Gagnants(Integer year, String nat, String name, String team, Integer km, Duration time, Integer yellowDays) {
		super();
		Year = year;
		Nat = nat;
		Name = name;
		Team = team;
		Km = km;
		Time = time;
		YellowDays = yellowDays;
	}

	@Override
	public String toString() {
		return "Gagnants [Year=" + Year + ", Nat=" + Nat + ", Name=" + Name + ", Team=" + Team + ", Km=" + Km
				+ ", Time=" + Time + ", YellowDays=" + YellowDays + "]";
	}
}
