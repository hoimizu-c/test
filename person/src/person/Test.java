package person;

public class Test {
	
	public static void main(String[] args){

  Person taro=new Person();
  taro.name="山田太郎";
  taro.age=20;
  taro.phoneNumber="090-1234-5678";
  taro.address="12345@yahoo.co.jp";
  
  
  System.out.println(taro.name);
  System.out.println(taro.age);
  System.out.println(taro.phoneNumber);
  System.out.println(taro.address);
  taro.talk();
  taro.walk();
  taro.run();
  
  
  Person jiro=new Person();
  jiro.name="木村次郎";
  jiro.age=18;
  jiro.phoneNumber="080-1234-5678";
  jiro.address="5678@yhoo.co.jp";
  
  
  System.out.println(jiro.name);
  System.out.println(jiro.age);
  System.out.println(jiro.phoneNumber);
  System.out.println(jiro.address);
  jiro.talk();
  jiro.walk();
  jiro.run();
  
  
  Person hanako=new Person();
  hanako.name="鈴木花子";
  hanako.age=16;
  hanako.phoneNumber="080-7899-4563";
  hanako.address="hundred@yahoo.co.jp";
  
  System.out.println(hanako.name);
  System.out.println(hanako.age);
  System.out.println(hanako.phoneNumber);
  System.out.println(hanako.address);
  hanako.talk();
  hanako.walk();
  hanako.run();
  
  
  Person chisato=new Person();
  chisato.name="堀水千聖";
  chisato.age=27;
  chisato.phoneNumber="080-1234-5678";
  chisato.address="2589@yahoo.co.jp";
  
  
  System.out.println(chisato.name);
  System.out.println(chisato.age);
  System.out.println(chisato.phoneNumber);
  System.out.println(chisato.address);
  chisato.talk();
  chisato.walk();
  chisato.run();
  
  
  Robot aibo=new Robot();
  aibo.name="aibo";
  
  System.out.println(aibo.name);
  aibo.talk();
  aibo.walk();
  aibo.run();
  
  Robot asimo=new Robot();
  asimo.name="asimo";
  
  System.out.println(asimo.name);
  asimo.talk();
  asimo.walk();
  asimo.run();
  
 
  Robot pepper=new Robot();
  pepper.name="pepper";
  
  System.out.println(pepper.name);
  pepper.talk();
  pepper.walk();
  pepper.run();
	}

}
