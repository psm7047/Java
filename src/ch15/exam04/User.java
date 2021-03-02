package ch15.exam04;

public class User {

	private String id;
	private String name;
	
	public User(String id,String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();	//id의 문자욜이 같으면 똑같은 해시코드
	}
	@Override
	public boolean equals(Object obj) {	//id의 문자열이 같을 떄 true
		if(obj instanceof User) {		//obj가 User의 인스턴스 객체인가?
			User temp = (User) obj;
			if(id.equals(temp.id)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
