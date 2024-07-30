class InfoProviderRunner
{
public static void main(String[] code)
{
String name=InfoProvider.SearchCountrycode(1);
System.out.println("Country Name = "+name);

String name1=InfoProvider.SearchCountrycode(91);
System.out.println("Country Name = "+name1);

String name2=InfoProvider.SearchCountrycode(81);
System.out.println("Country Name = "+name2);

String name3=InfoProvider.SearchCountrycode(49);
System.out.println("Country Name = "+name3);

String name4=InfoProvider.SearchCountrycode(55);
System.out.println("Country Name = "+name4);

String name5=InfoProvider.SearchCountrycode(2);
System.out.println("Country Name = "+name5);

String item=InfoProvider.item(5);
System.out.println("Item Name = "+item);

String item1=InfoProvider.item(40);
System.out.println("Item Name = "+item1);

String item2=InfoProvider.item(10);
System.out.println("Item Name = "+item2);

String item3=InfoProvider.item(5);
System.out.println("Item Name = "+item3);

String item4=InfoProvider.item(15);
System.out.println("Item Name = "+item4);

String item5=InfoProvider.item(80);
System.out.println("Item Name = "+item5);

String producer = InfoProvider.SearchProducerName("Inception");
System.out.println("Producer Name = " + producer);

String producer1= InfoProvider.SearchProducerName("The Dark Knight");
System.out.println("Producer Name = " + producer1);

String producer2= InfoProvider.SearchProducerName("Pulp Fiction");
System.out.println("Producer Name = " + producer2);

String producer3 = InfoProvider.SearchProducerName("Titanic");
System.out.println("Producer Name = " + producer3);

String producer4 = InfoProvider.SearchProducerName("The Godfather");
System.out.println("Producer Name = " + producer4);

String producer5 = InfoProvider.SearchProducerName("Shamanth H R");
System.out.println("Producer Name = " + producer5);
}
}