import java.util.*;
class chocolates{
	public int count=0;
	public int weighttotal1=7;
}
class milkchoco extends chocolates{
	public int weight=2;
	int count=1;
}
class  darkchoco extends chocolates{
	public int weight=5;
	int count=2;
}
class sweets{
	public int count=0;
	public int weighttotal2=25;
}
class sondesh extends sweets{
	public int weight=10;
	int count=1;
}
class  malai extends sweets{
	public int weight=15;
	int count=2;
}
class New_Gift{
	public static void main(String args[]){
		int total_count;
		int max_weight;
		int total_weight;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the weight of the giftbox");
		max_weight=obj.nextInt();
		darkchoco ob=new darkchoco();
		malai ob1=new malai();
		total_count=ob.count+ob1.count;
		total_weight=ob.weighttotal1+ob1.weighttotal2;
		if(max_weight>=total_weight){
			System.out.println("Total weight="+total_weight);
		}
		else{
			System.out.println("Maximum Weight exceeded");
		}
		System.out.println(total_count);
	}
}