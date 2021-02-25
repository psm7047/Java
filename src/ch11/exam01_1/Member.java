package ch11.exam01_1;

public class Member {
	
	private String id;
	private String name;
	
	//생성자
	public Member(String id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {		//obj가 Member타입인지 확인
			Member m = (Member) obj;	//Member타입으로 강제 변환
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;	//obj가 Member타입이 아닐떄
		}
	}
	
	

}
