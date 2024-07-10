package consumer;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {


    public static void main(String[] args) {


            ConsumerDemo obj=new ConsumerDemo();
            obj.accept(10);


    }


    @Override
    public void accept(Integer i) {
        System.out.println(i*i);

    }
}
