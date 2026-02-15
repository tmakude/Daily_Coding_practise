package New_Start;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.catalog.CatalogFeatures.Feature;

public class Main_Method {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Future<Integer> future = es.submit(() -> {
		    Thread.sleep(1000);
		    return 100;
		});
		
		




		

	}

}
