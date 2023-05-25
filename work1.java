package org.example.algorithm.day05_16;

import java.util.*;

/**
 * 💁‍♀️ **자료구조 요리 레시피 메모장 만들기**
 *
 * - 입력값
 *     - 저장할 자료구조명을 입력합니다. (List / Set / Map)
 *     - 내가 좋아하는 요리 제목을 먼저 입력합니다.
 *     - 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
 *     - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
 * - 출력값
 *     - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
 *     - 이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.
 *
 **/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String list = sc.nextLine(); // Set
        //set map list
        String title = sc.nextLine(); // 으로 저장된 백종원 돼지고기 김치찌개 만들기

        //list + title = Set 으로 저장된 백종원 돼지고기 김치찌개 만들기

        switch (list) {
            case "List": {
                ArrayList<String> strList = new ArrayList<>();
                strList.add("[" + list + "으로 저장된 " + title + "]");
                System.out.println(strList.get(0));
                break;
            }
            case "Set": {
                Set<String> strSet = new HashSet<>();
                strSet.add("[" + list + "으로 저장된 " + title + "]");
                break;
            }
            case "Map": {
                Map<String, Integer> intMap = new HashMap<>();

                break;
            }
        }
    }
}
