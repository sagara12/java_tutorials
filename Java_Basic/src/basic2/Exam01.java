package basic2;

public class Exam01 {
	final static int leaveH = 17;
	final static int leaveM = 30;
	final static int leaveS = 0;
	
	public static void main(String[] args) {
		
		int sec = calcLeave(15, 3, 30);
		int[] time = showTime(sec);
		
		System.out.println("퇴근시간: " + time[0] + ":" + time[1] 
					+ ":" + time[2]);
	}

	// 퇴근시간 계산
	
	public static int calcLeave(int hour, int min, int sec) {
		int localSec = leaveS;
		int localMin = leaveM;
		int localHour = leaveH;
		
		int lsec = localSec - sec;
		if (lsec < 0) {
			lsec += 60;
			localMin -= 1;
		}
		
		int lmin = localMin - min;
		if (lmin < 0) {
			lmin += 60;
			localHour -= 1;
		}
		
		int lhour = localHour - hour;
		if (lhour < 0) {
			return 0;
		}
		
		System.out.println(lhour + "," + lmin + "," + lsec);
		return lsec + (lmin * 60) + (lhour * 60 * 60);
	}	
	
	public static int[] showTime(int sec) {
		int[] times = new int[3];
		
		// 초
		int second = sec % 60;
		// 분
		int temp_min = sec / 60;
		int min = temp_min % 60;
		// 시
		int hour = temp_min / 60;
		
		times[0] = hour;
		times[1] = min;
		times[2] = second;
		
		return times;
	}
}








