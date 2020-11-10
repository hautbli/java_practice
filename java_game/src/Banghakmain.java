
import java.io.File;
import java.util.Scanner;
    public class Banghakmain {

        public static  void main(String[] args) throws InterruptedException {
            Scanner sc = new Scanner(System.in); //  Scanner
                          String str;

            Me me = new Me(); //사용자 객체 생성
            Alba y = new Alba();// 알바 객체 생성
            Rest x = new Rest(); // 휴식 객체 생성
            Study z = new Study(); // 공부 객체 생성
            Store t= new Store(); // 상점 객체 생성
            Banghak k = new Banghak();//부모 클래스
            Loading r1 = new Loading("▒");//시작 로딩 쓰레드
            Loading r2 = new Loading("");//로딩 쓰레드 -- 언젠가 쓸지도...?
            Situation situation = new Situation();
            Mainmusic mainmusic = new Mainmusic();
            Musicthread musicthread= new Musicthread();

            chicken cm = new chicken(); //치킨
            Intromessage intromessage1 = new Intromessage(1); // 인트로 메세지 쓰레드1
            Intromessage intromessage2 = new Intromessage(2); // 게임 설명 쓰레드

            musicthread.start();

            r1.start();//로딩 쓰레드


            System.out.println("로 딩 중 ");

            r1.join();
            System.out.println();
            System.out.println("로 딩 완 료 ! 아무키나 누르고 엔터를 치세요!");
            String scNum = sc.next();

            intromessage1.start();   //인트로 메세지 쓰레드
            intromessage1.join();

           Muzic muzic = new Muzic ();
           muzic.start();


            System.out.println(" ");
            System.out.println(" ");

            System.out.println("▶▶캐릭터 이름을 입력하시오◀◀");

            me.name = sc.next(); // 이름을 입력받음

            System.out.println(" ");
            System.out.println(" ");

            System.out.println("1.게임 설명 후 시작 2. 게임 바로 시작");

            System.out.println("▶▶알맞는 번호를 선택하시오◀◀");

            loop6:
            while(true) {
                scNum = sc.next();

                switch (scNum) {
                    case "1": // 게임 설명
                        System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────────────── ");
                       intromessage2.start();
                       intromessage2.join();
                        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");

                    case "2": //게임 바로 시작
                        System.out.println(" ");
                        System.out.println("       ● 게임 난이도 ● ");
                        System.out.println(" [상] 5만원 이하 [중] 10만원 이하 [하] 20만원 이하 ");
                        System.out.println(" ");
                        System.out.println("▶▶소유 금액을 입력하시오◀◀ (최소 3만원 이상) ");
                        moneyloop:
                        while (true){
                            me.money = sc.nextInt(); // 소유금액을 입력받음

                            k.money = me.money;
                            if(me.money <30000) {
                                System.out.println("다시 입력하세요!");
                                continue moneyloop;
                            }
                            else
                                break;
                        }

                        System.out.println();

                        k.print(me);

                        loop://하루가 지나가는 루프

                        while (true) {  //미션 실패

                            if (k.money < 0) {
                                System.out.println();
                                System.out.println("미션 실패!! 돈이 마이너스 됐습니다! ");
                                System.exit(0);


                                break;
                            } else if (k.tiredness >= 500) {
                                System.out.println();
                                System.out.println("미션 실패!! 피곤도가 500이상 됐습니다! 과로로 쓰러져서 당분간 미션을 수행하지 못합니다! ");
                                System.exit(0);
                                break;

                            } else if (k.stress >= 500) {
                                System.out.println();
                                System.out.println("미션 실패!! 스트레스가 500이상 됐습니다! 번아웃 증후군으로 무기력해져서 미션을 수행하지 못합니다! ");
                                System.exit(0);
                                break;
                            } else if (k.day >= -1 && k.money < 511000) {
                                System.out.println();
                                System.out.println("미션 실패!! 납부일에 등록금을 납부하지 못했으므로 미션에 실패했습니다!");
                                System.exit(0);
                                break;
                            } else { // 미션 성공
                                if (k.money >= 511000 && k.tiredness < 500 && k.stress < 500 && k.day <= -1) {
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                                    System.out.println();
                                    System.out.println("기한 내에 등록금을 다 모았습니다! ");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("1.등록금 납부하기 2. 등록금 납부 안하기");
                                    System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                                    System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
                                    scNum = sc.next();

                                    if (scNum.equals("1")) { // 등록금 납부하기
                                        System.out.println();

                                        System.out.println("미션 성공!!!");
                                        System.out.println();
                                        if (k.selfexteem < 100) {
                                            System.out.println("자존감 결과 ==>> 방학동안 스스로를 돌보지 않았어요! 좀 더 자신을 바라보는 시간을 갖도록 하세요! ");
                                        } else if (k.selfexteem >= 100 && k.selfexteem < 200) {
                                            System.out.println("자존감 결과 ==>> 방학동안 자기만의 시간을 충분히 갖았군요!  좀 더 몰입할 시간이 있었으면 좋았을 거예요!");
                                        } else {
                                            System.out.println("자존감 결과 ==>> 방학동안 새로운 도전과 앞으로 무엇이든지 할 수 있는 자신감을 얻었군요! 훌륭해요!   ");
                                        }
                                        System.out.println();
                                        if (k.happiness < 300) {
                                            System.out.println("행복도 결과==>>힘들기만한 방학을 보냈셨네요! 앞으로 한 학기 힘낼 수 있겠죠..? ");
                                        } else if (k.happiness < 400 && k.happiness >= 300) {
                                            System.out.println("행복도 결과 ==>>행복하지만 힘든 방학을 보냈셨네요! 앞으로 한 학기도 힘내세요!");
                                        } else {
                                            System.out.println("행복도 결과 ==>>힘들지만 알찬 방학을 보내셨네요! 한학기도 이번 방학처럼 잘해낼 수 있을 거예요! ");
                                        }
                                        System.exit(0);
                                    }
                                    else {
                                        System.out.println();
                                        System.out.println(" 미선 실패!!! 등록금을 내지 않았으므로 미션에 실패했습니다!!");
                                        System.exit(0);
                                    }


                                    break;


                                }
                                else { // 미션 달성 중,,


                                    if(k.point==3){ // 사생결단4 저녁이라서..
                                        Choose c4 = new Choose (4,situation);
                                        c4.start();
                                        c4.join();


                                    }
                                    if(k.point==2) { // 사생결단3
                                        Choose c3 = new Choose(3, situation);
                                        c3.start();
                                        c3.join();
                                    }

                                    if(k.point==1){ // 사생결단2
                                        Choose c2 = new Choose (2,situation);
                                        c2.start();
                                        c2.join();
                                        if(k.money<0){
                                            continue loop;
                                        }
                                    }

                                    if(k.point==0) {// 사생결단 1
                                        Choose c1 = new Choose(1, situation);
                                        c1.start();
                                        c1.join();
                                        if(k.money<0){
                                            continue loop;
                                        }
                                    }

                                    if (k.point==4){
                                        Chickenmessage message3 = new Chickenmessage(cm); // 알 낳는 메세지
                                        message3.start();// 치킨 메세지 1분에 한번씩
                                    }

                                    Message message= new Message(); //등록금 납부 메세지
                                    message.start();// 등록금 납부


                                    backloop:
                                    while(true) {
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        System.out.println("▶▶하루를 어떻게 보낼지 선택하세요◀◀");
                                        System.out.println(" ");
                                        System.out.println(" ");

                                        System.out.println("1. 알바하기  2. 힐링하기  3. 공부하기 4. 알 확인하기 5. 상점가기 6.현재 상태 보기");

                                        scNum = sc.next(); // 보기 입력


                                        switch (scNum) {


                                            case "1":   // 알바하기
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("▶▶어떤 알바를 할건지 선택하시오◀◀");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("1. GS25 알바  2. 영화관 알바 3. 도미노 피자 알바 4. 고깃집 알바  5. 주유소 알바 6. 뒤로 가기");

                                                loop1:
                                                while (true) {

                                                    scNum = sc.next();


                                                    switch (scNum) {

                                                        case "1"://편의점
                                                            y.Convenience(me);
                                                            continue loop;

                                                        case "2"://영화관 알바
                                                            y.movie(me);
                                                            continue loop;

                                                        case "3"://피자
                                                            y.pizza(me);
                                                            continue loop;

                                                        case "4"://고깃집
                                                            y.meat(me);
                                                            continue loop;

                                                        case "5"://주유소 알바
                                                            y.oil(me);
                                                            continue loop;

                                                        case "6":
                                                            continue backloop;

                                                        default:
                                                            System.out.println("잘못 입력했습니다! 다시 입력하세요! ");
                                                            continue loop1;
                                                    }

                                                }


                                            case "2": // 힐링타임!!!

                                                loop3:
                                                while (true) {
                                                    System.out.println(" ");
                                                    System.out.println(" ");
                                                    System.out.println("▶▶힐링을 집에서 할지 밖에서 할지 선택하시오◀◀");
                                                    System.out.println(" ");
                                                    System.out.println(" ");
                                                    System.out.println("1. 집에서 휴식 2. 밖에서 놀기 3. 뒤로가기 ");
                                                    loop2:
                                                    while (true) {
                                                        scNum = sc.next();

                                                        switch (scNum) {

                                                            case "1":
                                                                System.out.println(" ");
                                                                System.out.println(" ");

                                                                System.out.println("1.배달음식 시켜먹기  2. 강아지 산책하기  3. 요리하기  4. 집 청소하기 5. 뒤로 가기 6.메인으로 가기");

                                                                scNum = sc.next();

                                                                switch (scNum) {
                                                                    case "1"://배달음식 시켜먹기
                                                                        x.deliveryfood(me);
                                                                        continue loop;

                                                                    case "2"://강아지 산책하기
                                                                        x.stroll(me);
                                                                        continue loop;

                                                                    case "3"://요리하기
                                                                        x.cook(me);
                                                                        continue loop;

                                                                    case "4"://집 청소하기
                                                                        x.cleaning(me);
                                                                        continue loop;


                                                                    case "5": // 뒤로가기!!
                                                                        continue loop3;

                                                                    case "6": // 메인으로 가기!!
                                                                        continue backloop;

                                                                    default:
                                                                        System.out.println("잘못 입력했습니다! 다시 입력하세요! ");
                                                                        continue loop;

                                                                }

                                                            case "2":
                                                                System.out.println(" ");
                                                                System.out.println(" ");
                                                                System.out.println("1.혼자서 영화보기  2. 친구와 맛집탐방하기  3. 만화방에서 종일 있기  4. 카페에서 책읽기 5. 뒤로 가기 6. 메인으로 가기  ");

                                                                loop5:
                                                                while (true) {
                                                                    scNum = sc.next();

                                                                    switch (scNum) {
                                                                        case "1"://혼자서 영화보기
                                                                            x.movie(me);
                                                                            continue loop;

                                                                        case "2"://친구와 맛집탐방
                                                                            x.gastroventure(me);
                                                                            continue loop;

                                                                        case "3"://만화방에서 종일 있기
                                                                            x.cartoon(me);
                                                                            continue loop;

                                                                        case "4"://카페에서 책읽기
                                                                            x.book(me);
                                                                            continue loop;

                                                                        case "5": // 뒤로가기!!
                                                                            continue loop3;

                                                                        case "6": // 메인으로 가기!!
                                                                            continue backloop;

                                                                        default:
                                                                            System.out.println("잘못 입력했습니다! 다시 입력하세요! ");
                                                                            continue loop5;
                                                                    }
                                                                }


                                                            case "3": //뒤로가기

                                                                continue backloop;

                                                            default:
                                                                System.out.println("잘못 입력했습니다! 다시 입력하세요! ");
                                                                continue loop2;

                                                        }
                                                    }
                                                }

                                            case "3": // 공부하기!!!
                                                System.out.println(" ");
                                                System.out.println(" ");

                                                System.out.println("▶▶어떤 공부를 할건지 선택하시오◀◀");
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("1. 토익 공부하기  2. 전공 공부하기 3. 영어 회화 공부하기 4. 독서 스터디 모임가기  5. 디자인 공부하기 (취미) 6.뒤로가기 ");

                                                loop5:
                                                while (true) {
                                                    scNum = sc.next();
                                                    switch (scNum) {
                                                        case "1"://영어 토익 공부
                                                            z.toeic(me);
                                                            continue loop;

                                                        case "2"://전공 공부
                                                            z.major(me);
                                                            continue loop;

                                                        case "3"://영어 회화 공부
                                                            z.speaking(me);
                                                            continue loop;

                                                        case "4"://독서 스터디 모임
                                                            z.bookstudy(me);
                                                            continue loop;

                                                        case "5"://디자인 공부 취미
                                                            z.design(me);
                                                            continue loop;

                                                        case "6": // 뒤로 가기!!
                                                            continue backloop;

                                                        default:
                                                            System.out.println("잘못 입력했습니다! 다시 입력하세요! ");
                                                            continue loop5;
                                                    }
                                                }

                                            case "4": // 현재 알 확인
                                                if(cm.egg1==0 && cm.egg2 ==0 && cm.egg3==0 ){
                                                    System.out.println(" ");
                                                    System.out.println("▶현재 갖고 있는 닭이 없습니다◀");
                                                    System.out.println(" ");
                                                }
                                                else {
                                                    cm.print();
                                                }
                                               continue backloop;


                                            case "5": //상점가기

                                                System.out.println(" 1. 알 팔기 2. 물건 사기 3.뒤로가기  ");

                                                loop4:
                                                while (true) {
                                                    scNum = sc.next();

                                                    switch (scNum) {
                                                        case "1": //물건 팔기
                                                            t.sell(cm);
                                                            continue backloop;


                                                        case "2": //물건 사기

                                                            System.out.println("▶▶무엇을 살지 선택하세요◀◀");
                                                            System.out.println(" ");
                                                            System.out.println(" ");
                                                            System.out.println("1. 에너지드링크 2. 커피 3. 초코우유 ");
                                                            scNum = sc.next();

                                                            switch (scNum) {
                                                                case "1":
                                                                    Loading2 drink = new Loading2(1, t);
                                                                    drink.start();
                                                                    drink.join();
                                                                    break;
                                                                case "2":
                                                                    Loading2 coffee = new Loading2(2, t);

                                                                    coffee.start();
                                                                    coffee.join();
                                                                    break;
                                                                case "3":
                                                                    Loading2 choco = new Loading2(3, t);
                                                                    choco.start();
                                                                    choco.join();
                                                                    break;



                                                            }
                                                            continue backloop;

                                                        case "3": //홈으로가기
                                                            continue backloop;


                                                        default:
                                                            System.out.println("잘못 입력했습니다! 다시 입력하세요! ");
                                                            continue loop4;
                                                    }
                                                }
                                            case "6" : //현재 상태 보기
                                                k.print(me);
                                                continue backloop;


                                        }
                                    }
                                }
                            }

                        }

                        break;
                    default:
                        System.out.println("잘못 입력했습니다! 다시 입력하세요!");
                        continue loop6;
                } break;
            }
        }

    }




