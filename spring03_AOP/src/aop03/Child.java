package aop03;

import org.springframework.stereotype.Component;

@Component
public class Child implements Developer{

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("스크래치로 개발한다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
