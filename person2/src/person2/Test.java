package person2;

public class Test {
	
	public static void main(String[] args){
		
		//コンストラクタ1
		Person taro=new Person();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//コンストラクタ2
		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		
		//コンストラクタ3
		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		
		//コンストラクタ4
		Person namaenashi=new Person(25);
		System.out.println(namaenashi.name);
		System.out.println(namaenashi.age);
		
		
		//コンストラクタ5
		Person hanako=new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		
		//コンストラクタ5
		Person hanako1=new Person(17,"hanako");
		System.out.println(hanako1.name);
		System.out.println(hanako1.age);
	}

}
