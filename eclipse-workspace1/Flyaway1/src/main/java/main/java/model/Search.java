package main.java.model;

public abstract class Search {
	 public static String date;
	    public static String source;
	    public static String destination;
	    public static int persons;

	    public static String getQuery() {
	        return "SELECT * FROM flight WHERE source = '"+source+"' AND destination='"+destination+"' AND date_of_travel='"+date+"'";

}
}