package com.uws.saa.lab2.exammarks;
public class ExamMarksTest {
	final int NUMBER_OF_QUESTIONS = 4;
    final int PASS_MARK=40;
    final int MERIT_MARK=70;
    final int MAXIMUM_MARK=25;
	public static void main(String[] args) {
        int[] examMarks;
        Integer questionMark;
        ExamMarksTest demo = new ExamMarksTest();
        do{
        	examMarks = demo.queryUserForMarks();
        	int grade = demo.getOverallExamMark(examMarks);
        	System.out.println("The Student grade is"+grade);
        	
        	String stundentResult = demo.categoriseMark(grade);
        	System.out.println("The Student Result is"+stundentResult);
        	
        	
            
        }while(Repeat.repeat());
    }
    
    public int getOverallExamMark(int[] individualMarks) {
    	int sum = 0;
    	
    	for (int i = 0; i < individualMarks.length; i++) {
    		sum += individualMarks[i];
    	}
    	return sum;
    }
    
    public String categoriseMark(int examMark) {
    	String output = "";
    	if(examMark>=PASS_MARK) {
    		if(examMark>=MERIT_MARK) {
    			output =  "Passed with Merit";
    		}
            else {
            	output = "passed";
            }  
        }
    	else {
    		output = "failed";
    	}
    	return output;
    }
    
    public int[] queryUserForMarks() {
    	int[] examMarks = new int[4];
    	examMarks[0] = Input.getInteger("mark for question 1:");
    	examMarks[1] = Input.getInteger("mark for question 2:");
    	examMarks[2] = Input.getInteger("mark for question 3:");
    	examMarks[3] = Input.getInteger("mark for question 4:");
    	return examMarks;
    }
}
