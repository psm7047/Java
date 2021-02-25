package ch11.exam01_1;

public class Member {
	
	private String id;
	private String name;
	
	//������
	public Member(String id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {		//obj�� MemberŸ������ Ȯ��
			Member m = (Member) obj;	//MemberŸ������ ���� ��ȯ
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;	//obj�� MemberŸ���� �ƴҋ�
		}
	}
	
	

}
