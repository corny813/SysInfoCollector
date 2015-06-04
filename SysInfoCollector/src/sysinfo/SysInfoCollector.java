package sysinfo;

import java.util.ArrayList;
import java.util.List;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

import util.Format;
import entity.CPU;
import entity.Disk;
import entity.Memory;

public class SysInfoCollector {

	private static Sigar sigar = new Sigar();
	
	/**
	 * 根据cpu个数返回自定义的CPU实体
	 * @return
	 */
	public static List<CPU> getCpuInfo(){
		List<CPU> cpus = new ArrayList<CPU>();
		try {
			CpuPerc[] percs = sigar.getCpuPercList();
			CpuInfo cpuInfo = sigar.getCpuInfoList()[0];
			String model = cpuInfo.getModel();
			String vendor = cpuInfo.getVendor();
			int count = 0;
			
			for(CpuPerc p : percs){
				CPU cpu = new CPU();
				
				count++;
				cpu.setName("CPU"+count);
				
				cpu.setModel(model);
				cpu.setVendor(vendor);
				
				cpu.setIdleRatio(CpuPerc.format(p.getIdle()));
				cpu.setWaitRatio(CpuPerc.format(p.getWait()));
				cpu.setUsedRatio(CpuPerc.format(p.getCombined()));
				cpu.setIrqRatio(CpuPerc.format(p.getIrq()));
				
				cpus.add(cpu);
			}
			
		} catch (SigarException e) {
			e.printStackTrace();
		}
		return cpus;
	}
	
	/**
	 * 根据磁盘分区数返回自定义Disk相关信息
	 * @return
	 */
	public static List<Disk> getDiskInfo(){
		List<Disk> disks = new ArrayList<Disk>();
		
		try {
			FileSystem[] fsList = sigar.getFileSystemList();
			
			for (FileSystem fs : fsList) {
				Disk disk = new Disk();
				if (fs.getType() == 2) {
					FileSystemUsage usage = sigar.getFileSystemUsage(fs.getDirName());
					
					disk.setName(fs.getDirName());
					
					disk.setFreeSize(Format.digitToByteForDisk(usage.getFree()));
					disk.setUsedSize(Format.digitToByteForDisk(usage.getUsed()));
					disk.setTotalSize(Format.digitToByteForDisk(usage.getTotal()));
					
					disks.add(disk);
				}
			}
		} catch (SigarException e) {
			e.printStackTrace();
		}
		return disks;
	}
	
	/**
	 * 返回自定义内存相关信息
	 * @return
	 */
	public static Memory getMemInfo(){
		Memory memory = new Memory();
		try {
			Mem mem = sigar.getMem();
			
			memory.setFreeSize(Format.digitToByteForMemory(mem.getFree()));
			memory.setUsedSize(Format.digitToByteForMemory(mem.getUsed()));
			memory.setTotalSize(Format.digitToByteForMemory(mem.getTotal()));
			
		} catch (SigarException e) {
			e.printStackTrace();
		}
		return memory;
	}
	
	public static void main(String[] args){
//		List<CPU> cpus = getCpuInfo();
//		List<Disk> disks = getDiskInfo();
		Memory mem = getMemInfo();
//		for(CPU cpu : cpus){
//			System.out.println(cpu.getName()+","+cpu.getUsedRatio());
//		}
//		for(Disk d : disks){
//			System.out.println(d.getName()+","+d.getFreeSize());
//		}
		System.out.println(mem.getFreeSize());
//		System.out.println(System.getProperty("java.library.path"));
	}
	
}
