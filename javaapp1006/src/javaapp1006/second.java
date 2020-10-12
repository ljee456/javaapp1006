package javaapp1006;

public class second {
	//퍼블릭 스태틱 보이드 메인은 클래스 생성할 때 메인체크하면 된다.
	public static void main(String[] args) {
		//이름은 문자열
		String 이름 = "이 재원";
		int 나이 = 27;
		int 몸무게 = 63;
		double 키 = 171.35;
		char 성별 = 'M';
		boolean 결혼여부 = false;
		
		// Ctrl+/ 드래그 후 전체주석
		System.out.println("이름 : " + 이름);
		System.out.println("나이 : " + 나이);
		System.out.println("몸무게 : " + 몸무게);
		System.out.println("키 : " + 키);
		System.out.println("성별 : " + 성별);
		System.out.println("결혼여부 : " + 결혼여부);
		
		//\t는 탭이고 \n은 줄바꿈이다.
		System.out.println("이름:\t" + 이름 + "\n" + "나이:\t" + 나이 + "\n" + "몸무게:\t" + 몸무게 + "\n"
					+ "키:\t" + 키 + "\n" + "성별:\t" + 성별 + "\n" + "결혼여부:\t" + 결혼여부);

	}
	
}
