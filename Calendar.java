package mc.ys.lession1;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//원하는 달력 설정
		////////////////////////////////////////////////////////////////		
		int[] Month = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,31};//작년 12월부터 내년 1월까지
		int thisMonth =1;//출력 시작 범위
		int MonthRange=12;//출력할 월 범위
		
		
	        int fromYear=2021;//시작 년도
	    	int fromMonth = 1;
	    	int toYear=2021;//끝 년도
	    	int toMonth = 12;
	 	////////////////////////////////////////////////////////////////
		

		
	    
	    //달력 출력
		for(;fromYear<=toYear;fromYear++)//년도
		{
			int day =1;
			day += (fromYear-1)*365;
			
			//윤년
			if(fromYear%400==0 || (fromYear%4==0 && fromYear%100!=0))//올해 윤년 확인
			{
				Month[2]=29;
			}
		        for(int i=4;i<fromYear;i+=4)//~이전년 합산
			{
			    if(i%400==0 || (i%4==0 && i%100!=0)) 
			    {	    	
			    	day++;//윤년확인 후 날짜 추가
			    }
			}
			for(int i =1; i<fromMonth;i++)//올해 합산
			{
				//System.out.println(i);
				day += Month[i];//월 추가
			}
			
			
			day %= 7;	
			
			if(fromYear<toYear)
			{
				thisMonth = 1;
				MonthRange =12;
			}
			else if(fromYear==toYear)
			{
				thisMonth = fromMonth;
				MonthRange = toMonth;
			}
			else
			{
				System.out.println("오류입니다");				
				break;
			}
			
			for(;thisMonth<=MonthRange;thisMonth++)//월
			{
				System.out.printf("\n%d년 %d월 달력입니다.\n",fromYear, thisMonth);
				System.out.println("월\t화\t수\t목\t금\t토\t일");
				
				
				//지난달 출력
				if(day==0)
				{
					day =7;
				}
				for(int i=1;i<day;i++)//일요일 7일때 day가 0
				{
					System.out.printf("%d\t",Month[thisMonth-1]-day+i+1);
					//System.out.print(i);
					if(i%7==0)
					{
						System.out.println();
					}
					
				}
	
			
				//이번달 출력
				for(int i=1;i<=Month[thisMonth];i++)
				{					
					System.out.printf("%d\t",i);
					if(day%7==0)
					{
						System.out.println();
					}
					day++;
				}
	
				//다음달 출력
				for(int i =1;day<=43;i++)//day<=43은 혹시 탈출못할까봐
				{
					if(day%7==1)//1은 월요일을 의미 월요일이면 진입해라
					{
						day=9-i;//
						break;
					}	
					System.out.printf("%d\t",i);
					day++;	//계속 날짜를 찍고 if문에서 탈출		
				}
				day=day%7;
			}
			day++;
		}	
		
		
	}

}
