import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Alba extends Banghak  {

    int ppoint = 0 ; //벌점..

    public void penaltypoint()
    {
        ppoint +=10;
        System.out.println("▶벌점 10점을 받았습니다◀ ");
        System.out.println();
        System.out.println("▶누적 벌점 : "+ppoint+"점◀");
        System.out.println();
        System.out.println("※주의: 벌점 30점 이상이면 일당을 받지 못합니다");
    }



    public void Convenience(Me me) // 편의점
    {
        ppoint=0;

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 시재 점검 해주세요 ~");
        System.out.println();
        System.out.println();
        System.out.println("1. 네 ! 지폐를 세면서 시재를 맞춘다 ");
        System.out.println("2. 저 돈을 잘 못세서.. 어차피 카드결제만 있잖아요? ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        String scNum = sc.next();

        switch (scNum) {//편의점 상황1
            case "1":
                System.out.println("");
                System.out.println("[알바 선배] " + me.name + "씨 훌륭하네요!");
                System.out.println("");
                break;

            case "2":
                System.out.println("");
                System.out.println("[알바 선배] 돈 세는게 뭐가 그리 어려운일이라고 ,,, 차라리 제가 셀게요 ");
                System.out.println();
                System.out.println("");
                penaltypoint();
                break;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 손님이 오시면 안녕하세요 GS25입니다라고 해주세요 ~");
        System.out.println();
        System.out.println();
        System.out.println("손님이 들어온다. ");
        System.out.println();
        System.out.println();
        System.out.println("1. 안녕하세요~ GS25입니다~! ");
        System.out.println("2. 안녕하세요~ CU입니다~! ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//편의점 상황2
            case "1":
                System.out.println("");
                System.out.println("[알바 선배] " + me.name + "씨 목소리가 아주 크시네요!");
                System.out.println("");
                break;


            case "2":
                System.out.println("");
                System.out.println("[알바 선배] : 뭐라구요?? 장난치지 마세요!  ");

                System.out.println();
                System.out.println();

                penaltypoint();

                break ;

            default:
                System.out.println("no");
                break;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 김밥이랑 음료 유통기한 체크해서 폐기할거 모아주세요 ~");
        System.out.println();
        System.out.println();
        System.out.println("1. 네~  하나하나 일일이 체크한다 ");
        System.out.println("2. 네~ 앞에줄만 보고 뒷부부은 체크하지 않는다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();
        switch (scNum) {//편의점 상황3
            case "1":
                System.out.println("");
                System.out.println("[알바 선배] " + me.name + "씨 수고하셨어요~");
                System.out.println("");
                break;


            case "2":
                System.out.println("");
                System.out.println("[알바 선배] : 이거 뒤에거는 제대로 검수 안하신거 같은데요?");
                System.out.println("");

                penaltypoint();
                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("초등학생 손님이 라면을 먹다가 바닥에 국물을 많이 흘렸다 ");
        System.out.println();
        System.out.println();
        System.out.println("[알바 선배] " +me.name+ "씨 대걸레 가져와서 저기 좀 치워주세요~ ");
        System.out.println();
        System.out.println();
        System.out.println("1. 대걸레를 가져와서 닦는다  ");
        System.out.println("2. 대걸레를 초등학생 손님에게 넘긴다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//편의점 상황4
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] " + me.name + "씨 청소를 참 잘하시네요!!");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] : 손님!! 죄송합니다 !! ");
                System.out.println("" +
                        "");

                penaltypoint();

                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 진상손님이 계산하면서 돈을 던졌다 ");
        System.out.println();
        System.out.println();
        System.out.println("1. 잔돈을 거슬러준다   ");
        System.out.println("2. 손님한테 잔돈을 던져준다 ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//편의점 상황5
            case "1":
                System.out.println("");
                System.out.println("[알바 선배] " + me.name + "씨 너무 마음 상해하지말아요~ 잘했어요...!");
                System.out.println("");
                break;


            case "2":
                System.out.println("");
                System.out.println("[알바 선배] : 손님!! 죄송합니다 !! "+me.name+"씨 그렇다고 돈을 던지면 어떡해요?!");
                System.out.println("");

                penaltypoint();
                break ;
        }
        if (ppoint>=30)
        {
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("벌점이 30점 이상이 됐으므로 일당을 받지 못했습니다. ");
            System.out.println("하지만 일은 하루동안 했기 때문에 피곤도 50점과 스트레스 80점이 증가했습니다. ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

            tiredness+= 50; // 피곤도 80증가
            stress+= 80;  //스트레스  80증가
            day ++;
            print(me);

        }
        else if (ppoint <30 && ppoint>10)
        { money += 80000; // 돈 50,100원 씩증가
            tiredness+= 30; // 피곤도 80증가
            stress+= 70;  //스트레스  80증가
            day ++;
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
            System.out.println(" 하지만 피곤도 30점과 스트레스가 70점이  증가했습니다.  ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            print(me);

        }
        else {
            money += 80000; // 돈 50,100원 씩증가
            tiredness+= 50; // 피곤도 80증가
            stress+= 80;  //스트레스  80증가
            day ++;
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
            System.out.println(" 하지만 피곤도 50점과 스트레스가 80점이  증가했습니다.  ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            print(me);

        }
    }

    public void movie(Me me) // 영화관 알바
    {
        ppoint=0;

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 카라멜 팝콘 2개 주문이요~ ");
        System.out.println();
        System.out.println();
        System.out.println("1. 팝콘을 만든다 ");
        System.out.println("2. 팝콘 만들다가 맛있어 보여서 몰래 먹는다 ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        String scNum = sc.next();

        switch (scNum) {//영화관 상황1
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배]  고마워요~ ");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("");
                System.out.println("[알바 선배] : 손님 앞에서 그걸 드시면 어떡해요! ");
                System.out.println("");

                penaltypoint();
                break;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 상영관 청소하러 가요~ ");
        System.out.println();
        System.out.println();
        System.out.println("[알바 선배]  어 여기 분실물이 있네?? 이것 좀 데스크에 갖다 주고 올래요? ");
        System.out.println();
        System.out.println();
        System.out.println("1. 네~ 데스크에 갖다 주고 다시 청소하러 온다 ");
        System.out.println("2. 네~ 데스크에 갖다 주고 다시 청소하러 오지 않는다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//영화관 상황2
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배]  청소 힘들죠? 그래도 같이하니까 금방 끝나네요 ");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] : 청소도 하러 안오고 대체 뭐하는 사람이야! ");
                System.out.println("" +
                        "");

                penaltypoint();

                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배]: 5상영관 입장 시작합니다~~");
        System.out.println();
        System.out.println();
        System.out.println("입장하는 손님 중 바닥에 침을 뱉는다");
        System.out.println();
        System.out.println();
        System.out.println("1. 침 뱉은 손님이 지나간 후에 닦는다 ");
        System.out.println("2. 침 뱉은 손님을 따라가서 영화관 에티켓을 설명해준다 ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//영화관 상황3
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배]: 에티켓 안지키는 손님들 가끔 계세요.. 힘내요!  ");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[손님] 뭐야 당신?! 여기 점장 누구야!! ");
                System.out.println("" +
                        "");

                penaltypoint();
                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 영화 상영관 내부에 인원 수에 따라 ");
        System.out.println("          온도가 달라지니 1시간마다 온도체크해주세요  ");
        System.out.println();
        System.out.println();
        System.out.println("1. 1시간마다 온도 체크하고  알맞게 온도 조절을 한다");
        System.out.println("2. 영화 시작할 때만 온도 체크를 한다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//피자 도미노 상황4
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] " + me.name + "씨 적정온도로 잘 맞추셨네요!");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[손님] 상영관 내부가 너무 더웠어요!!!  ");
                System.out.println("[알바 선배] : 죄송합니다!!!!");
                System.out.println("" +
                        "");

                penaltypoint();

                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" [알바 선배] : "+me.name+"씨 미성년자관람불가 영화는 꼭 신분증 체크해주세요!");
        System.out.println();
        System.out.println();
        System.out.println("어려보이는 손님이 들어온다 (누가봐도 미성년자)");
        System.out.println();
        System.out.println();
        System.out.println("[손님] 영화 아저씨요! ");
        System.out.println();
        System.out.println();
        System.out.println(me.name+": 네~ 신분증 보여주세요!");
        System.out.println();
        System.out.println();
        System.out.println("[손님]  죄송해요.. 까먹고 안가져왔어요! 한번만 봐주세요! 헤헤.. ");
        System.out.println();
        System.out.println();
        System.out.println("1. 이번만 봐드릴게요!! 비밀이에요!!");
        System.out.println("2. 죄송합니다.. 신분증 확인 안되시면 관람 불가능하세요..! ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//영화관 상황5
            case "1":
                System.out.println("");
                System.out.println("[알바 선배]  봐주면 안된다고 했잖아요..!!!  ");
                System.out.println("");

                penaltypoint();
                break;


            case "2":
                System.out.println("");
                System.out.println("[알바 선배] : 잘하셨어요~ 아무리 애원해도 저희 방침상 절대 넘어가시면 안돼요!  ");
                System.out.println("");

                break ;
        }

        if (ppoint>=30)
        {System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("벌점이 30점 이상이 됐으므로 일당을 받지 못했습니다. ");
            System.out.println("하지만 일은 하루동안 했기 때문에 피곤도 60점과 스트레스 80점이 증가했습니다. ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            tiredness+= 60; // 피곤도100증가
            stress+= 80;  //스트레스  80증가
            day ++;
            print(me);

        }
        else if (ppoint <30 && ppoint>10)
        { money += 80000; // 돈 50,100원 씩증가
            tiredness+= 50; // 피곤도 80증가
            stress+= 60;  //스트레스  80증가
            day ++;
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
            System.out.println(" 하지만 피곤도 50점과 스트레스가 60점이  증가했습니다.  ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            print(me);

        }
        else {
            money += 80000; // 돈 50,100원 씩 증가
            tiredness+= 60; // 피곤도100증가
            stress+= 80;  //스트레스  80증가
            day ++;
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
            System.out.println(" 하지만 피곤도 60점과 스트레스가 80점이  증가했습니다.  ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            print(me);

        }

    }

    public void pizza(Me me) // 피자가게

        {  ppoint=0;

            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("[알바 선배] " +me.name+ "씨 일 시작하기 전에 구호를 외쳐야 해요!");
            System.out.println("          도미노도미노 셀 모어 피자 해브 모어 풘~!!!");
            System.out.println();
            System.out.println();
            System.out.println("1. 전 안할게요.... ");
            System.out.println("2. 우와..! 도미노도미노 셀 모어 피자 해브 모어 풘!!!!");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            String scNum = sc.next();

            switch (scNum) {//피자 상황1
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] " + me.name + "씨  저희가 부끄러우시군요.... ! ");
                    System.out.println("" +
                            "");
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 예~~ 도미노도미노 짱!!! (흐뭇) ");
                    System.out.println("" +
                            "");
                    break;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("[알바 선배] " +me.name+ "씨 식자재 준비하러 냉장고로 같이가요 ~");
            System.out.println();
            System.out.println();
            System.out.println("냉장고에 알바 선배와 같이 들어간다. ");
            System.out.println();
            System.out.println();
            System.out.println("1. 선배님 이렇게 챙기면 될까요?? ");
            System.out.println("2. 어우 너무 추워요..!!!! 저 나갈래요!!! ");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//도미노 피자 상황2
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배]  네~ 그렇게 갖고 나가시면 돼요 ^^ ");
                    System.out.println("" +
                            "");
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 에휴 !! 춥지만 같이 해야죠!!! ");
                    System.out.println("" +
                            "");

                    penaltypoint();

                    break ;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("[손님] 사이다 좀 더 주세요~");
            System.out.println();
            System.out.println();
            System.out.println("1. 사이다에 얼음을 조금 넣어서 갖다준다 ");
            System.out.println("2. 얼음에 사이다를 조금 넣어서 갖다준다");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//도미노 피자 상황3
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[손님] 감사합니다~");
                    System.out.println("" +
                            "");
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[손님]  얼음만 이렇게 주시면 어떡해요??");
                    System.out.println("" +
                            "");

                    penaltypoint();
                    break ;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("피자배달주문이 들어왔다.  ");
            System.out.println();
            System.out.println();
            System.out.println("[알바 선배] " +me.name+ "씨 피자 배달 좀 부탁해요~  ");
            System.out.println();
            System.out.println();
            System.out.println("1. 배달하고 주문한  손님들과 노닥거리다 온다");
            System.out.println("2. 배달하고 바로 돌아온다");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//피자 도미노 상황4
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] " + me.name + "씨 대체 뭘하다가 이렇게 늦게오는거예요??!");
                    System.out.println("" +
                            "");

                    penaltypoint();
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 배달을 참 잘하시네요~ 다음 주문도 드릴게요~!  ");
                    System.out.println("" +
                            "");

                    break ;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println(" [알바 선배] : "+me.name+"씨 피자박스 접으세요~");
            System.out.println();
            System.out.println();
            System.out.println("1. 기생충에 나온거요?? 그거 다른 업체에 맡기시죠??");
            System.out.println("2. 네~  피자박스를 하나하나 따라 만든다 ");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//도미노 피자 상황5
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배]  에휴.. 카운터나 보세요.. ");
                    System.out.println("" +
                            "");

                    penaltypoint();
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 네 이렇게 이렇게 접으면 됩니다~ ");
                    System.out.println("" +
                            "");

                    break ;
            }
            if (ppoint>=30)
            {   System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("벌점이 30점 이상이 됐으므로 일당을 받지 못했습니다. ");
                System.out.println("하지만 일은 하루동안 했기 때문에 피곤도 60점과 스트레스 70점이 증가했습니다. ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness+= 60; // 피곤도100증가
                stress+= 70;  //스트레스 70증가
                day ++;
                print(me);

            }
            else if (ppoint <30 && ppoint>10)
            { money += 80000; // 돈 50,100원 씩증가
                tiredness+= 50; // 피곤도 80증가
                stress+= 50;  //스트레스  80증가
                day ++;
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
                System.out.println(" 하지만 피곤도 50점과 스트레스가 60점이  증가했습니다.  ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                print(me);

            }
            else {
                money +=80000; // 돈 50,100원 씩 증가
                tiredness+= 60; // 피곤도100증가
                stress+= 70;  //스트레스 70증가
                day ++;
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
                System.out.println(" 하지만 피곤도 60점과 스트레스가 70점이  증가했습니다.  ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                print(me);

            }
        }


    public void meat(Me me) // 고깃집
    {
        ppoint=0;

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("[알바 선배] " +me.name+ "씨 오늘 팔 고기 좀 1인분에 160그램씩 잘라 주세요!");
        System.out.println();
        System.out.println();
            System.out.println("1. 네~ 저울에 재면서 고기를 썬다");
            System.out.println("2. 네~ 자신의 감각에 의존하여 무게를 재면서 썬다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            String scNum = sc.next();

            switch (scNum) {//고깃집 상황1
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] " + me.name + "씨  정확하게 잘 자르셨네요!  ");
                    System.out.println("" +
                            "");
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 정확하게 그램 수를 맞추셔야죠! ");
                    System.out.println("" +
                            "");

                    penaltypoint();
                    break;
            }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("[알바 선배] " +me.name+ "씨 채소 좀 같이 닦아요~");
        System.out.println();
        System.out.println();
            System.out.println("물이 너무 차갑다 ");
        System.out.println();
        System.out.println();
            System.out.println("1. 물이 너무 차갑네요! 그래도 하나하나 깨끗이 닦아야겠어요!");
            System.out.println("2. 손이 얼거 같아요! 하고 뜨거운 물을 튼다.. 채소가 다 죽는다  ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//고깃집 상황2
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배]  네~ 저도 많이 시렵네요.. 같이 힘내요!");
                    System.out.println("" +
                            "");
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 채소가 다 죽었잖아요!! 저리 가세요! ");
                    System.out.println("" +
                            "");

                    penaltypoint();

                    break ;
            }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("[알바 선배] " +me.name+ "씨 여기 쌈장이랑 기름장 좀 각 그릇에 담아주세요~");
        System.out.println();
        System.out.println();
            System.out.println("1. 쌈장은 쌈장 그릇에 기름장은 기름장 그릇에 담는다   ");
            System.out.println("2. 어차피 위에 들어가면 똑같은데... 한 그릇에 담는다 ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//고깃집 상황3
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] " +me.name+ "씨 깨끗하게 잘 담으셨네요~");
                    System.out.println("" +
                            "");
                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배]  이렇게 섞어서 담으면 어떡해요?!");
                    System.out.println("" +
                            "");

                    penaltypoint();
                    break ;
            }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("손님들이 가고 테이블이 지저분하다. ");
        System.out.println();
        System.out.println();
            System.out.println("[알바 선배] " +me.name+ "씨 방금 나간 테이블 청소 해주세요~ ");
        System.out.println();
        System.out.println();
            System.out.println("1. 그릇과 쓰레기를 바로바로 정리한다");
            System.out.println("2. 못들은척 한다");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//고깃집 상황4
                case "1":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] " + me.name + "씨 청소를 아주 잘하시네요~!");
                    System.out.println("" +
                            "");

                    break;


                case "2":
                    System.out.println("" +
                            "");
                    System.out.println("[알바 선배] : 아휴!! 그냥 내가 하는게 낫지!! ");
                    System.out.println("" +
                            "");

                    penaltypoint();


                    break ;
            }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println(" [손님] 여기 소주 2병이요~!");
        System.out.println();
        System.out.println();
            System.out.println("1. 네~ 소주 두병 드릴게요~");
            System.out.println("2. 아휴 지겨워.. 소주 열병 갖다줘야겠다! ");
            System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
            scNum = sc.next();

            switch (scNum) {//고깃집 상황 5
                case "1":
                    System.out.println("");
                    System.out.println("[손님] 감사합니다~");
                    System.out.println("");
                    break;


                case "2":
                    System.out.println("");
                    System.out.println("[손님 ] 이렇게 많이 주시면 어떡해요?!! ");
                    System.out.println("");

                    penaltypoint();

                    break ;
            }
            if (ppoint>=30)
            {
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("벌점이 30점 이상이 됐으므로 일당을 받지 못했습니다. ");
                System.out.println("하지만 일은 하루동안 했기 때문에 피곤도 70점과 스트레스 100점이 증가했습니다. ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");


                tiredness+= 70; // 피곤도150증가
                stress+= 100;  //스트레스 100증가
                day ++;
                print(me);

            }
            else if (ppoint <30 && ppoint>10)
            { money += 90000; // 돈 50,100원 씩증가
                tiredness+= 60; // 피곤도 80증가
                stress+= 80;  //스트레스  80증가
                day ++;
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
                System.out.println(" 하지만 피곤도 60점과 스트레스가 80점이  증가했습니다.  ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                print(me);

            }
            else {
                money +=90000; // 돈 55,200원 씩 증가
                tiredness+= 70; // 피곤도150증가
                stress+= 100;  //스트레스 100증가
                day ++;
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 9만원을 받았습니다!  ");
                System.out.println(" 하지만 피곤도 70점과 스트레스가 100점이  증가했습니다.  ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                print(me);

            }


    }

    public void oil(Me me) // 주유소 알바
    {
        ppoint=0;

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 주유를 할 때 유종을 꼭 2 번 이상 체크해야해요");
        System.out.println();
        System.out.println();
        System.out.println(" 차가 한 대 들어온다");
        System.out.println();
        System.out.println();
        System.out.println(" [4손님] 경유 가득이요 ");
        System.out.println();
        System.out.println();
        System.out.println("1. 경유 가득! 경유 가득 맞습니까? 경유 가득 넣습니다~ ");
        System.out.println("2. 경유 가득! 경유 가득 맞습니까? 휘발유 가득 넣습니다~");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        String scNum = sc.next();

        switch (scNum) {//주유소 상황1
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] " + me.name + "씨  목소도리도 크고 잘 반복하면서 하네요!  ");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] : 휘발유 말고 경유 가득이잖아요! 큰일날뻔 했네요!! ");
                System.out.println("" +
                        "");

                penaltypoint();
                break;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 손님들 결제할 때 보너스 카드 결제하시면 선물을 꼭 챙겨주세요~");
        System.out.println();
        System.out.println();

        System.out.println("1. 보너스 카드 결제하고 선물도 드린다 ");
        System.out.println("2. 보너스 카드 결제하고 선물이 탐나서 주지 않고 주머니에 넣는다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//주유소 상황2
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배]: 잘 챙겨드렸어요! ");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] : 선물을 안드리고 가지면 어떡해요?! ");
                System.out.println("" +
                        "");

                penaltypoint();

                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[알바 선배] " +me.name+ "씨 세차하고 나온 차량 걸레로 같이 닦아요 ");
        System.out.println();
        System.out.println();
        System.out.println("[손님] 여기 안쪽까지 좀 닦아주실래요??");
        System.out.println();
        System.out.println();
        System.out.println("1. 네?? 아니요;; 안쪽은 알아서 닦으세요~ ");
        System.out.println("2. 네??? 아... 잠시만요 닦아드릴게요.. ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//주유소 상황3
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[손님] 뭐라구?? 당신 지금 그게 무슨 태도야! 여기 점장 누구야!");
                System.out.println("" +
                        "");

                penaltypoint();
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배]  가끔 그런 손님이 있어.. 잘 대처했어요..!");
                System.out.println("" +
                        "");
                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("주유소 앞 길에 낙엽이 많이 쌓여있다 ");
        System.out.println();
        System.out.println();
        System.out.println("[알바 선배] " +me.name+ "씨 앞에 낙엽 청소 좀 해주세요~ ");
        System.out.println();
        System.out.println();
        System.out.println("1. 청소도구를 가져와 꼼꼼히 낙엽을 쓸어 모은다");
        System.out.println("2. 청소도구를 가져와 낙엽을 대충 모아 버린다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//주유소 상황4
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] " + me.name + "씨 낙엽 청소를 잘해서 거리가 환하네요~!");
                System.out.println("" +
                        "");
                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[알바 선배] : 낙엽이 아직도 많이 있는데요 이거 한거 맞아요?");
                System.out.println("" +
                        "");

                penaltypoint();


                break ;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" [연예인 손님] 제가 좀 급한데 여기 경유 가득이요~ 빨리 부탁드려요! ");
        System.out.println();
        System.out.println();
        System.out.println("1. 엄청 유명한 연예인이잖아? 저 사진이랑 싸인  좀 부탁드려요!! 제발요!!~");
        System.out.println("2. 사진 찍고 싶지만.. 급하신 모양이네 얼른 가득 드려야겠다!  ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//주유소 상황 5
            case "1":
                System.out.println("" +
                        "");
                System.out.println("[연예인 손님] 다음에요... 제가 너무 급해서요!!!얼른 주유해주세요!! ");
                System.out.println();
                System.out.println();
                System.out.println("[알바 선배]: "+me.name+"씨~ 지금 그게 문제예요? 주유 먼저죠!!! ");
                System.out.println("[알바 선배]: "+me.name+"씨~ 지금 그게 문제예요? 주유 먼저죠!!! ");
                System.out.println("" +
                        "");
                System.out.println("벌점 10점을 받는다. ");
                System.out.println();
                System.out.println();
                System.out.println("▶주의: 벌점 30점 이상이면 일당을 받지 못합니다◀ ");
                penaltypoint();

                break;


            case "2":
                System.out.println("" +
                        "");
                System.out.println("[연예인 손님 ] 네 감사해요~  ");
                System.out.println("" +
                        "");

                break ;
        }
        if (ppoint>=30)
        {
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("벌점이 30점 이상이 됐으므로 일당을 받지 못했습니다. ");
            System.out.println("하지만 일은 하루동안 했기 때문에 피곤도 70점과 스트레스 100점이 증가했습니다. ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");


            tiredness+= 70; // 피곤도150증가
            stress+= 100;  //스트레스 100증가
            day ++;
            print(me);

        }
        else if (ppoint <30 && ppoint>10)
        { money += 80000; // 돈 50,100원 씩증가
            tiredness+= 60; // 피곤도 80증가
            stress+= 80;  //스트레스  80증가
            day ++;
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
            System.out.println(" 하지만 피곤도 60점과 스트레스가 80점이  증가했습니다.  ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            print(me);

        }
        else {
            money +=80000; // 돈 55,200원 씩 증가
            tiredness+= 70; // 피곤도150증가
            stress+= 100;  //스트레스 100증가
            day ++;
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println(" 오늘의 알바가 무사히 끝났습니다! 일당 8만원을 받았습니다!  ");
            System.out.println(" 하지만 피곤도 70점과 스트레스가 100점이  증가했습니다.  ");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            print(me);

        }


    }







}

