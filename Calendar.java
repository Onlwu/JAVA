package mc.ys.lession1;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//원하는 달력 설정
		////////////////////////////////////////////////////////////////
		//20.1.1 수요일 / 21.1.1 금 /22.1.1 토 /23.1.1 일 /24년 1.1 월
		//int year = 2024;// 출력하고 싶은 년(욕아님ㅋ)
		//int day= 1;//출력할 시작 월의 시작요일, 1. 월 2.화....7.일 1.1.1 은 월요일
		int thisMonth =1;//출력 시작 범위
		int MonthRange=12;//출력할 월 범위
		////////////////////////////////////////////////////////////////
		//int scanMonth=1;//나중에 출력
		
		int[] Month = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,31};//작년 12월부터 내년 1월까지
		//시작 day 알리기
		//System.out.println((year*365)%7);
		//System.out.println(((year-2020)*365)%7);
		/*
		//윤년확인		
		for(int i=4;i<=year;i+=4)
		{
		    if(i%400==0 || (i%4==0 && i%100!=0)) 
		    {	    	
		    	//System.out.println(i+"년은 윤년입니다!");
		    	day++;//윤년확인 후 날짜 추가
		    }
		}
		if(year%400==0 || (year%4==0 && year%100!=0)) 
		{
			Month[2]=29;
		}
		for(int i =1; i<scanMonth;i++)
		{
			day += Month[i];
		}
		//day+= year*365;
		day = year *365;
		day %= 7;
		*/
		


	    int fromYear=2021;//시작 년도
	    int fromMonth = 1;
	    int toYear=2021;//끝 년도
	    int toMonth = 12;
	    
		//int day =1;
	    //달력 출력
		//int day =1;
		for(;fromYear<=toYear;fromYear++)//년도
		{
			int day =1;
			day += (fromYear-1)*365;
			for(int i=4;i<=fromYear;i+=4)
			{
			    if(i%400==0 || (i%4==0 && i%100!=0)) 
			    {	    	
			    	day++;//윤년확인 후 날짜 추가
			    }
			}
			if(fromYear%400==0 || (fromYear%4==0 && fromYear%100!=0)) 
			{
				Month[2]=29;
			}
			for(int i =1; i<fromMonth;i++)
			{
				//System.out.println(i);
				day += Month[i];//월 추가
			}
			//System.out.println("day = "+day);
			day %= 7;
			//System.out.println("day = "+day);
			//day+= year*365;
			
			
			
			
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
			//System.out.println(fromMonth);

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
				for(int i =1;day<=43;i++)//day<=36은 혹시 탈출못할까봐
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
			//System.out.println(fromYear);
		}	
		
		
	}

}