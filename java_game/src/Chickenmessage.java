public class Chickenmessage extends Thread {
    int num;
    chicken c; // 치킨 객체 생성 쓰레드에서 쓸거!!
    Banghak k;

    public Chickenmessage(chicken c) {
        this.c= c;
    }

    public void run() {

                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(45000);
                    } catch (InterruptedException ignored) {

                    }

                    if (k.money > 511000 || k.money < 0 || k.tiredness >= 500 || k.stress >= 500 || (k.day >= -1 && k.money < 511000))

                        break;

                    synchronized (this) {

                        System.out.println("─────────────────────────────*");
                        System.out.println();
                        System.out.println(" 꼬꼬꼬꼭...닭이 알을 낳았습니다 ");
                        System.out.println();
                        System.out.println("─────────────────────────────*");
                        c.spawn();
                    }
                }
            }
}
