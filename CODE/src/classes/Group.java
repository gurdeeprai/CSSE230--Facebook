package classes;
import java.util.Iterator;
import java.util.TreeSet;

public class Group {
	private static Integer groupIDCounter;
	private String name, desc;
	private Integer gID;
	private TreeSet<Integer> members;
	

	public Group() {
		this.gID = ++groupIDCounter;
		this.name = "<Group Name>";
		this.desc = "<Group Description>";
		this.members = new TreeSet<Integer>();
	}
	
	public Group(String name) {
		this();
		this.name = name;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void addMember(Integer uid) {
		this.members.add(uid);
	}
	
	public Iterator<Integer> getMembers() {
		return members.iterator();
	}
	
	
}