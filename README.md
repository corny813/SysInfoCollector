# SysInfoCollector
system infomation collector

Windows
when you export the project as a jar. if you put the jar together with sigar-amd64-winnt.dll sigar-x86-winnt.dll
it can run successfully. Or you should set the java.library.path to the .dll folder or set %path% to

Linux
when you export the project as a jar. if you put the jar together with libsigar-amd64-linux.so libsigar-x86-linux.so
you should export the LD_LIBRARY_PATH=. then it can run successfully. Or you should java -Djava.library.path='pathOfTheSo'
