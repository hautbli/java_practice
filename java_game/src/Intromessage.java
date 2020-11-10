import org.w3c.dom.ls.LSOutput;

public class Intromessage extends Thread {
    int type;

    public Intromessage ( int type){
        this.type=type;
    }

    public void run() {
        switch (type) {
            case 1 :
            synchronized (this) {
                String[] name = new String[24];

                name[0] = ("                                        :::::::::::::::::::::::::");
                name[1] = ("                                        :::    :::     :::    :::");
                name[2] = ("                                        :::    ;;:     ;::   -;::");
                name[3] = ("                                        :::    ;;:     ;;~   :;;:");
                name[4] = ("                                        :::    ;;~     :;~   ;;;;");
                name[5] = ("                                        :::,   ;;.  -  -;,   ;;;;");
                name[6] = ("                                        :::,   ;;.  -  -;,   ;;;;");
                name[7] = ("                                        :-                     :;");
                name[8] = ("                                        :                      ;;");
                name[9] = ("                                        :,,,   .,  .,   ,   .,,;;");
                name[10] = ("                                        ::::   ,~  ~~   :   ~::;;");
                name[11] = ("                                        :-                     ;;");
                name[12] = ("                                        :                      ;;");
                name[13] = ("                                        :~~~   .   ~~,  ,   ~~~;;");
                name[14] = ("                                        ::;;,  .  .;;~  .   ;;;;;");
                name[15] = ("                                        :::;~     -;;;     .;;;;;");
                name[16] = ("                                        :::::     :;;;     -;;;;;");
                name[17] = ("                                        :::::     ;;;;     ~;;;;;");
                name[18] = ("                                        :::::     ;;;;     :;;;;;");
                name[19] = ("                                        :::::     ;;;;.    ;;;;;;");
                name[20] = ("                                        ;:::::;;;;;;;;;;;;;;;;;;;");
                name[21] = ("_______  _____                _______ _______ _______ _____ __   _  ______      _______ _     _ _____ _______ _____  _____  __   _");
                name[22] = ("|       |     | |      |      |______ |          |      |   | \\  | |  ____         |    |     |   |      |      |   |     | | \\  |");
                name[23] = ("|_____  |_____| |_____ |_____ |______ |_____     |    __|__ |  \\_| |_____|         |    |_____| __|__    |    __|__ |_____| |  \\_|");


                for (String string : name) {

                    System.out.println(string);

                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException ignored) {
                    }
                }

            } break;

            case 2 :
                synchronized (this) {
                    String[] name = new String[7];

                    name[0] = "다음 학기 반액 장학금을 받아 나머지 등록금을 모아야 합니다! ";
                    name[1] = " ";
                    name[2] = "개강 1일전까지 등록금 511,000원을 모아 납부하면 미션 성공!";
                    name[3] = " ";
                    name[4] =" 단, 스트레스와 피곤도가 500점을 넘으면 미션 실패!";
                    name[5] = " ";
                    name[6] = "※행복도와 자존감은 미션 성공의 조건은 아니지만 점수에 따라 미션결과가 다릅니다!";



                    for (String string : name) {

                        System.out.println(string);

                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ignored) {
                        }
                    }

                } break;

            case 3 :
                synchronized (this) {
                    String[] name = new String[7];

                    name[0] = "다음 학기 반액 장학금을 받아 나머지 등록금을 모아야 합니다! ";
                    name[1] = " ";
                    name[2] = "개강 1일전까지 등록금 511,000원을 모아 납부하면 미션 성공!";
                    name[3] = " ";
                    name[4] =" 단, 스트레스와 피곤도가 500점을 넘으면 미션 실패!";
                    name[5] = " ";
                    name[6] = "※행복도와 자존감은 미션 성공의 조건은 아니지만 점수에 따라 결과가 다릅니다!";



                    for (String string : name) {

                        System.out.println(string);

                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ignored) {
                        }
                    }

                } break;

        }


    }
}






















