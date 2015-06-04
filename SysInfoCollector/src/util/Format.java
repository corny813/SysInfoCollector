package util;

import java.text.DecimalFormat;

public class Format {

	/**
	 * disk���num��λĬ��ΪKB
	 * 
	 * @param num
	 * @return
	 */
	public static String digitToByteForDisk(long num) {

		DecimalFormat df = new DecimalFormat("#.00");
		int MBNum = 1024;
		int GBNum = 1024 * 1024;

		if (num > GBNum) {
			return (df.format(1.0* num / GBNum) + " GB");
		} else if (num > MBNum) {
			return (df.format(1.0* num / MBNum) + " MB");
		} else {
			return (df.format(1.0* num / 1024) + " KB");
		}
	}

	/**
	 * memory���num��λĬ��ΪB
	 * @param num
	 * @return
	 */
	public static String digitToByteForMemory(long num) {

		DecimalFormat df = new DecimalFormat("#.00");
		int MBNum = 1024*1024;
		int GBNum = 1024 * 1024*1024;

		if (num > GBNum) {
			return (df.format(1.0*num / GBNum) + " GB");
		} else if (num > MBNum) {
			return (df.format(1.0*num / MBNum) + " MB");
		} else {
			return (df.format(1.0*num / 1024) + " KB");
		}
	}
}
