package mc.ys.lession1;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2021년 달력 출력 코드
	//	System.out.println("2021년 12월 달력\n월\t화\t수\t목\t금\t토\t일");
		int day=5;//달력에서 몇번재인지 5는 2021.1월 1일이 금요일이라서
		int[] Month = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//작년 12월부터 올해12까지
		int thisMonth =1;//출력 시작 범위
		int MonthRange=12;//출력할 월 범위
		for(;thisMonth<=MonthRange;thisMonth++)
		{
			System.out.printf("\n2021년 %d월 달력입니다.\n",thisMonth);
			System.out.println("월\t화\t수\t목\t금\t토\t일");
			//지난달 출력
			for(int i=1;i<day;i++)
			{
				System.out.printf("%d\t",Month[thisMonth-1]-day+i+1);
				
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
			for(int i =1;day<=36;i++)//i<8은 혹시 탈출못할까봐
			{
				if(day%7==1)//1은 월요일을 의미 월요일이면 진입해라
				{
					day=9-i;//day는 무조건 36 찍힘 몇번추가됬는지 알려고 day i 한번씩 더 돌아서 총 2빼야함
					break;
				}	
				System.out.printf("%d\t",i);
				day++;	//계속 날짜를 찍고 if문에서 탈출		
			}
			day=day%7;
		}
		
		
	}

}