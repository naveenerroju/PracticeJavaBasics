package basicpractice;

class Hi extends Thread{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("hi!");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}
class Hello extends Thread{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("hello!");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}

class Thread1{
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        try{
            hi.start();
            //sleeping for few seconds so those threads don't collide
            Thread.sleep(10);
            hello.start();
        } catch (Exception e){e.printStackTrace();}
    }
}
