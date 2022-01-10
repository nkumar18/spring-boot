package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class TestStopWatchRunner implements CommandLineRunner {
	public void run(String... args) throws Exception {
		System.out.println("STARTED..");
		StopWatch st = new StopWatch("FULL TASK"); 
		
		st.start("LOOP#1");
		for (int i = 1; i < 999999999; i++) {
			Math.pow(i*i*i,Math.pow(2*i+1, i*i));
		}
		st.stop();
		
		st.start("LOOP#2");
		for (int i = 1; i < 999888999; i++) {
			Math.pow(i*i*i,Math.pow(2*i+1, i*i));
		}
		st.stop();
		
		st.start("LOOP#3");
		for (int i = 1; i < 888999999; i++) {
			Math.pow(i*i*i,Math.pow(2*i+1, i*i));
		}
		st.stop();
		
		String output = st.prettyPrint();
		System.out.println(output);
		
		System.out.println("SEC "+st.getTotalTimeSeconds());
		System.out.println("Mill SEC "+st.getTotalTimeMillis());
		System.out.println("Nano SEC "+st.getTotalTimeNanos());
		
		System.out.println("FINISHED..");
		
	}


}
