 Twilio
 ============================================================
 - Design Pizza Shop database Schema
 Customer {
 	id;
 	name;
 	address;
 }

 Order {
 	List<OrderItem> orderItems;
 	double tip;
 	double taxes;
 	double finalPrice;
 	Customer customer;
 }

 OrderItem {
 	Pizza pizza;
 	Ingrediend[] toppings;
 }

 Pizza {
 	name,
 	Ingredient[] ingredients;
 }

 Ingredient {
 	String name;
 	Stirng description;
 	Image image;
 	String provider;
 }

 InventoryItem {
 	Ingredient ingredient:
 	double amount;
 	Unit unit;
 	double costPerUnit;
 	double pricePerUnit;
 }

 Inventory {
 	Map<String, InventoryItem> items;
 }



============================================================
 - Design Photo Printing Shop architecture
 - Coding question: write a class in a language of your choice that prints a message. Write another class that is a subclass. Instantiate it.  
 - Implement an LRU cache
 - String compression  
 - String parsing question through a collaborative coding tool.  
 - Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.  
 - Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.  
 - Implement Queue using Stack.  
 - On a whiteboard, implement a function called tripleRotate, which "rotates" all subsequent sets of 3 elements in an array, when the algorithm for one rotation is as follows:
	Given the triplet ['a', 'b', 'c'], the 1st element ('a') is moved to index 1, the 2nd element ('b') is moved to index 2 and the 3rd element ('c') is moved to index 0. Thus, one rotation of the given triplet results in the new array ['c', 'a', 'b'].

	Any programming language and data types could be used, although they did expect actual code, not pseudocode. No additional information was given so lots of additional questions about corner cases and requirements were expected to be asked by the applicant. Prepare to explain your chosen approach and used data types.  

- What are the runtime complexities for reads and inserts on arrays, hash maps and linked lists? What are the best and worst case scenarios for each? When would you use one over the others?  
- Explain how running multiple tasks on a single processor core works.





FROM GitHub

URL: https://github.com/jayshah19949596/CodingInterviews/tree/master/Twilio%20Software%20Engineer%20-%20New%20Grad-Part-1
1. Reformatting Dates
		Given a date string in the format Day Month Year where:

		Day is in set {"1st", "2nd", "3rd", "4th", "5th", "6th", .... , "31st"}.

		Month is in set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep" , "Oct" , "Nov", "Dec"}.

		Year is in the inclusive range [1900, 2100]

		For Example:

		"1st Mar 1984" -> "1984-03-01"
		"2nd Feb 2013" -> "2013-02-02"
		"4th Apr 1990" -> "1990-04-04"
		Function Description: Complete the function reformateDate in the editor below.
		The function must return an array of converted date strings in the order presented.

		reformateDate has the following parameter(s):

		dates[dates[0], ..., dates[n-1]]: an array of date strings in the format Day Month Year
		Constraints:

		The values of Day, Month, Year are restricted to the value ranges specified above.

		The given dates are guaranteed to be valid so no error handling is necessary.

		1 <= n <= 10000

		 Sample Input 0:
		 10
		 20th Oct 2052
		 6th Jun 1933
		 26th May 1960
		 20th Sep 1958
		 16th Mar 2068
		 25th May 1912
		 16th Dec 2018
		 26th Dec 2061
		 4th Nov 2030
		 28th Jul 1963
		 
		 Sample Output 0:
		 2052-10-20
		 1933-06-06
		 1960-05-26
		 1958-09-20
		 2068-03-16
		 1912-05-25
		 2018-12-16
		 2061-12-26
		 2030-11-04
		 1963-07-28

