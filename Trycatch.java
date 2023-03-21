class Trycatch
{
public static void main(String[] args)
{
try
{
System.out.println("one");
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(10/5);
}
finally
{
System.out.println("two");
}
}
}