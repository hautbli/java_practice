import java.util.Scanner;

public class Rest extends Banghak {

    public void deliveryfood(Me me) // 배달음식
    {
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(me.name+": 밥하기도 귀찮은데 치킨이나 시켜볼까.. ");
        System.out.println();
        System.out.println();
        System.out.println("[알림문자]  치킨 배달 시간 1시간 30분 입니다");
        System.out.println();
        System.out.println();
        System.out.println("1. 그래도 기다렸다 먹어야지.. ");
        System.out.println("2. 차라리 밥해먹는게 낫겠다!  ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//배달음식 상황
            case "1":
                System.out.println("");
                System.out.println("기다렸다 먹으니까 더 맛있네 !!! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("돈 22,000원이 감소됐지만 피곤도 100점과 스트레스 100이 감소되고");
                System.out.println("행복도가 100점 올라갔습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -= 22000; // 돈 22,000원 감소
                tiredness-= 100; // 피곤도 100감소
                stress-= 100;  //스트레스  100감소
                happiness+=100; //행복감 100증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("아우 쉬는날에 밥하니까 스트레스 받아!!  ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("피곤도 20점과 스트레스 50점이 증가했습니다. ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                tiredness+= 20; // 피곤도 100감소
                stress+= 50;  //스트레스  100감소
                day ++;
                print(me);



        }

    }

    public void stroll(Me me) // 강아지 산책
    {
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 강아지가 산책중에 대변을 한다. ");
        System.out.println();
        System.out.println();
        System.out.println("월월월월월!!!!!!!!");
        System.out.println();
        System.out.println();
        System.out.println("1. 어라 휴지가 모자르네 저기 화장실에서 좀 가져와야겠다.. ");
        System.out.println("2. 에라 모르겠다! 그냥 가야지  ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {//강아지 산책 상황

            case "1":
                System.out.println("");
                System.out.println("우리 강아지 똥도 잘 싸네~ 산책도 하니까 기분이 엄청 맑아지는걸?!");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("피곤도 20점과 스트레스 100이 감소되고 행복도가 100점 올라갔습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");


                tiredness-= 20; // 피곤도 20감소
                stress-= 100;  //스트레스  100감소
                happiness+=100; //행복감 100증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("[주민] 어이!! 이거 안치우고 가면 어떡하나!! 당장 치워!!");
                System.out.println();
                System.out.println();
                System.out.println("저희 강아지 아니거든요??!!");
                System.out.println();
                System.out.println();
                System.out.println("[주민] 아니긴 뭘 아니야 내가 다 봤구만!!");
                System.out.println();
                System.out.println();
                System.out.println("▶이웃주민과 말싸움을 합니다◀ ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("피곤도 50점과 스트레스 100이 증가됐습니다 ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                tiredness+= 50; // 피곤도 100감소
                stress+= 100;  //스트레스  100감소
                day ++;
                print(me);



        }

    }


    public void cook(Me me) // 요리하기
    {
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 오늘 나를 위한 요리를 해볼까??");
        System.out.println();
        System.out.println();
        System.out.println("1. 아보카도 새우 덮밥 만들기");
        System.out.println("2. 나가사끼 라멘 만들기 ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {

            case "1":
                System.out.println("");
                System.out.println("와.. 너무 맛있다 .. 쉬는 날에 이렇게 요리도하고~ 행복하다!!");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("요리를 해서 피곤도 10점이 증가하고 스트레스 50이 감소되고 행복도가 50점 올라갔습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");


                tiredness+= 10; // 피곤도 20감소
                stress-= 50;  //스트레스  100감소
                happiness+=50; //행복감 100증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("와 다만들었다~! ");
                System.out.println();
                System.out.println();
                System.out.println("먹으려고 하는데 그릇이 미끄러져서 노트북 위에 다 엎어버린다. ");
                System.out.println();
                System.out.println();
                System.out.println("내 노트북...!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("요리를 해서 피곤도가 10점 올라가고 노트북이 망가져서 스트레스가 100증가했습니다 ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness+= 10; // 피곤도 100감소
                stress+= 100;  //스트레스  100감소
                day ++;
                print(me);



        }
    }


    public void cleaning(Me me) // 집청소
    {
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 오늘 그동안 바빠서 못했던 집안 청소 좀 해야겠다! ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("1. 화분을 재배치하고 화분에 물을 준다 ");
        System.out.println("2. 옷을 정리한다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {

            case "1":
                System.out.println("");
                System.out.println("화분이 깨지고 흙과 꽃이 바닥에 다 널브러진다 ");
                System.out.println();
                System.out.println();
                System.out.println("아휴!! 이걸 언제 치워!!!! 스트레스 받아!!! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("깨진 화분과 흙을 정리하느라 피곤도 30점이 증가하고 스트레스가 80증가합니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                tiredness+= 30; // 피곤도 20감소
                stress+= 80;  //스트레스  100감소
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("엉?? 옷이 왜 이것밖에 없지.. 겨울 옷 좀 사야겠다!!   ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("청소를 해서 피곤도가 10점 올라갔지만 옷 쇼핑을 하느라 40,000원을 씁니다 ");
                System.out.println("간만에 쇼핑에 행복감이 70점 올라가지만 충동구매로 인한 스트레스가 40점 올라갑니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness+= 10; // 피곤도 100감소
                stress+= 40;  //스트레스  100감소
                happiness+=70; //행복감 100증가
                money-=40000;
                day ++;
                print(me);



        }
    }

    public void movie(Me me) // 혼자서 영화보기
    {

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 음~! 요즘 개봉한 영화가 뭐가 있지??  ");
        System.out.println();
        System.out.println();
        System.out.println(" 최신 개봉작들을 본다");
        System.out.println();
        System.out.println();
        System.out.println("1. 겨울왕국2");
        System.out.println("2. 라스트 크리스마스");
        System.out.println("3. 블랙머니");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {

            case "1":
                System.out.println("");
                System.out.println("와 너무 재밌었다~~시즌 1보다 더 감동적인걸??!! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("관람비 9,000원을 사용하고 외출해서 피곤도 10점이 올라가지만 스트레스가 80점 감소하고 ");
                System.out.println("행복감이 150점 증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                money -= 9000; // 돈 9000원 감소
                tiredness+= 10; // 피곤도 20증가
                stress-= 80;  //스트레스  80감소
                happiness+=150; //행복감 150증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("와 너무 로맨틱하고 재밌는 영화였어..!!! 애인과 함께 보면 더 좋았을 텐데..  ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("관람비 9,000원을 사용하고 외출해서 피곤도 20점이 올라가지만 스트레스가 80점 감소하고  ");
                System.out.println(" 로맨틱 코미디 영화를 혼자서 봤기 때문에 행복감이 50점 증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -= 9000; // 돈 9000원 감소
                tiredness+= 20; // 피곤도 20증가
                stress-= 80;
                happiness+=50; //행복감 100증가
                day ++;
                print(me);
                break;

            case "3":
                System.out.println("");
                System.out.println("와 연기랑 연출력이 정말 흥미진진하고 재밌었어!! 아주 만족스럽다 !!   ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("관람비 9,000원을 사용하고 외출해서 피곤도 10점이 올라가지만 스트레스가 80점 감소하고  ");
                System.out.println(" 재밌는 영화를 본 만족감에 행복감이 150점 증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -= 9000; // 돈 9000원 감소
                tiredness+= 10; // 피곤도 20증가
                stress-= 80;  //스트레스  80감소
                happiness+=150; //행복감 150증가
                day ++;
                print(me);

        }
    }

    public void gastroventure(Me me) // 친구만나서 맛집 탐방
    {

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 친구랑 인스타에서 유명한 맛집이나 가볼까? ");
        System.out.println();
        System.out.println();
        System.out.println(" 인스타 유명 맛집 도착!! 사진도 찍으며 친구와 맛있게 먹는다");
        System.out.println();
        System.out.println();
        System.out.println("[친구] 미안.. 사실 나 돈이 없어..! 이번달 용돈을 다 써서..내줄 수 있어..? 꼭 갚을게!");
        System.out.println();
        System.out.println();
        System.out.println("1. 뭐라고 장난해?? 나도 돈 없거든!! 너건 알아서 계산해!  ");
        System.out.println("2. 어머..! 정말 큰일이다! 이번엔 내가 내면 되지 .. 다음에 꼭 갚아..! ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {

            case "1":
                System.out.println("");
                System.out.println("[친구] 그럴 수도 있지.. 너 정말 너무하다..!!!! 나 상처 받았어!!! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("돈은 1인분인 30,000원만 냈지만 친구와 트러블이 생겨서 피곤도 30이 증가하고 ");
                System.out.println("스트레스 70이 증가했습니다.  ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                money -= 30000; // 돈 30,000원 감소
                tiredness+= 30; // 피곤도 20감소
                stress+= 70;  //스트레스  100감소
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("친구: 미안..! 다음엔 내가 살게 고마워 !! 너같은 친구를 둬서 정말 행운이야!!   ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("돈을 2인분 60,000원 내고 친구와의 만남으로 인해 피곤도가 10증가했지만 친구와의 뜨거운 ");
                System.out.println("우정다짐을 통하여 스트레스 100점이 감소하고 행복감이 100점 증가했습니다   ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                money -= 60000; // 돈 30,000원 감소
                tiredness+= 10; // 피곤도 30증가
                stress-= 100;  //스트레스  100감소
                happiness+=100; //행복감 100증가
                day ++;
                print(me);



        }
    }

    public void cartoon(Me me) // 만화방 가기
    {


        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 아~ 만화방에서 종일권 끊어서 하루종일 만화책이나 봐야겠다 요즘 신간도 많이 나왔을 텐데!! ");
        System.out.println();
        System.out.println();
        System.out.println("[메뉴판] 떡볶이 6,000원  까르보라면 5,000원  소떡소떡 3,000원  ");
        System.out.println();
        System.out.println();
        System.out.println("1. 만화방에선 3끼 먹어줘야지 다 시켜야겠다!!!  ");
        System.out.println("2. 뭐 저렇게 비싸담.. 종일권도 무리한건데.. 물만 마시고 집가서 저녁 먹어야지!! ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {

            case "1":
                System.out.println("");
                System.out.println(" 배부르다... 많이 먹었네... 내일 알바하면 되지 뭐! 지금 행복하면 된거야!   ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("종일권 15,000원과 간식비에 14,000원을 쓰고  하루종일 만화만 봐서 피곤도가 70이 감소하고 만화보는 재미에 ");
                System.out.println("스트레스 100점이 감소했습니다 또한 행복감이 100점 증가했습니다 ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                money -= 29000; // 돈 15,000원 감소
                tiredness-= 70; // 피곤도 20증가
                stress-= 100;  //스트레스  100감소
                happiness+=100; //행복감 100증가
                day ++;
                print(me);
                break;


            case "2":
                System.out.println("");
                System.out.println("오예~~! 며칠전에 나온 최신권도 다 있고 그 전 내용 생각안나니까 이어서 봐야겠다~!  ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("종일권 15,000원을 쓰고  하루종일 만화만 봐서 피곤도가 70이 감소하고 만화보는 재미에 ");
                System.out.println(" 스트레스 100점이 감소했습니다  그리고 신간을 다 볼 수 있어서 행복감 150점이 증가했습니다 ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                money -= 15000; // 돈 15,000원 감소
                tiredness-= 70; // 피곤도 20증가
                stress-= 100;  //스트레스  100감소
                happiness+=700; //행복감 100증가
                day ++;
                print(me);



        }
    }

    public void book(Me me) // 카페가서 책읽기
    {

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 며칠전에 서점에서 산 책을 카페에서 여유롭게 봐야겠다~! ");
        System.out.println();
        System.out.println();
        System.out.println(" 아메리카노를 마시면서 여유롭게 책을 본다 ");
        System.out.println();
        System.out.println();
        System.out.println("1. 어머 케이크 왜이렇게 맛있어? 하나 더 먹어야겠다!  ");
        System.out.println("2. 케이크가 좀 비싸네.. 이걸로 만족해야지..!  ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {

            case "1":
                System.out.println("");
                System.out.println(" 오늘 힐링 제대로 했다~ 매일 오늘만 같이 여유로웠으면...  ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("아메리카노와 케이크에 25,000원을 썼습니다. 피곤도 50점이 감소하고  ");
                System.out.println("스트레스 100점이 감소했습니다 또한 행복감이 100점이 증가했습니다 ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                money -= 25000; // 돈 10,000원 감소
                tiredness-= 50; // 피곤도 10증가
                stress-= 100;  //스트레스  100감소
                happiness+=100; //행복감 100증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("나중에~ 돈벌면 케이크 원없이 시켜먹고 싶다~~");
                System.out.println();
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("아메리카노 5,000원을 쓰고 피곤도가 10점 증가하고 스트레스 80점이 감소하고 행복감이 70점 증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -= 5000; // 돈 10,000원 감소
                tiredness+= 10; // 피곤도 10증가
                stress-= 80;  //스트레스  100감소
                happiness += 70;
                day ++;
                print(me);



        }
    }








}
