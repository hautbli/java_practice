public class Loading2 extends Thread{// 상점에서 회복 할때 로딩 쓰레드

    int type;
    Store store;

    public Loading2 ( int type, Store store){
        this.type=type;
        this.store=store;
    }

    public void run () {
        switch (type) {
          case 1: store.buy1(); break;

          case 2: store.buy2(); break;

          case 3: store.buy3(); break;


        }

    }
}
