public class Multi extends Thread{  
public void run(){  
	
System.out.println("thread is running...");
for(int i=0;i<=100;i++) {
	System.out.println("i in thre"+i);
}
}  
public static void main(String args[]) throws InterruptedException{ 

Multi t1=new Multi();  
t1.start();
for(int i=0;i<=100;i++) {
	System.out.println("i in main"+i);
}


 }  
}  