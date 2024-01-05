package mypack;

import java.util.*;

public class Question {
	private int qid;
	private String qname;
	private List<String> answers;

	public Question(int qid, String qname, List<String> answers) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}

	public void display() {
		System.out.println("Question Id="+qid+"\nQuestion Name="+qname+"\nAnswer=");
		Iterator<String>itr=answers.iterator();
		while(itr.hasNext()) {
			String s1=(String)itr.next();
			System.out.println(s1);
		}
	}
}
