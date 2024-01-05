package mypack;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int qid;
	private String qname;
	private List<Answer> answers;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public void display() {
		System.out.println("question Id="+qid+"\nQuestion name="+qname+"\nAnswers=");
		Iterator<Answer>itr=answers.iterator();
		while(itr.hasNext()) {
			Answer a1=(Answer)itr.next();
			System.out.println(a1);
		}
	}
}
