public class Choose extends Thread {
    public Object wait;
    int type;
    Situation situation;
    Banghak k;

    public Choose(int type, Situation situation) {
        this.type = type;
        this.situation = situation;
    }
int p;

    public void run() {
        switch (type) {
            case 1:
                p = (int) (Math.random() * 3 + 1);
                switch (p) {
                    case 1:
                        break;
                    case 2:
                        situation.Situation1();
                        break;
                }
            break;

            case 2:
                p = (int) (Math.random() * 2 + 1);
                switch (p) {
                    case 1:
                        break;
                    case 2:
                        situation.Situation2();
                        break;
                    case 3:
                        break;
                }
                break;
            case 3:
                p = (int) (Math.random() * 2 + 1);
                switch (p) {
                    case 1:
                        break;
                    case 2:
                        situation.Situation3();
                        break;

                }
                break;
            case 4:

                situation.Situation4();
                    break;


        }



    }


}


