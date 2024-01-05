package mypack;

public class Answer {
	private String aname, postedby;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getPostedby() {
		return postedby;
	}

	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	
	@Override
	public String toString() {
		return "Answer [aname=" + aname + ", postedby=" + postedby + "]";
	}

	
}
