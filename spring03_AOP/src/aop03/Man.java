package aop03;

import org.springframework.stereotype.Component;

@Component
public class Man implements Developer{
	
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("자바로 개발한다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("메이플을 한다.");
	}
	
	

}
