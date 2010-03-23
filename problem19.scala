/**
  * @author ananthakumaran
  *
  */

import java.util._

object Problem  {
	/**  
	  *	You are given the following information, but you may prefer to do some research for yourself.  
	  * 1 Jan 1900 was a Monday.
	  * Thirty days has September,
	  * April, June and November.
	  * All the rest have thirty-one,
	  * Saving February alone,
	  * Which has twenty-eight, rain or shine.
	  * And on leap years, twenty-nine.
	  * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
	  * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
	  *	
      */

	def sundays() = {
		val cal =  Calendar.getInstance()
		cal.set(1901, Calendar.JANUARY, 1)
		var result = 0
		while(cal.get(Calendar.YEAR) <= 2000)
		{
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				result += 1
			cal.add(Calendar.MONTH,1)	
		}
		result
	} 
}

assert(Problem.sundays() == 171)