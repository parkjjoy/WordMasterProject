package org.example;
import java.util.Scanner;
public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }

    public int selectMenu() {
        System.out.print("*** 영단어 마스터 ***\n"
                + "********************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "********************\n"
                + "=> 원하는 메뉴는? ");
        return s.nextInt(); //여기서 바로 사용자에게 메뉴 번호를 입력받음
    }

    public void start() {
        while(true) {
            int menu = selectMenu();
            if (menu == 0) break;
            if (menu == 4) {
                wordCRUD.addWord();
            }
            else if (menu == 1) {
                wordCRUD.listAll();
            }
            else if (menu == 5){ //update
                wordCRUD.updateItem();
            }
            else if (menu == 6){ //delete

            }
        }
    }
}
