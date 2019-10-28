import java.io. * ;
import java.util. * ;
import java.lang.Math. * ;
class subnet 
{
	public static void main(String args[])
 {
		Scanner sc = new Scanner(System. in );
		System.out.println("Enter IP address");
		String ip1 = sc.next();
		String[] ipparts = ip1.split("\\.");
		String i1 = ipparts[0];
		System.out.println("The first part of IP is " + i1);
		String d = "";
		int i = Integer.parseInt(i1);
		String df = "";
		String t = "";
		if (i<= 127 &&i> 0)
 {
			d = "Class A";
			df = "255.0.0.0";
			t = "11111111";
		}
		if (i>= 128 &&i< 191)
 {
			d = "Class B";
			df = "255.255.0.0";
			t = "1111111111111111";
		}
		if (i<= 223 &&i>= 192)
 {
			d = "Class C";
			df = "255.255.255.0";
			t = "111111111111111111111111";
		}
		if (i<= 239 &&i>= 224)
 {
			d = "Class D";
		}
		if (i<= 255 &&i> 240)
 {
			d = "Class E";
		}
		System.out.println("The IP entered is in " + d);
		System.out.println("The default mask is " + df);
		System.out.println("Enter number of subnets required");
		int subs = sc.nextInt();
		int loop;
		for (loop = 0; loop < 2000; loop++) 
{
			if (subs <= Math.pow(2, loop)) 
{
				break;
			}
		}
		System.out.println("req mask " + loop);
		if (d.equals("Class A") || d.equals("Class B") || d.equals("Class C")) 
{
			for (int j = 0; j < loop; j++) 
{
				t = t + "1";
			}
			for (int k = t.length(); k < 32; k++)
 {
				t = t + "0";
			}
		t = t.substring(0, 8) + "." + t.substring(8, 16) + "." + t.substring(16, 24) + "." + t.substring(24, 32);
			System.out.println("The required subnet mask is " + t);
		} 
else 
			System.out.println("Subnet mask not found");
		
	}
}
