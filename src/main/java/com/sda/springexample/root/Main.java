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
        System.out.println(testWorker.getAge());
        System.out.println(testWorker.getProffesion());
        System.out.println(testTool.getWeight() + " " + testTool.getName() );
        System.out.println();

    }
}
