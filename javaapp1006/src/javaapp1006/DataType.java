package javaapp1006;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A' + 3;
		int i = 'A' + 3;
		
		System.out.println("ch: " + ch);	//문자 변수에 저장해서 D
		
		System.out.println("i: " + i);		//정수 변수에 저장해서 68
		
		String str = "A" + 1;				//문자열과 숫자를 더하기 하면 결합 A1
		System.out.println("str: " + str);
		
		int result = 2100000000 + 1000000000;	//Overflow가 발생해서 음수가 저장된다
		System.out.println("result: " + result);
		
		double sum = 0.0;				//0.1을 100번 더했는데 10.0이 아닌 결과를 출력
		for(int k=0; k<100; k=k+1) {	//표현상의 한계 때문에 이런 결과가 나온다
			sum = sum + 0.1;
			
		}
		System.out.println("sum: " + sum);
		
//		int j = 10.7; //에러
//		10.7은 double 이라서 int에 저장할 수 없다
//		double 이 int보다 크기떄문이다
//		double 을 int로 강제 형 변환해서 저장해야 한다
//		실수를 정수로 강제로 변환하면 소수가 버려지게된다
		int j = (int)10.7;
		System.out.println("j: " + j);

	}

}
