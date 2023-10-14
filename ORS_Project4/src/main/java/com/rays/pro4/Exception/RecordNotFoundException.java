package com.rays.pro4.Exception;
/**
 * RecordNotFoundException thrown when a record not found occurred.
 * 
 * @author Shubham Geete
 * 
 */
public class RecordNotFoundException extends Exception {
	public RecordNotFoundException(String msg){
		super(msg);
	}
}
