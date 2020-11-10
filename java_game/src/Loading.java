public class Loading extends Thread{

    String str;
    public Loading (String str){
        this.str=str;
    }

    public void run (){
     for (int i = 0 ; i < 40; i++){
         System.out.print(str);

         try {
             Thread.sleep((int)50);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
        System.out.println("✓");

    }

}
