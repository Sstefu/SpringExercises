package com.sda.springexample.root;
import com.sda.springexample.config.WorkerConfig;
import com.sda.springexample.postprocessor.MyOwnPostProcessor;
import com.sda.springexample.production.Tool;
import com.sda.springexample.production.Worker;
import com.sda.springexample.production.WorkerMotto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {



        String[] beans = new String[]{"tools.xml", "worker.xml"};

        //this uses a resurce of type xml
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
        Worker testWorker =  xmlApplicationContext.getBean(Worker.class);
        System.out.println(testWorker);
        MyOwnPostProcessor myOwnPostProcessor = xmlApplicationContext.getBean(MyOwnPostProcessor.class);
//        System.out.println(myOwnPostProcessor);
        ((ClassPathXmlApplicationContext) xmlApplicationContext).close();
//        Tool testTool = xmlApplicationContext.getBean(Tool.class);
        //this uses a resource type configuration
//        ApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext(WorkerConfig.class);
//        WorkerMotto annotationWorkerMotto = annotationApplicationContext.getBean(WorkerMotto.class);
//        System.out.println(annotationWorkerMotto);






/*
        if(testWorker.equals(testWorker2)){
            System.out.println("Workers are the same" );
            System.out.println(testWorker + " " + testWorker2);

        }else  {
            System.out.println("Workers aren't the same");
            System.out.println(testWorker + " " + testWorker2);
        }*/
    }
}
