package entity;

/**
 * �ڴ�ʵ����
 * 
 * @author corny
 * 
 */
public class Memory {

	private String totalSize; // �ܴ�С
	private String usedSize; // ��ʹ�ô�С
	private String freeSize; // ʣ��ռ��С


	public String getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}

	public String getUsedSize() {
		return usedSize;
	}

	public void setUsedSize(String usedSize) {
		this.usedSize = usedSize;
	}

	public String getFreeSize() {
		return freeSize;
	}

	public void setFreeSize(String freeSize) {
		this.freeSize = freeSize;
	}

}
