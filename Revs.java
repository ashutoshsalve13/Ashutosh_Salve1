class Revs
{
public static void main(String[] args)
{
String A = "AshUtosH";
String rev = "";
int a;
for(a = A.length() - 1; a >= 0; a--)
{
rev = rev + A.charAt(a);
}
System.out.println(rev);
}
}
