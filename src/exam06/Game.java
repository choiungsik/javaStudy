package exam06;

public interface Game {

	public void select();                     // 문제를 뽑는 기능
	public String Question();                 // 문제를 내는 기능
	public void check(int sum);               // 정답확인
	public int life();                        // 남은 목숨 확인
	
}
