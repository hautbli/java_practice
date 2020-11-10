import java.util.Scanner;

public class Store extends Banghak {

    Scanner sc2 = new Scanner(System.in);


    public synchronized void buy1() {//에너지드링크

        for (int i = 0; i <= 5; i++) {

                System.out.println("────────────────────────────");
                System.out.println("꿀꺽 !! 피곤도" + (tiredness - i * 10) + "   스트레스" + (stress - i * 10)); // 누적 피곤액에서 빼고싶운뎃....
                System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("────────────────────────────");
        System.out.println(" 아~~ 이제 좀 살겠다!! ");
        System.out.println();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("6000원 지출했습니다 ");
        System.out.println();
        System.out.println("피곤도 50점과 스트레스 50점이 감소되었습니다");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        money -= 6000;
        tiredness -= 50;
        stress -= 50;


    }

    public void buy2() {//커피

        for (int i = 0; i <= 5; i++) {
            synchronized (this) {
                System.out.println("────────────────────────────");
                System.out.println("꿀꺽!! 피곤도" + (tiredness - i * 8) + "   스트레스" + (stress - i * 7)); // 누적 피곤액에서 빼고싶운뎃....
                System.out.println();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("────────────────────────────");
        System.out.println();
        System.out.println(" 드디어 정신이 좀 드네.. !! ");
        System.out.println();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("5000원 지출했습니다 ");
        System.out.println();
        System.out.println("피곤도 40점과 스트레스 35점이 감소되었습니다");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        money -= 5000;
        tiredness -= 40;
        stress -= 35;


    }

    public void buy3() {//초코우유

        for (int i = 0; i <= 5; i++) {

            synchronized (this) {
                System.out.println("────────────────────────────");
                System.out.println("꿀꺽!! 피곤도" + (tiredness - i * 6) + "   스트레스" + (stress - i * 7));
                System.out.println();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
        System.out.println("────────────────────────────");
        System.out.println(" 단게 들어오니까 좋다!!! ");
        System.out.println();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("4000원 지출했습니다 ");
        System.out.println();
        System.out.println("피곤도 30점과 스트레스 35점이 감소되었습니다");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        money -= 4000;
        tiredness -= 30;
        stress -= 35;


    }

    public void sell(chicken cm) {
        cm.print();
        if (cm.egg1 < 5 && cm.egg2 < 1) {
            System.out.println();
            System.out.println("▶팔 수 있는 알이 없습니다◀");
            System.out.println();
            System.out.println("※유정란은 5개 이상 부터 팔 수 있습니다");
            System.out.println();
            System.out.println();
        } else {
            System.out.println("※유정란은 5개씩 세트로 팔 수 있습니다 ");



            int num;

                loop2:
                while (true) {
                    System.out.println();
                    System.out.println();

                    System.out.println("▶어떤 알을 파시겠습니까? ◀");
                    System.out.println();
                    System.out.println();
                    System.out.println(" 1. 유정란 2. 황금알 3.꽝알 4.그만팔기 ");
                    String scNum = sc.next();

                    switch (scNum) {
                        case "1": //유정란 팔기
                            if (cm.egg1<5){
                                System.out.println("유정란은 5개이상부터 팔 수 있습니다");
                                continue loop2;
                            }
                            else {

                            System.out.println("▶유정란 팔 개수를 입력하세요◀");

                            loop:
                            while (true) {
                                num = sc2.nextInt();
                                if (num > cm.egg1) {
                                    System.out.println("▶갖고 있는 유정란의 개수보다 더 많이 팔 수 없습니다◀");
                                } else if (num % 5 < 5 && num % 5 != 0) {

                                    num = sc2.nextInt();

                                    System.out.println("▶5개씩만 팔 수 있습니다. 다시 입력해주세요◀");
                                    continue loop;
                                } else if (num % 5 == 0 && num >= 5) {
                                    money += num * 5000; // 유정란 판만큼 돈 범
                                    cm.egg1 -= num;  // 유정란 판 개수
                                    // 만큼 차감

                                    System.out.println("▶유정란 " + num + "개를 팔고 " + num * 5000 + "원을 벌었습니다◀");
                                    break;

                                }

                            }
                        }
                            continue loop2;


                        case "2": //황금알 팔기

                            if (cm.egg2 > 0) {

                                System.out.println("▶황금알을 팔 개수를 입력하세요◀");

                                loop1:
                                while (true) {

                                    num = sc2.nextInt();

                                    if (num > cm.egg2) {
                                        System.out.println("▶갖고 있는 황금알의 개수보다 더 많이 팔 수 없습니다◀");
                                        continue loop1;

                                    } else if (num == 0) {
                                        System.out.println("▶황금알 0개는 팔 수 없습니다. 다시 입력하세요◀");

                                        continue loop1;

                                    } else {
                                        money += num * 15000; // 황금알 판만큼 돈 범
                                        cm.egg2 -= num;  // 황금알 판 개수
                                        // 만큼 차감


                                        System.out.println("▶황금알 " + num + "개를 팔고 " + num * 15000 + "원을 벌었습니다◀");
                                        break;
                                    }
                                }
                            }
                            continue loop2;

                        case "3":
                            System.out.println("");
                            System.out.println("[상점주인] 예끼 이 학생아!!! 장난해?!!! 어디서 꽝알을 팔아 당장 나가! ");

                            System.out.println("");

                            break;

                        case "4":
                            break;


                        default:
                            System.out.println("잘못입력하셨습니다. 다시 입력하세요!");
                            continue loop2;
                    }
                    break;
                }

        }
    }

}