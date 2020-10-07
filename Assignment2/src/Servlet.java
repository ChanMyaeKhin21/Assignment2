import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int binary =Integer.parseInt(request.getParameter("server_variable_binary")) ;

		boolean check=isBinary(binary);
		
		int octal = 0,result;
		String decimal;
		if(check==true)
		{
			octal = convertBinarytoOctal(binary);
	        
	        
	        result=retrieveDecimal(binary);
			decimal=Integer.toString(result);
			
			
			response.getWriter().append(decimal + "/" + octal);
		}
		else
		{
			//decimal="Please type binary number";
			response.getWriter().append("Please type binary number" +"/"+ "Please type binary number");
		}
        
	}
	public static boolean isBinary(int number) { 
		int copyOfInput = number; 
		while (copyOfInput != 0) 
		{ 
			if (copyOfInput % 10 > 1) 
			{ 
				return false; 
			} 
			copyOfInput = copyOfInput / 10; 
		} 
		return true; 
	}
	
	public static int retrieveDecimal(int binarynumber){
		int decimalnumber = 0;
		int power = 0;
		while(true)
		{
			if (binarynumber == 0)
			{
				break;
			}
			else
			{
				int temp = binarynumber%10;
				decimalnumber += temp*Math.pow(2, power);
				binarynumber = binarynumber/10;
				power++;
			}
		}
			return decimalnumber;
	}
	public static int convertBinarytoOctal(long binaryNumber)
    {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while(binaryNumber != 0)
        {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }

        return octalNumber;
    }
		
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
