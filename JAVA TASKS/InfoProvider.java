class InfoProvider
{
public static String SearchCountrycode(int code)
{
System.out.println("Country code = "+code);
if (code==1)
{
	return "United States";

}
 else if (code == 91)
{
	return "India";
}
 else if (code == 81)
{
	return "Japan";	
}
  else if (code == 49) 
 {
    return "Germany";
} 
 else if (code == 55)
{
    return "Brazil";
} else 
{
return "Country Not Found";

}
}
public static String item(int price)
{
System.out.println("Product Price = "+price);
if (price==50)
{
	return "Pen";

}
 else if (price == 40)
{
	return "Book";
}
 else if (price == 10)
{
	return "Sharpner";
}
  else if (price  == 5) 
 {
    return "Eraser";
} 
 else if (price  == 15) {
    return "Pencil";
} else 
{
return "Item not Found";

}
}
 public static String SearchProducerName(String movieName) 
 {
 System.out.println("Movie Name = " + movieName);
if (movieName =="Inception")
{
return "Emma Thomas";
 } 
else if (movieName == "The Dark Knight")
{
return "Christopher Nolan";
 }
else if (movieName == "Pulp Fiction")
{
return "Lawrence Bender";
} 
else if (movieName == "Titanic")
{
return "James Cameron";
}
else if (movieName == "The Godfather")
{
return "Albert S. Ruddy";
} 
else
{
return "Producer Not Found";
}
}
}