import java.util.Scanner;

public class Study extends Banghak {



    public void toeic(Me me) // 토익 공부
    {   System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 토익 단어 공부 해야겠다!  ");
        System.out.println();
        System.out.println();
        System.out.println("아 오늘따라 왜 이렇게 집중이 안되지?? ");
        System.out.println();
        System.out.println();
        System.out.println("1. 좀만 더 노력해보자! 오늘 빡공하는거야! ");
        System.out.println("2. 근데 책상이 왜이렇게 더럽지..? 청소나 해볼까..");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println("");
                System.out.println("오늘 단어 50개나 외웠다 곧 토익시험 문제 없겠는걸?! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("공부하느라 피곤도 20점이 증가했지만 스트레스 50점이 감소되고");
                System.out.println("피곤하지만 열심히 공부한 성취감을 얻어 자존감 80점 올라갔습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness+= 20; // 피곤도 20증가
                stress-= 50;  //스트레스  20중가
                selfexteem+=80;//자존감 80증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("책상 서랍은 또 왜이렇게 지저분한거야 청소 먼저 하고 공부해야겠다 ");
                System.out.println();
                System.out.println();
                System.out.println("아니 벌써 밤이잖아? 단어 하나도 못 외웠네.. 왜 이렇게 집중을 못하는거야! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("청소하느라 몸이 개운해져서 피곤도 40점이 감소했고 공부를 하려했지만 못해서 스트레스 50점이 증가했습니다. ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness -= 40; // 피곤도 20증가
                stress+= 50;  //스트레스  20중가
                day ++;
                print(me);



        }

    }

    public void major(Me me) // 전공공부
    {

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 다음학기 전공공부를 미리 좀 해볼까.. ");
        System.out.println();
        System.out.println();
        System.out.println(" 전공공부가 너무 어렵다..  ");
        System.out.println();
        System.out.println();
        System.out.println("1. 와 이거 정말 어려운데? 더더욱 예습을 철저하게 해야겠다!  ");
        System.out.println("2. 와 이거 정말 어려운데? 나 왤케 이해를 못하지 안 맞는거 같다..");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println("");
                System.out.println("음~ 저번 학기에 배운거를 좀 응용하면 되는구나~ 재밌는걸? ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("공부하느라 피곤도 20점이 증가했지만 스트레스 50점이 감소되고");
                System.out.println("예습하느라 어려웠지만 열심히 공부한 성취감을 얻어 자존감 100점 올라갔습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness+= 20; // 피곤도 30증가
                stress-= 50;  //스트레스  30중가
                selfexteem+=100;//자존감 100증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("아.. 전과해야하나.. 벌써부터 이렇게 이해를 못하면 앞으로는 더더욱 못할거 아니야..  ");
                System.out.println();
                System.out.println();
                System.out.println("예습하려고 했지만 막힌부분에서 전과와 앞으로의 진로를 고민만 했다 ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println(" 예습을 하기는 커녕 하루종일 진로에대한 고민만 하다 스트레스 30이 증가했다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                stress+= 30;  //스트레스  30중가
                day ++;
                print(me);

        }

    }


    public void speaking(Me me) // 영어회화공부
    {

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 영어회화 선생님과 통화 연결중. . . . .  ");
        System.out.println();
        System.out.println();
        System.out.println(" 선생님: hello~  "+me.name+ "!  How are you~ 쌸라쌸라 쌸라쌸라~ ");
        System.out.println();
        System.out.println();
        System.out.println("1. 이해가 잘안가긴 하는데 그래도 하나하나 질문하면서 대화해야겠다!  ");
        System.out.println("2. 왜 난 이것도 못알아 듣는거지? 너무 부끄럽다.. 대충 대답하고 얼른 끝내야지!");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println("");
                System.out.println("질문하기 부끄러웠지만 선생님도 친절히 답변해주시고 나도 모르는 걸 알게돼서 좋은 시간이었어! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("전화비 50,000원을 지출하고 회화에 어려움이 있어 피곤도가 20증가했지만 대화 종료후에 뿌듯함을 느껴");
                System.out.println("스트레스가 50점 감소하고 자존감이 80점 증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -=50000; // 돈 50,000원 감소
                tiredness+= 20; // 피곤도 30증가
                stress-= 50;  //스트레스  40중가
                selfexteem+=80;//자존감 80증가
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("휴..! 겨우 끝났다.. 근데 별로 새로 알게 된 건 없네.. 에이 돈 아깝다.. 괜히 했나..  ");
                System.out.println("");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("전화비 50,000원을 지출하고 회화는 무사히 끝냈지만 모르는걸 질문하지 않고 넘겨 피곤도는 10점 증가했다. 하지만 자책감에  ");
                System.out.println("스트레스 30이 증가했습니다.  ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -=50000; // 돈 50,000원 감소
                tiredness+= 10; // 피곤도 30증가
                stress+= 30;  //스트레스  40중가
                day ++;
                print(me);

        }
    }

    public void bookstudy(Me me) // 독서 스터디 모임
    {
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 오랜만에 독서 스터디 모임 가야겠네 서로 생각을 나누는게 의미 있겠는걸? ");
        System.out.println("");
        System.out.println("1. 호감가는 이성이 있다 ");
        System.out.println("2. 동성으로 99퍼센트가 이루어져 있다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println("");
                System.out.println("[호감가는 이성] 저는 이 책에 대해서 ~~게 생각하고 ~~게 생각하는데"+ me.name+"님은");
                System.out.println("       어떻게 생각하세요?? ");
                System.out.println();
                System.out.println("네???.. 저는 ..아....네 뭐라구요?..");
                System.out.println();
                System.out.println("[호감가는 이성] 아.. 그럼 다른 분 생각 들어볼게요.. ");
                System.out.println();
                System.out.println("집중도 못하고!! 아 부끄러워 날 바보로 봤을 거야!  ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("참가비 10,000원을 쓰고 피곤도 20점 스트레스 50점이 증가했습니다. ");
                System.out.println("호감가는 이성 때문에 집중하지 못한 자책감에 자존감이 40점 감소했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -=10000; // 돈 50,000원 감소
                tiredness+= 20; // 피곤도 20증가
                stress+= 50;  //스트레스  20중가
                selfexteem -=40;
                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("[a회원] 저는 이 책에 대해서 ~~게 생각하고 ~~게 생각하는데"+ me.name+"님은");
                System.out.println("       어떻게 생각하세요?? ");
                System.out.println();
                System.out.println("저는 책을보면서 ~~~걸 느꼇고 ~~~게 생각해서 ~~~결론이 정말 말도 안된다고 생각합니다....");
                System.out.println();
                System.out.println("[a회원] 아 저도 비슷한 생각을 하고 있었어요!! .. ");
                System.out.println();
                System.out.println("오늘 독서스터디 모임에서 여러 생각도 공유하고 아주 뜻깊은 시간이었어!  ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("참가비 10,000원을 지출하고 피곤도 20이 증가했지만 뜻깊은 시간을 가졌다는 만족감에");
                System.out.println("스트레스가 50 감소하고 자존감이 80증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                money -=10000; // 돈 50,000원 감소
                tiredness+= 20; // 피곤도 20증가
                stress-= 50;  //스트레스  20중가
                selfexteem +=80;//자존감 80증가
                day ++;
                print(me);

        }

    }

    public void design(Me me) // 디자인 취미 공부

    {
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println(" 책보면서 에코백 디자인 여러개 만들어 봐야겠다~! ");
        System.out.println();
        System.out.println();
        System.out.println("1. 디자인 툴 업데이트 컴퓨터 성능이 안좋아서 대기 시간 10시간 걸린다");
        System.out.println("2. 에코백 디자인 3개를 만든다");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶알맞는 번호를 선택하시오◀◀");
        scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println("");
                System.out.println("컴퓨터가 너무 느려서 잘안되네! 그럼 스케치북에라도 그려볼까?? 오랜만이네 ㅎㅎ ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("오랜 업데이트에 신경쓰지 않고 그림을 그리면서 기다려 스트레스와 피곤도 50점씩 감소하고");
                System.out.println("자존감은 50점 올라갑니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness-= 50; // 피곤도 20증가
                stress-=50;
                selfexteem += 50;

                day ++;
                print(me);
                break;



            case "2":
                System.out.println("");
                System.out.println("이 디자인은 내가 봐도 정말 잘했다! 이런 취미가 있으니까 정말 좋은걸?!");
                System.out.println();
                System.out.println();
                System.out.println("친구들한테도 자랑해야겠다 ㅎㅎ 오늘 정말 알찬 하루였어! ");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("디자인 만드느라 피곤도 20이 증가했지만 디자인 결과에 만족감에 스트레스 70점이 감소되고");
                System.out.println("자존감이 100증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                tiredness+= 20; // 피곤도 20증가
                stress-=70;
                selfexteem+=100;//자존감 80증가
                day ++;
                print(me);

        }

    }







}

