package kr.hs.study.beans;

public class BaseBall implements Sports{
    @Override
    public void getPlayer(int num) {
        System.out.println("번호: "+num);
    }

    @Override
    public void getName(String name) {
        System.out.println("선수 이름: "+name);
    }

    @Override
    public void rule() {
        System.out.println("경기 규칙입니다.");
    }
}
