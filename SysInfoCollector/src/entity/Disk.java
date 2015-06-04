package entity;

/**
 * 本地磁盘实体类
 * @author corny
 *
 */
public class Disk {

	private String name;	//
	
	private String totalSize;	//总大小
	private String usedSize;	//已使用大小
	private String freeSize;	//剩余空间大小
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
