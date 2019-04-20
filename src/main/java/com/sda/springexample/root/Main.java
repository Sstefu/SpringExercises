package com.sda.springexample.root;
import com.sda.springexample.production.Tool;
import com.sda.springexample.production.Worker;
import com.sda.springexample.production.WorkerMotto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String[] beans = new String[]{"tools.xml", "worker.xml"};
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
        Tool testTool = xmlApplicationContext.getBean(Tool.class);

        Worker testWorker =  xmlApplicationContext.getBean(Worker.class);
        Worker testWorker2 =  xmlApplicationContext.getBean(Worker.class);

        if(testWorker.equals(testWorker2)){
            System.out.println("Workers are the same" );
            System.out.println(testWorker + " " + testWorker2);

        }else  {
            System.out.println("Workers aren't the same");
            System.out.println(testWorker + " " + testWorker2);
        }
    }
}
