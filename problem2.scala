object problem {
  /** Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
   *
   *  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   *
   * Find the sum of all the even-valued terms in the sequence which do not exceed four million.
   */
 
   def sum(limit:Int):Int = {
    
	var result = 0
	var a = 1
	var b = 1
	var c = 0
	do {
	  c = a+b
	  if(c%2 == 0)
	  {
	     result += c
	  }
	  a = b
	  b = c
	} while( c < limit)
	result
   } 
}