2. Hosts and Total Number of Requests
		In this challenge, write a program to analyze a log file and summarize the results.
		Given a text file of an http requests log, list the number of requests from each host.
		Output should be directed to a file as described in the Program Description below.

		The format of the log file, a text file with a .txt extension, follows.
		Each line contains a single log record with the following columns (in order):

		The hostname of the host making the request.
		This column's value are missing and were replaced by hyphen.
		This column's value are missing and were replaced by hyphen.
		A timestamp enclosed in square brackets following the format [DD/mm/YYY:HH:MM:SS-0400].
		The request, enclosed in quotes(eg, "GET/images/NASA-logosmall.gif HTTP/1.0").
		The HTTP response code.
		The total number of bytes sent in the response.
		Function Description: Your function must create a unique list of hostnames with their number of requests and output to a file names records_filename where filename is names records_filename where filename is replaced with input filename.
		Each hostname should be followed by a space then the number of requests and a newline.
		Order doesn't matter.

		Constraints:

		The log file has a maximum pf 200000 lines of records

		 Sample Input 0:
		 host_access_log_00.txt
		 
		 Sample Output 0:
		 unicomp6.unicompt.net 4
		 burger.letters.com 3
		 d104.aa.net 3
		 
		 Explanation 0:
		 The log file hosts_access_log_00.txt contains the following log records;
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:06 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 3985 
		 burger.letters.com - - [01/JUL/1995:00:00:11 - 0400] "GET /shuttle/countdown/liftoff.html HTTP/1.0" 304 0
		 burger.letters.com - - [01/JUL/1995:00:00:12 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 304 0
		 burger.letters.com - - [01/JUL/1995:00:00:12 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 0
		 d104.aa.net - - [01/JUL/1995:00:00:13 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 3985 
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:14 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 40310 
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:14 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 786 
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:14 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 1204 
		 d104.aa.net - - [01/JUL/1995:00:00:15 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 40310 
		 d104.aa.net - - [01/JUL/1995:00:00:15 - 0400] "GET /images/NASA-logosmall.gif HTTP/1.0" 200 786 


3. Hosts and Total Number of Requests
		In this challenge, write a program to analyze a log file and summarize the results.
		Given a text file of an http requests log, list the number of requests from each host.
		Output should be directed to a file as described in the Program Description below.

		The format of the log file, a text file with a .txt extension, follows.
		Each line contains a single log record with the following columns (in order):

		The hostname of the host making the request.
		This column's value are missing and were replaced by hyphen.
		This column's value are missing and were replaced by hyphen.
		A timestamp enclosed in square brackets following the format [DD/mm/YYY:HH:MM:SS-0400].
		The request, enclosed in quotes(eg, "GET/images/NASA-logosmall.gif HTTP/1.0").
		The HTTP response code.
		The total number of bytes sent in the response.
		Function Description: Your function must create a unique list of hostnames with their number of requests and output to a file names records_filename where filename is names records_filename where filename is replaced with input filename.
		Each hostname should be followed by a space then the number of requests and a newline.
		Order doesn't matter.

		Constraints:

		The log file has a maximum pf 200000 lines of records

		 Sample Input 0:
		 host_access_log_00.txt
		 
		 Sample Output 0:
		 unicomp6.unicompt.net 4
		 burger.letters.com 3
		 d104.aa.net 3
		 
		 Explanation 0:
		 The log file hosts_access_log_00.txt contains the following log records;
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:06 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 3985 
		 burger.letters.com - - [01/JUL/1995:00:00:11 - 0400] "GET /shuttle/countdown/liftoff.html HTTP/1.0" 304 0
		 burger.letters.com - - [01/JUL/1995:00:00:12 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 304 0
		 burger.letters.com - - [01/JUL/1995:00:00:12 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 0
		 d104.aa.net - - [01/JUL/1995:00:00:13 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 3985 
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:14 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 40310 
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:14 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 786 
		 unicomp6.unicompt.net - - [01/JUL/1995:00:00:14 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 1204 
		 d104.aa.net - - [01/JUL/1995:00:00:15 - 0400] "GET /shuttle/countdown/ HTTP/1.0" 200 40310 
		 d104.aa.net - - [01/JUL/1995:00:00:15 - 0400] "GET /images/NASA-logosmall.gif HTTP/1.0" 200 786 


4. Missing Words
		Given two strings, one is a subsequence if all of the elements of the first string occur in the same order within the second string.
		They do not have to be contiguous in the second string, but order must be maintained.
		For example, given the string "I like cheese", the words "I" and "cheese" are one possible subsequence of that string.

		In this challenge, you will be given two strings, s and t, where t is a subsequence of s, report the words of s, missing in t, in order they are missing.
		Revisiting the earlier example, if s = I like cheese and t = like, then like is the longest subsequence, and [I, cheese] is the list of missing words in order.

		Function Description: Complete the function missingWords in the editor below.
		It must return an array of strings containing any words in s that are missing from t in the order they occur within s.

		missingWords has the following parameter(s):
		s: a sentence of space separated words t: a sentence of space separated words

		Constraints:

		Strings s and t consists of English alphabetic letters and spaces only.
		1 <= |t| < |s| 10^6
		1 <= length of any word in s or t <= 15
		It is guaranteed that string t is a subsequence of string s.
		Input Format: Input from stdin will be processes as follows and passed to the function The first line contains a string s. The second line contains a string t.

		Sample Input 0:
		I am using HackerRank to improve programming
		am HackerRank to improve

		Sample Output 0:
		I
		using
		programming

		Explanation 0:
		The missing words are:
		1. I
		2. using
		3. programming

		We add these words in order to the array ["I", "using", "programming"], then return this array as our answer. 

		Sample Input 1:
		I love programming
		programming

		Sample Output 1:
		I
		love

		Explanation 1:
		The missing words are:
		1. I
		2. love

		We add these words in order to the array ["I", "love"], then return this array as our answer. 


5. Distinct Pairs
		In this challenge, you wi;ll be given an array of integers and a target value.
		Determine the number of distinct pairs of elements in the array that sum up to the target value.
		Two pairs (a, b) and (c, d) are considered to be distinct if and only if the values in sorted order do not match i.e. (1, 9) and (9, 1) are indistinct but (1, 9) and (9, 2) are distinct.

		For Example, given the array [1, 2, 3, 6, 7, 8, 9, 1] and a target value of 10, the seven pairs (1, 9), (2, 8), (3, 7), (8, 2), (9, 1), (9, 1) and (1, 9) all sum to 10 and there are only three distinct pairs: (1, 9), (2, 8), and (3, 7).

		Function Description: Complete the function numberOfPairs in the editor below.
		The function must return an integer, the total number of distinct pairs of elements in the array that sum to the target value.

		numberOfPairs has the following parameter(s):

		a[a[0], ..., a[n-1]]: an array of integers to select the pairs from.
		Constraints:

		1 <= n <= 5 x 10^5
		0 <= a[i] <= 10^9
		0 <= k <= 5 x 10^9
		Input Format for Custom Testing

		The first line contains an integer n, the size of the array a.
		The next n lines each contain an element a[i] where 0 <= i < n.
		The next line contains an integer k, the target value.
		Input Sample Input 0: 6 1 3 46 1 3 9 47

		Sample Output 0:
		1

		Explanation 0:
		a = [1, 3, 46, 1, 3, 9]
		There are 4 pairs of unique elements where a[i]+a[j] = k:

		1. (a[0] = 1, a[2] = 46)
		2. (a[2] = 46, a[0] = 1)
		3. (a[2] = 46, a[3] = 1)
		4. (a[3] = 1, a[2] = 46)
		In the list above, all four pairs contain the same values.  
		We only have 1 distinct pair (1, 46).

6. Stock Analysis
		In data analysis, the eliminate algorithm determines the single final value to use for each data parameter.
		The eliminate algorithm works in the following way:

		Data is acquired from multiple sources in order from least to most preferred, i.e. If a parameter Pi is present in both source 1 and source 2, the parameter from the higher priority source, source 2, is used in the final parameter list, and any value from an earlier source is superseded.
		As new parameters arrive, they are added to the list.
		If a parameter Pi is present only in one of the sources, it is directly added to the final parameter list. Hence,
		The result of performing the above operations until all the parameters from source 1 and source 2 are exhausted is the result of Eliminate-algorithm(source 1, source 2).
		Each time a new value for a parameter is encountered from a higher preferred site, the old data is superseded.
		Assuming three sources S1, S2, and S3.
		Eliminate-algorithm(S1, S2, S3) = Eliminate-algorithm(Eliminate-algorithm(S1, S2), S3)
		Given a list of sources S1, S2, ..., Sn, find the final parameter list given by Eliminate-algorithm(S1, S2, .., Sn). Maintain your result in the order a key was first encountered.

		For example, a rating parameter of buy, sell or hold from three sources in increasing order of preference: [buy, sell, hold], where buy is from S1, immediately superseded by sell S2, immediately superseded by hold S3.
		The final rating is the only one that hasn't been superseded, so you use "hold" as the final rating.

		Function Description: Complete the function computeParameterValue in the editor below.
		The function must return an array of strings that denotes the final parameter list values in the order their keys were first encountered.

		computeParameterValue has following parameter(s): sources: A 2-dimensional array of key:value pairs, each row is one source's data, sources presented from lowest to highest preference.

		Constraints:

		1 <= n < 100
		1 <= p < 1000
		Input Format for Custom Testing

		The first line contains a positive integer n, the number of sources.
		The next line contains a positive integer p, denoting the number of parameters of each source.
		Each of the next n lines contains an array of p space-separated strings of formate key:value, denoting the key and value of source[i] parameters.
		Input

		Sample Input 0:
		2
		3
		P1:a P3:b P5:x
		P1:b P2:q P5:x

		Sample Output 0:
		b
		b
		x
		q

		Explanation 0:
		Final parameter list:
		- P1 b (Source 2)
		- P3 b (Source 1)
		- P5 x (Source 2)
		- P2 q (Source 2)  

7. K-Subsequences
		We define a k-subsequence of an array as follows:

		It is a subsequence of contiguous elements in the array, i.e. a subarray.
		The sum of the subsequence's elements, s, is evenlt divisible by k (i.i: s % k = 0).
		Given an array of integers, determine the number of k-subsequences it contains.
		For example k = 5 and the array nums = [5, 10, 11, 9, 5].
		The 10 k-subsequences are: {5}, {5, 10}, {5, 10, 11, 9}, {5, 10, 11, 9, 5}, {10}, {10, 11, 9}, {10, 11, 9, 5}, {11, 9}, {11, 9, 5}, {5}.

		Function Description: Complete the function kSub in the editor below.
		The function must return an long integer that represents the number of k-subsequences.

		kSub has following parameter(s):

		k: an integer that the sum of the subsequence must be divisible by
		nums[nums[0], ..., nums[n-1]]: an array of integers
		Constraints:

		1 <= n <= 3 x 10^5
		1 <= k <= 100
		1 <= nums[i] <= 10^4
		Input Format for Custom Testing

		The first line contains an integer k, the number the sum of the subsequence must be divisible by.
		The next line contains an integer n, that denotes the number of elements in nums.
		Each line i of the n subsequent lines (where 0 <= i < n) contains an integer that describes nums[i].
		Input

		Sample Input 0:
		3
		5
		1
		2
		3
		4
		1

		Sample Output 0:
		4

		Explanation 0:
		The 4 contiguous subsequences of nums having sums that are evenly divisible be k = 3 are:
		{3}, {1, 2}, {1, 2, 3}, {2, 3, 4}



Just completed it (and got it earlier today). First one I had was a file I/O problem (make sure you know how to read/write in a language of your choice). It was pretty easy, just ugly input that required string manipulations. The second question was a more standard algorithm question with subsequences, also not bad. Timing shouldn't be an issue for either one unless you have some obscene nested loops. Feel free to PM me for any questions





