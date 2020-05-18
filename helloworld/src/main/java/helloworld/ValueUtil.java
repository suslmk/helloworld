package helloworld;

public class ValueUtil {

	public int getStringCnt(String text) {

		int lineCnt = 0;
	    int fromIndex = -1;
	    while ((fromIndex = text.indexOf("\n", fromIndex + 1)) >= 0) {
	      lineCnt++;
	    }
	    
	    return lineCnt;
	}
	
	/*
	 * getRandomPort
	 */
	public long getRandomPort() {
		long ret = 0;
		double randomValue = Math.random();
		int intValue = (int)(randomValue*3000)+9000;
		System.out.println(intValue);
		
		return ret;
	}
}
